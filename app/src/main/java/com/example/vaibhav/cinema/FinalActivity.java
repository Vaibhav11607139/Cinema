package com.example.vaibhav.cinema;

import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.vaibhav.cinema.Database.Database_Class;

public class FinalActivity extends AppCompatActivity {
    Button button;
    TextView dayfinal,timefinal,namefinal,emailfinal,amountfinal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_activity);
        button=findViewById(R.id.gotohome);
        dayfinal=findViewById(R.id.dayfinal);
        timefinal=findViewById(R.id.timefinal);
        namefinal=findViewById(R.id.namefinal);
        emailfinal=findViewById(R.id.emailfinal);
        amountfinal=findViewById(R.id.amountfinal);


        dayfinal.setText(My_Utiity.dayselected);
        timefinal.setText(My_Utiity.timeselected);
//        namefinal.setText(My_Utiity.nameuser);
//        emailfinal.setText(My_Utiity.emailuser);
        Database_Class database_class=new Database_Class(FinalActivity.this);
        Cursor c=database_class.getSpecificData(My_Utiity.useremails);
        while (c.moveToNext())
        {
           namefinal.setText(c.getString(1));
           emailfinal.setText(c.getString(2));


        }

        amountfinal.setText(My_Utiity.amounttotal+"");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FinalActivity.this,MainActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        final ProgressDialog progressDoalog = new ProgressDialog(FinalActivity.this);
        // progressDoalog.setMax(100);
        progressDoalog.setMessage("Please Wait for few moments");
        progressDoalog.setTitle("Redirecting to Home Page");
        progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDoalog.show();
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDoalog.dismiss();
                Intent intent=new Intent(FinalActivity.this,MainActivity.class);
                startActivity(intent);

            }
        },1500);


    }
}
