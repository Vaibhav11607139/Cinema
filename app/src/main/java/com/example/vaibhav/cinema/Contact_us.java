package com.example.vaibhav.cinema;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contact_us extends AppCompatActivity {
    TextInputEditText  textInputEditText;
    Button send,call,website;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        textInputEditText=findViewById(R.id.contactus_edittext);
        send=findViewById(R.id.contactus_send);
        call=findViewById(R.id.contactus_Call);
        website=findViewById(R.id.contactus_website);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"vaibhavparashar10@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Query");
                intent.putExtra(Intent.EXTRA_TEXT,textInputEditText.getText().toString());
                startActivity(intent.createChooser(intent,"Click One of this to Send"));


            }

        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917986434796"));
                startActivity(intent);
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com"));
                Toast.makeText(Contact_us.this, "Connecting you to Our Website", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();
        return true;
    }




    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}
