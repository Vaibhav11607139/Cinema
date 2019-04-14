package com.example.vaibhav.cinema;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.vaibhav.cinema.Database.Database_Class;

public class My_Account extends AppCompatActivity {
    EditText profilename,profileemail,profilenumber;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_account);
        profilename=findViewById(R.id.profilename);
        profileemail=findViewById(R.id.profileemail);
        profilenumber=findViewById(R.id.profilnumber);
        Database_Class database_class=new Database_Class(My_Account.this);
        Cursor c=database_class.getSpecificData(My_Utiity.useremails);
        while (c.moveToNext())
        {
            profilename.setText(c.getString(1));
            profileemail.setText(c.getString(2));
            profilenumber.setText(c.getString(3));


        }
    }
}
