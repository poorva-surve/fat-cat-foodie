package com.android.fcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class RecipeDetails extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    TextView title,cals,servings,time,skill,ingr,cook,uploader,uploaderLabel,calsLabel;
    Button shr , bkm;
    String share_content;
    String rectitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);
        Intent startingIntent = getIntent();
        String myTitle = startingIntent.getStringExtra("title");    //FETCHING RECIPE NAME FROM RECIPE LIST

        title=findViewById(R.id.rec_title);
        servings=findViewById(R.id.rec_serv);
        time=findViewById(R.id.rec_time);
        skill=findViewById(R.id.rec_skill);
        calsLabel=findViewById(R.id.calories_label);
        cals=findViewById(R.id.rec_cals);
        ingr=findViewById(R.id.rec_ingr);
        cook=findViewById(R.id.rec_cook);
        uploaderLabel = findViewById(R.id.uploader_label);
        uploader=findViewById(R.id.rec_uploader);

        shr=findViewById(R.id.rec_share);
        bkm = findViewById(R.id.rec_bkmk);

        //FETCHING RECIPE DATA AS A LIST
        ArrayList<String> result = helper.view_recipe(myTitle);

        //CONVERTING RECIPE DATA ITEMS INTO STRING VALUES FOR DISPLAY PURPOSE
        String r0=result.get(0); //name
        String r1=result.get(1); //servings
        String r2=result.get(2); //time
        String r3=result.get(3); //skill
        String r4=result.get(4); //calories
        String r5=result.get(5); //ingr
        String r6=result.get(6); //method
        String r7=result.get(7); //uploader
        //String r8=result.get(8); //veg

        //ASSIGNING STRING VALUES TO TEXT VIEWS
        title.setText(r0.toUpperCase());
        servings.setText(r1);
        time.setText(r2);
        skill.setText(r3);
        //cals.setText(r4);
        ingr.setText(r5);
        cook.setText(r6);

        if (r4.equals("-1")){
            calsLabel.setVisibility(View.GONE);
            cals.setVisibility(View.GONE);
        }else {
            cals.setText(r4);
        }


        if (r7.equals("FCF")){
            uploaderLabel.setVisibility(View.GONE); //GONE DOES NOT OCCUPY SPACE IN THE LAYOUT UNLIKE INVISIBLE
            uploader.setVisibility(View.GONE);
        }else {
            uploader.setText(r7);
        }

        rectitle = title.getText().toString();

        //SHARE RECIPE BUTTON
        share_content = r0+"\n\nIngredients:\n"+r5+"\n\nDirections:\n"+r6;
        shr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shr_recipe();
            }
        });

        //CHECK WHETHER RECIPE IS ALREADY BOOKMARKED
        boolean bkmk = helper.bkmkExists(myTitle);
        if(bkmk)
            bkm.setText("Remove from Bookmarks");
        else
            bkm.setText("Add to Bookmarks");

        //ADD TO BOOKMARKS BUTTON
        bkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean r = helper.addBkmk(myTitle);
                if(r) {
                    Toast.makeText(getApplicationContext(), "Added to bookmarks", Toast.LENGTH_SHORT).show();
                    bkm.setText("Remove from Bookmarks");
                }
                else{
                    helper.deleteBookmark(myTitle);
                    Toast.makeText(getApplicationContext(),"Deleted from bookmarks",Toast.LENGTH_SHORT).show();
                    bkm.setText("Add to Bookmarks");
                }
            }
        });

    }

    //METHOD CALLED TO SHARE RECIPE
    public void shr_recipe()
    {
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey try this new recipe!\n\n"+share_content);
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, "Share via"));
    }


}
