package com.android.fcf;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, 1);
    }

    public static final String DB_NAME = "myrecipes.db";
    public static final String TABLE_RECIPES = "recipes";
    public static final String TABLE_BOOKMARKS = "bookmarks";

    //public static final String TABLE_UPLOADS = "uploads";


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //CREATING TABLES

        sqLiteDatabase.execSQL(
                "create table recipes(" +
                        "id text primary key," +
                        "name text not null," +
                        "ingredients text not null," +
                        "method text not null," +
                        "category text not null," +
                        "veg text," +
                        "servings integer," +
                        "time integer not null," +
                        "skill text," +
                        "calories integer," +
                        "uploader text" +
                        ")");

        sqLiteDatabase.execSQL(
                "create table bookmarks (name text primary key)");

        /*
        sqLiteDatabase.execSQL(
                "create table uploads(" +
                        "name text not null," +
                        "ingredients text not null," +
                        "method text not null," +
                        "servings text," +
                        "time text not null," +
                        "uploader text" +
                        ")");   */
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + TABLE_RECIPES);
        sqLiteDatabase.execSQL("drop table if exists " + TABLE_BOOKMARKS);
    }

    //INSERTING A RECIPE INTO RECIPES TABLE
    public boolean insertData(String id, String name, String ingredients, String method, String category, String veg, int servings, int time, String skill, int calories, String uploader) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put("name", name);
        contentValues.put("ingredients", ingredients);
        contentValues.put("method", method);
        contentValues.put("category", category);
        contentValues.put("veg", veg);
        contentValues.put("servings", servings);
        contentValues.put("time", time);
        contentValues.put("skill", skill);
        contentValues.put("calories", calories);
        contentValues.put("uploader", uploader);
        long isInserted = db.insert(TABLE_RECIPES, null, contentValues);
        if (isInserted == -1)
            return false;
        else
            return true;
    }

    //INSERTING A RECIPE INTO UPLOADS TABLE
    /*
    public boolean uploadRecipe(String name, String ingredients, String method, String servings, String time, String uploader) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("ingredients", ingredients);
        contentValues.put("method", method);
        contentValues.put("servings", servings);
        contentValues.put("time", time);
        contentValues.put("uploader", uploader);
        long isInserted = db.insert(TABLE_UPLOADS, null, contentValues);
        if (isInserted == -1)
            return false;
        else
            return true;
    }
    */

    //USING STRING BUFFER TO DISPLAY DB INFO DYNAMICALLY INTO TEXT VIEW
    /*public void displayRecipe(String rec_id, TextView txt) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor resultSet = db.rawQuery("select * from " + TABLE_RECIPES + " where id = '" + rec_id + "'", null);
        if (resultSet.getCount() == 0) {
            txt.setText("No Records Found");
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            while (resultSet.moveToNext()) {
                stringBuffer.append("Name:\n" + resultSet.getString(1) + "\n\n");
                stringBuffer.append("Ingredients: \n" + resultSet.getString(2) + "\n\n");
                stringBuffer.append("Directions: \n" + resultSet.getString(3) + "\n\n");
                //stringBuffer.append("Category: \n"+resultSet.getString(4)+"\n\n");
                //stringBuffer.append("Veg: \n"+resultSet.getString(5)+"\n\n");
                stringBuffer.append("Servings: \n" + resultSet.getString(6) + "\n\n");
                stringBuffer.append("Time to prepare: \n" + resultSet.getString(7) + "\n\n");
                stringBuffer.append("Skill Level: \n" + resultSet.getString(8) + "\n\n");
                stringBuffer.append("Calories: \n" + resultSet.getString(9) + "\n\n");
                stringBuffer.append("Uploaded by: \n" + resultSet.getString(10) + "\n\n");
            }

            txt.setText(stringBuffer.toString());
        }
    }*/


