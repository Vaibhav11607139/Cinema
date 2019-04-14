package com.example.vaibhav.cinema;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vaibhav.cinema.Database.Database_Class;

import java.util.ArrayList;
import java.util.Collections;

public class Login_Activity extends AppCompatActivity {
    TextInputEditText loginemail,loginpassword;
    Button login,createnew;
    ArrayList<String> arrayListemail=new ArrayList<String>();
    ArrayList<String> arrayListpassword=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        loginemail=findViewById(R.id.loginemail);
        loginpassword=findViewById(R.id.loginpassword);
        login=findViewById(R.id.loginaccount);
        createnew=findViewById(R.id.createnewaccount);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(loginemail.getText().toString())){
                    if(isValidEmail(loginemail.getText().toString()))
                    {
                        if(!TextUtils.isEmpty(loginpassword.getText().toString()))
                        {
                            //Toast.makeText(Login_Activity.this, "Everything is Fine", Toast.LENGTH_SHORT).show();
                            Database_Class database_class=new Database_Class(Login_Activity.this);
                            Cursor c=database_class.getData();
                           // StringBuffer stringBuffer=new StringBuffer();


                            while (c.moveToNext())
                            {
                                arrayListemail.add(c.getString(2));
                                //  stringBuffer.append(c.getString(0)+"\n");
                                arrayListpassword.add(c.getString(4));

                            }
                            if(arrayListemail.contains((loginemail.getText().toString())))
                            {
                                if(arrayListpassword.contains(loginpassword.getText().toString()))
                                {
                                    My_Utiity.useremails=loginemail.getText().toString();
                                    My_Utiity.logintest=true;
                                  //  Toast.makeText(Login_Activity.this, "sahi hai Bilkul", Toast.LENGTH_SHORT).show();
                                   if(!My_Utiity.loginfinal)
                                   {
                                       Intent intent=new Intent(Login_Activity.this,MainActivity.class);

                                       startActivity(intent);
                                       Toast.makeText(Login_Activity.this, "Logged in Succesfully", Toast.LENGTH_SHORT).show();
                                   }else
                                   {
                                       My_Utiity.loginfinal=true;
                                       final ProgressDialog progressDoalog = new ProgressDialog(Login_Activity.this);
                                       // progressDoalog.setMax(100);
                                       progressDoalog.setMessage("Please Wait for few moments");
                                       progressDoalog.setTitle("Processing Transaction");
                                       progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                                       progressDoalog.show();
                                       Handler handler=new Handler();
                                       handler.postDelayed(new Runnable() {
                                           @Override
                                           public void run() {
                                               progressDoalog.dismiss();
                                               Intent intent=new Intent(Login_Activity.this,FinalActivity.class);
                                               startActivity(intent);

                                           }
                                       },3000);

//                                       Toast.makeText(Login_Activity.this, "Booked Succesfully", Toast.LENGTH_SHORT).show();
//                                       Intent intent=new Intent(Login_Activity.this,FinalActivity.class);
//
//                                       startActivity(intent);


                                   }

                                }else
                                {
                                    loginpassword.setError("Invalid Password");
                                }

                            }
                            else {
                                loginemail.setError("Not Registered Email");
                            }

//                            AlertDialog.Builder builder = new AlertDialog.Builder(Login_Activity.this).setMessage(stringBuffer).setTitle("Read");
//                            builder.show();


                        }else
                        {
                            loginpassword.setError("This field is required");
                        }

                    }else
                        loginemail.setError("This email is Invalid");

                    }else
                {
                      loginemail.setError("This field is required");
                }
            }
        });
        createnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login_Activity.this,Registration_Activity.class);
                startActivity(intent);
            }
        });



    }
    public boolean isValidEmail(String email)
    {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
