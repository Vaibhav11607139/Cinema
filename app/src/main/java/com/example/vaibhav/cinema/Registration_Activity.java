package com.example.vaibhav.cinema;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vaibhav.cinema.Database.Database_Class;

public class Registration_Activity extends AppCompatActivity {
    EditText name,emailid,mobileno,password,confirmpassword;
    Button createaccount;
    TextView login,show;
    boolean f = true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_activity);
        name = findViewById(R.id.name);
        emailid=findViewById(R.id.email);
        mobileno=findViewById(R.id.mobileno);
        password=findViewById(R.id.password);
        confirmpassword=findViewById(R.id.confirmpassword);
        createaccount=findViewById(R.id.createaccount);
        login=findViewById(R.id.loginexisting);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Registration_Activity.this,Login_Activity.class);
                startActivity(intent);
            }
        });
//        show = findViewById(R.id.show);
//        show.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(!f)
//                {
//                    password.setInputType( InputType.TYPE_TEXT_VARIATION_PASSWORD|InputType.TYPE_CLASS_TEXT );
//                    show.setText("show");
//                    f=true;
//                }
//                else
//                {
//                    password.setInputType(InputType.TYPE_CLASS_TEXT);
//                    show.setText("hide");
//                    f=false;
//                }
//            }
//        });
       createaccount.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


                  // Toast.makeText(Registration_Activity.this, "Field is Empty", Toast.LENGTH_SHORT).show();






           if(!TextUtils.isEmpty(name.getText().toString()))
           {
               if(!TextUtils.isEmpty(emailid.getText().toString()))
               {
                   if(isValidEmail(emailid.getText().toString())) {
                       if(!TextUtils.isEmpty(mobileno.getText().toString()))
                       {
                           if((mobileno.getText().toString().length() ==10))
                           {
                               if(!TextUtils.isEmpty(password.getText().toString()))
                               {
                                   if(!TextUtils.isEmpty(confirmpassword.getText().toString()))
                                   {
                                       if(password.getText().toString().equalsIgnoreCase(confirmpassword.getText().toString())){

                                           Database_Class database = new Database_Class(Registration_Activity.this);
                                           SQLiteDatabase sqLiteDatabase = database.getWritableDatabase();
                                           boolean b = database.insert_data(name.getText().toString(),emailid.getText().toString(),mobileno.getText().toString(),password.getText().toString(),sqLiteDatabase);
                                           if(b) {
                                               Toast.makeText(Registration_Activity.this, "Account Created Successfully", Toast.LENGTH_SHORT).show();
                                               Intent intent=new Intent(Registration_Activity.this,Login_Activity.class);
                                               startActivity(intent);
                                           }
                                           else
                                               Toast.makeText(Registration_Activity.this, "Not Inserted", Toast.LENGTH_SHORT).show();



                                       }
                                       else
                                           confirmpassword.setError("Password Does not Match");
                                   }
                                   else
                                       confirmpassword.setError(getString(R.string.error_field_required));
                               }
                               else
                                   password.setError(getString(R.string.error_field_required));
                           }
                           else
                               mobileno.setError(getString(R.string.error_invalid_no));
                       }
                       else
                           mobileno.setError(   getString(R.string.error_field_required));
                   }
                   else
                        emailid.setError(getString(R.string.error_invalid_email));
               }
               else
                   emailid.setError(getString(R.string.error_field_required));
           }
           else
           {
               name.setError(getString(R.string.error_field_required));
           }








           }
       });



    }
    public boolean isValidEmail(String email)
    {
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
    public boolean isValidp(String p)
    {
        return (!TextUtils.isEmpty(p) && Patterns.PHONE.matcher(p).matches());
    }
}
