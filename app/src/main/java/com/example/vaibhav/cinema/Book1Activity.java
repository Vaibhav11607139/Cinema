package com.example.vaibhav.cinema;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.vaibhav.cinema.R.color.lightblue;
import static com.example.vaibhav.cinema.R.drawable.button2;

public class Book1Activity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    Button today,tomm;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    int[] a = {1,1};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking1_main);
        imageView = findViewById(R.id.imageView);
        Intent i = getIntent();
        int image = i.getIntExtra("image",0);
       fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framemain,new Fragment_Today(),"Today");
      fragmentTransaction.commit();
        textView = findViewById(R.id.textView);
        textView.setText(i.getStringExtra("name"));
        imageView.setImageResource(image);
        today = findViewById(R.id.today);
        today.setBackgroundResource(R.drawable.button4);
        My_Utiity.dayselected="Today";
        today.setTextColor(Color.WHITE);
        tomm=findViewById(R.id.tomm);
        today.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                My_Utiity.dayselected="Today";
                if(a[0]==0)
                {
                    today.setBackgroundResource(R.drawable.button2);
                    today.setTextColor(R.color.lightblue);
                    a[0]=1;
                }
                else {
                    tomm.setBackgroundResource(R.drawable.button2);
                    tomm.setTextColor(R.color.lightblue);
                    a[1] = 1;
                    today.setBackgroundResource(R.drawable.button4);
                    today.setTextColor(Color.WHITE);
                    FragmentManager fragmentManager=getSupportFragmentManager();
                     FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.framemain, new Fragment_Today(),"Today");
                    fragmentTransaction.commit();
                }

            }
        });

        tomm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                My_Utiity.dayselected="Tommorow";
                if(a[1]==0)
                {
                    tomm.setBackgroundResource(R.drawable.button2);
                    tomm.setTextColor(R.color.lightblue);
                    a[1]=1;
                }
                else
                {
                    tomm.setBackgroundResource(R.drawable.button4);
                    tomm.setTextColor(Color.WHITE);
                    today.setBackgroundResource(R.drawable.button2);
                    today.setTextColor(R.color.lightblue);
                    a[0]=1;
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    //fragmentTransaction.add(R.id.framemain,new Fragment_Tomm(),"Tommorow");
                   // fragmentManager.beginTransaction();
                  fragmentTransaction.replace(R.id.framemain,new Fragment_Tomm(),"Tommorow");
                    fragmentTransaction.commit();

                }


            }
        });

    }
}
