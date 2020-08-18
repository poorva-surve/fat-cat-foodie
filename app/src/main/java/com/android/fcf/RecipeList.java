package com.android.fcf;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class RecipeList extends AppCompatActivity {

    DatabaseHelper helper=new DatabaseHelper(this);

    View focusView = null;

    SearchView searchView;
    ListView myLV;
    ArrayList<String> list, snfList;
    ArrayAdapter<String> adapter;

    LinearLayout snf;
    Spinner sorter,filter;

    String[] sort_options = {"Name","Time","Servings","Calories"};
    String[] filter_options = {"None","Veg.","Non-Veg."};

    String sort_or="";
    String filter_op="";
    String cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        //SORTER & FILTER LAYOUT
        snf = findViewById(R.id.sortnfilter);

        myLV = findViewById(R.id.recipeTitles);
//        Bundle bundle = getIntent().getExtras();      --------STOPS THE APP!!!
//        String cat = bundle.getString("category");
        Intent startingIntent = getIntent();
        //FETCHING CATEGORY OF RECIPES FROM HOMEPAGE
        cat = startingIntent.getStringExtra("category");

        if (cat.equals("Bookmark")) {
            list = helper.showBookmarks();

            //IF NO BOOKMARKS, DISPLAY ALERT
            if (list.isEmpty()){
                AlertDialog.Builder alert = new AlertDialog.Builder(RecipeList.this);
                alert.setTitle("No recipes found");
                alert.setMessage("You haven't bookmarked any recipe yet!\nAdd your favourite recipe to bookmarks and find them here anytime easily");
                //alert.setPositiveButton("OK", null);
                alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //finish();   //GO BACK TO PREVIOUS PAGE
                        startActivity(new Intent(RecipeList.this,Menu.class));  //GO BACK TO MAIN PAGE
                    }
                });
                alert.show();
            }


            //DISABLE SORT AND FILTER OPTIONS FOR BOOKMARKS
            snf.setVisibility(View.GONE);
        }
        else
            list = helper.showRecipe(cat,"name");

        //CREATE DYNAMIC LIST
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        myLV.setAdapter(adapter);

        //GO TO RECIPE DETAILS PAGE WHEN CLICKED ON A RECIPE NAME
        myLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String val = adapter.getItem(i);
                Intent intent = new Intent(RecipeList.this, RecipeDetails.class);
                intent.putExtra("title", val);
                startActivity(intent);

            }
        });

        //SEARCH BAR
        searchView = findViewById(R.id.rec_search);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if (list.contains(query)) {
                    adapter.getFilter().filter(query);
                }
                else {
                    Toast.makeText(RecipeList.this, "No match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });



    //SORT BY
        sorter= findViewById(R.id.sort);

        ArrayAdapter aa=new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,sort_options);
        aa.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        sorter.setAdapter(aa);

        sorter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    sort_or="name";
                }
                else if (position == 1) {
                    sort_or="time";
                }
                else if (position ==2){
                    sort_or="servings";
                }
                else if (position ==3){
                    sort_or="calories";
                }
                viewFinalRecipes();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //FILTER BY
        filter= findViewById(R.id.filter);
        ArrayAdapter ab=new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,filter_options);
        ab.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        filter.setAdapter(ab);
        filter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 1) {
                    filter_op="veg";
                }
                else if (position == 2) {
                    filter_op="nonveg";
                }
                else
                    filter_op="";

                viewFinalRecipes();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });


        adapter.notifyDataSetChanged();
    }

    //SORTED AND FILTERED RECIPES
    public void viewFinalRecipes(){
        if (filter_op!="") {
            list = helper.showFinalRecipes(cat, sort_or, filter_op);
        }
        else
            list = helper.showRecipe(cat,sort_or);

        if (list.isEmpty()) {
            Toast t = Toast.makeText(RecipeList.this, "No recipe available yet!", Toast.LENGTH_SHORT);
            t.setGravity(Gravity.CENTER,0,0);
            t.show();
        }
        adapter.clear();
        adapter.addAll(list);
        adapter.notifyDataSetChanged();
    }

    //REFRESHES THE ACTIVITY WHEN WE BACK PRESS FROM RECIPE DETAILS. (USED TO UPDATE BOOKMARKS LIST AFTER REMOVING A BOOKMARK)
    @Override
    protected void onRestart() {

        super.onRestart();
        if (cat.equals("Bookmark")) {
            this.recreate();    //onCreate() EXECUTES AGAIN
        }
    }

    //DISPLAY MENU IN BOOKMARKS LIST
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        if (cat.equals("Bookmark")) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.bkmk_menu, menu);
        }
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_remove_bookmarks:

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Remove all bookmarks");
                builder.setMessage("Are you sure you want to delete all existing bookmarks?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        helper.deleteAllBookmarks();
                        adapter.clear();
                        Toast.makeText(getApplicationContext(), "Deleted all bookmarks successfully", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
