package com.android.fcf;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Menu extends AppCompatActivity {

    private Button fridge_btn, tour_btn, budget_btn, quick_btn, meal_btn, snack_btn, sweet_btn,
            healthy_btn, waste_btn, decider_btn, tips_btn, upload_btn;

    //private ShareActionProvider mShareActionProvider;

//    String usermail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//        Intent startingIntent = getIntent();
//        usermail = startingIntent.getStringExtra("usermail");

//        fridge_btn=findViewById(R.id.fridge);
        tour_btn=findViewById(R.id.tour);
        budget_btn=findViewById(R.id.budget);
        quick_btn=findViewById(R.id.quick);
        meal_btn=findViewById(R.id.meal);
        snack_btn=findViewById(R.id.snack);
        sweet_btn=findViewById(R.id.sweet);
        healthy_btn=findViewById(R.id.healthy);
        waste_btn=findViewById(R.id.waste);
//        decider_btn=findViewById(R.id.decider);
        tips_btn=findViewById(R.id.tips);
        upload_btn=findViewById(R.id.upload);
//        fridge_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                open_fridge();
//            }
//        });
        tour_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_tour();
            }
        });
        budget_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_budget();
            }
        });
        quick_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_quick();
            }
        });
        meal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_meal();
            }
        });
        snack_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_snack();
            }
        });
        sweet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_sweet();
            }
        });
        healthy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_healthy();
            }
        });
        waste_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_waste();
            }
        });
//        decider_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                open_decider();
//            }
//        });
       tips_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_tips();
            }
        });
        upload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_upload();
            }
        });

    }

    public void open_tour()
    {
        Intent tour=new Intent(Menu.this,Tour.class);
        startActivity(tour);
    }
    public void open_budget()
    {
        Intent budget=new Intent(Menu.this,Budget.class);
        startActivity(budget);
    }
    public void open_quick()
    {
        Intent quick=new Intent(Menu.this,Quick.class);
        startActivity(quick);
    }
    public void open_meal()
    {
        Intent meal=new Intent(Menu.this,Meal.class);
        startActivity(meal);
    }
    public void open_snack()
    {
        Intent snack=new Intent(Menu.this,Snack.class);
        startActivity(snack);
    }
    public void open_sweet()
    {
        Intent sweet=new Intent(Menu.this,Sweet.class);
        startActivity(sweet);
    }
    public void open_healthy()
    {
        Intent healthy=new Intent(Menu.this,Healthy.class);
        startActivity(healthy);
    }
    public void open_waste()
    {
        Intent waste=new Intent(Menu.this,Waste.class);
        startActivity(waste);
    }
    public void open_tips()
    {
        Intent tips=new Intent(Menu.this,TipListActivity.class);
        startActivity(tips);
    }
    public void open_upload()
    {
        Intent upload=new Intent(Menu.this,Upload.class);
        startActivity(upload);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_menu,menu);

//        // Inflate menu resource file.
//        getMenuInflater().inflate(R.menu.menu_home, menu);

//        // Locate MenuItem with ShareActionProvider
        //MenuItem item = menu.findItem(R.id.share_app);

//        // Fetch and store ShareActionProvider
        //mShareActionProvider = (ShareActionProvider) item.getActionProvider();

//        // Return true to display menu
        return true;

    }
//    private void setShareIntent(Intent shareIntent) {
//        if (mShareActionProvider != null) {
//            mShareActionProvider.setShareIntent(shareIntent);
//        }
//    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
//            case R.id.action_update:
//                Intent profile=new Intent(Menu.this,MyProfile.class);
//                profile.putExtra("usermail",usermail );
//                startActivity(profile);
//                return true;
            case R.id.action_bookmarks:
                Intent showBookmarks = new Intent(Menu.this,RecipeList.class);
                showBookmarks.putExtra("category","Bookmark");
                startActivity(showBookmarks);
                return true;
//            case R.id.action_uploads:
//                Intent upl=new Intent(Menu.this,MyRecipes.class);
//                startActivity(upl);
//                return true;
            case R.id.action_feedback:
                Intent feed=new Intent(Menu.this,Feedback.class);
                startActivity(feed);
                return true;
            case R.id.share_app:
//                Intent sendIntent = new Intent(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, "Hi... I think you would like this new recipe app i found --\nFat Cat Foodie!" +
//                        "\n\nInstall it and unleash the foodie in you! ");
//                sendIntent.setType("text/plain");
//                startActivity(Intent.createChooser(sendIntent, "Share via"));
                shareApplication();
//                ApplicationInfo app = getApplicationContext().getApplicationInfo();
//                String apkPath = app.sourceDir;
//                Intent shareapp = new Intent(Intent.ACTION_SEND);
//                shareapp.setType("*/*");
//                shareapp.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkPath)));
//                startActivity(Intent.createChooser(shareapp, "Share via"));
                return true;
            case R.id.action_about:
                Intent about=new Intent(Menu.this,About.class);
                startActivity(about);
                return true;
//            case R.id.action_logout:
//                Intent logout=new Intent(Menu.this,Welcome.class);
//                startActivity(logout);
//                return true;
            case R.id.action_exit:
//                finishAffinity();
                Intent exit = new Intent(Intent.ACTION_MAIN);
                exit.addCategory(Intent.CATEGORY_HOME);
                startActivity(exit);
        }
        return super.onOptionsItemSelected(item);
    }

    private void shareApplication() {

        ApplicationInfo app = getApplicationContext().getApplicationInfo();
        String filePath = app.sourceDir;
        Intent intent = new Intent(Intent.ACTION_SEND);

        // MIME of .apk is "application/vnd.android.package-archive".
        // but Bluetooth does not accept this. Let's use "*/*" instead.
        intent.setType("*/*");

        // Append file and send Intent
        File originalApk = new File(filePath);

        try {
            //Make new directory in new location
            File tempFile = new File(getExternalCacheDir() + "/ExtractedApk");
            //If directory doesn't exists create new
            if (!tempFile.isDirectory())
                if (!tempFile.mkdirs())
                    return;
            //Get application's name and convert to lowercase
            tempFile = new File(tempFile.getPath() + "/" + getString(app.labelRes).replace(" ","").toLowerCase() + ".apk");
            //If file doesn't exists create new
            if (!tempFile.exists()) {
                if (!tempFile.createNewFile()) {
                    return;
                }
            }
            //Copy file to new location
            InputStream in = new FileInputStream(originalApk);
            OutputStream out = new FileOutputStream(tempFile);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
            System.out.println("File copied.");
            //Open share dialog
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
            startActivity(Intent.createChooser(intent, "Share app via"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
