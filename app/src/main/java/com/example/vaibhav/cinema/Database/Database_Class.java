package com.example.vaibhav.cinema.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database_Class extends SQLiteOpenHelper {
    public static final String DataBase_Name = "cinema.db";
    public static final String User_Table_Name = "Register_user";
    public Database_Class(Context context) {
        super(context, DataBase_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + User_Table_Name + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,EMAIL TEXT,MOBILE_NUMBER text, PASSWORD TEXT)");
        insert_data("vaibhav","vaibhav10@gmail.com","7986434796","VP",sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean insert_data(String name, String email, String Mobile, String password,SQLiteDatabase sqLiteDatabase)
    {

        ContentValues contentValues = new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("EMAIL",email);
        contentValues.put("MOBILE_NUMBER",Mobile);
        contentValues.put("PASSWORD",password);

        long i = sqLiteDatabase.insert(User_Table_Name,null,contentValues);
        if (i==-1)
        return false;
        else
            return true;
    }
    public Cursor getData(){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("select * from "+User_Table_Name,null);
        return cursor;
    }
    public Cursor getSpecificData(String string)
    {
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("select * from "+User_Table_Name+" where email=?",new String[]{string});
        return cursor;
    }

}