//    @TargetApi(Build.VERSION_CODES.N)
//    public ArrayList<String> sort_recipes(int option) {
//        if (option == 2) {
//
//        }
//    }

    //DISPLAYING NAMES FROM RECIPES TABLE IN RECIPE LIST PAGE
    public ArrayList<String> showRecipe(String rec_cat,String col_ord) {
        SQLiteDatabase db = this.getReadableDatabase();
        String q = "select name from " + TABLE_RECIPES + " where category = '" + rec_cat + "' order by "+col_ord;
        Cursor cursor = db.rawQuery(q, null);
        ArrayList<String> empty,result;
        empty = new ArrayList<String>();
        result = new ArrayList<String>();

        if(cursor.moveToFirst()) {
            do {
                result.add(cursor.getString(0));
            }while (cursor.moveToNext());
            return result;
        }
        else
            return empty;
    }

    //SORT AND FILTER TOGETHER
    public ArrayList<String> showFinalRecipes(String rec_cat,String rec_order,String rec_filter) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select name from " + TABLE_RECIPES +
                " where veg = '"+rec_filter+"' and category = '"+rec_cat+"' order by "+rec_order, null);
        ArrayList<String> empty,result;
        empty = new ArrayList<String>();
        result = new ArrayList<String>();
        if(cursor.moveToFirst()) {
            do {
                result.add(cursor.getString(0));
            }while (cursor.moveToNext());
            return result;
        }
        else
            return empty;
    }
    //CALLED IN RECIPE DETAILS PAGE TO FETCH ALL DATA OF MENTIONED RECIPE NAME
    public ArrayList<String> view_recipe(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        String q = "select name,servings,time,skill,calories,ingredients,method,uploader,veg from "+TABLE_RECIPES+" where name='"+name+"'";
        Cursor cursor = db.rawQuery(q, null);
        ArrayList<String> a, b;
        a = new ArrayList<String>();
        b = new ArrayList<String>();

        if (cursor.moveToFirst()) {
            do {
                a.add(cursor.getString(0));
                a.add(cursor.getString(1));
                a.add(cursor.getString(2));
                a.add(cursor.getString(3));
                a.add(cursor.getString(4));
                a.add(cursor.getString(5));
                a.add(cursor.getString(6));
                a.add(cursor.getString(7));
                a.add(cursor.getString(8));
            } while (cursor.moveToNext());
            return a;
        } else
            return b;
    }

//    public void addBkmk(String name) {
//        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
//        sqLiteDatabase.execSQL("insert into bookmarks select * from recipes where name = '"+name+"'");
//    }     -------- QUERY CAUSES ERRORS

    //CALLED IN RECIPE DETAILS TO ADD BOOKMARK
    public boolean addBkmk( String name)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        long isInserted = db.insert(TABLE_BOOKMARKS, null, contentValues);
        if (isInserted == -1)
            return false;
        else
            return true;
    }

    //CALLED IN RECIPE DETAILS TO CHECK WHETHER A RECIPE IS ALREADY BOOKMARKED
    public boolean bkmkExists(String title){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select name from " + TABLE_BOOKMARKS + " where name = '" + title + "'", null);
        if(cursor.moveToFirst())
            return true;
        else
            return false;
    }

    //CALLED IN RECIPE LIST TO DISPLAY NAMES OF ONLY BOOKMARKED RECIPES
    public ArrayList<String> showBookmarks() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select name from " + TABLE_BOOKMARKS , null);
        ArrayList<String> empty,result;
        empty = new ArrayList<String>();
        result = new ArrayList<String>();
        if(cursor.moveToFirst()) {
            do {
                result.add(cursor.getString(0));
            }while (cursor.moveToNext());
            return result;
        }
        else{
            return empty;
        }
    }

    //CALLED IN RECIPE DETAILS TO REMOVE RECIPE FROM BOOKMARKS
    public void deleteBookmark(String name)
    {
        this.getWritableDatabase().delete("bookmarks","name='"+name+"'",null);
    }

    //REMOVE ALL BOOKMARKS
    public void deleteAllBookmarks()
    {
        this.getWritableDatabase().delete("bookmarks",null,null);
    }

}
