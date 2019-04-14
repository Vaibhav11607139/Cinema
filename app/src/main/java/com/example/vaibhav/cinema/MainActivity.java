package com.example.vaibhav.cinema;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vaibhav.cinema.Database.Database_Class;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ArrayList<RecycleItemAdd> recycleItemAdds;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    TextView username,useremail;
    ImageView dp;
    Button loginmain2,registermain2;
    DrawerLayout drawer;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(My_Utiity.loginfinal||My_Utiity.logintest)
        {
            setContentView(R.layout.activity_main);
        }else
        {
            setContentView(R.layout.activity_main2);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView=findViewById(R.id.recyclerView);
        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_call_missed_black_24dp);
//
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(),MainActivity.class));
//            }
//        });
//


      if(My_Utiity.logintest||My_Utiity.loginfinal)
      {  drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
          ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                  this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
          drawer.addDrawerListener(toggle);
          toggle.syncState();
          //   getSupportActionBar().setDisplayShowHomeEnabled(true);
          navigationView = (NavigationView) findViewById(R.id.nav_view);
          navigationView.setNavigationItemSelectedListener(this);
          View view=getLayoutInflater().inflate(R.layout.nav_header_main,null);
          username= view.findViewById(R.id.userneme);
          useremail=view.findViewById(R.id.useremail);
          dp=view.findViewById(R.id.imageViewnav);

          navigationView.addHeaderView(view);

              Database_Class database_class=new Database_Class(MainActivity.this);
              Cursor c=database_class.getSpecificData(My_Utiity.useremails);
              while (c.moveToNext())
              {
                  My_Utiity.nameuser=c.getString(1);
                  My_Utiity.emailuser=c.getString(2);
                  username.setText(c.getString(1));
                  useremail.setText(c.getString(2));
                  dp.setImageResource(R.drawable.ic_mood_black_24dp);

              }



      }else
      {
          drawer = (DrawerLayout) findViewById(R.id.drawer_layout_logout);
          ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                  this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
          drawer.addDrawerListener(toggle);
          toggle.syncState();
          //   getSupportActionBar().setDisplayShowHomeEnabled(true);
          navigationView = (NavigationView) findViewById(R.id.nav_view2);
          navigationView.setNavigationItemSelectedListener(this);
          View view=getLayoutInflater().inflate(R.layout.nav_header_main2,null);
          loginmain2=view.findViewById(R.id.loginmain2);
          registermain2=view.findViewById(R.id.registermain2);
          loginmain2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent=new Intent(MainActivity.this,Login_Activity.class);
                  startActivity(intent);
              }
          });
          registermain2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent=new Intent(MainActivity.this,Registration_Activity.class);
                  startActivity(intent);
              }
          });
          navigationView.addHeaderView(view);




      }

        recycleItemAdds=new ArrayList<>();
        recycleItemAdds.add(new RecycleItemAdd(R.drawable.photograph,"Photograph","HINDI |(U/A)"));
        recycleItemAdds.add(new RecycleItemAdd(R.drawable.badla,"Badla","HINDI |(U/A)"));
        recycleItemAdds.add(new RecycleItemAdd(R.drawable.luka,"Luka Chuppi","HINDI |(U/A)"));
        recycleItemAdds.add(new RecycleItemAdd(R.drawable.total1,"Total Dhamaal","HINDI |(U/A)"));
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new RecycleAdapter(recycleItemAdds);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
//       else
//        {
//
//            username.setText("Login/SignUp");
//            useremail.setText(" ");
//            dp.setImageResource(R.drawable.ic_mood_bad_black_24dp);
//
//            username.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent=new Intent(MainActivity.this,Login_Activity.class);
//                    startActivity(intent);
//                }
//            });
//
//        }


    }





    @Override
    public void onBackPressed() {
        if(My_Utiity.loginfinal||My_Utiity.loginfinal)
        {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        }else
        {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_logout);
        }

        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this).setTitle("Do you Want to Exit");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                   finish();
                }
            });
            builder.setNegativeButton("No",null);
            builder.show();

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        if(My_Utiity.loginfinal||My_Utiity.logintest)
        {
            getMenuInflater().inflate(R.menu.main, menu);

            return true;

        }

        else
            return  false;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            My_Utiity.loginfinal=false;
            My_Utiity.logintest=false;
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Logged Out Succesfully", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();


        if (id == R.id.my_account) {
           // Toast.makeText(this,"Import", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,My_Account.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.home) {
            Toast.makeText(this,id, Toast.LENGTH_SHORT).show();



        } else if (id == R.id.nav_manage) {
            Toast.makeText(this,id, Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_share) {
            Toast.makeText(this,id, Toast.LENGTH_SHORT).show();

        }else if(id==R.id.logout_home)
        {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.logout_aboutus)
        {
            Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.logout_share)
        {
            Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.logout_contactus){
            Toast.makeText(this, "Contact Us", Toast.LENGTH_SHORT).show();
        }
       else if (id == R.id.logincontactus) {
            Toast.makeText(this,id, Toast.LENGTH_SHORT).show();


//        }else if(id==R.id.logout){
//            My_Utiity.logintest=false;
//            My_Utiity.loginfinal=false;
//            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
//            Intent intent=new Intent(MainActivity.this,MainActivity.class);
//            startActivity(intent);


        }
        if(My_Utiity.loginfinal||My_Utiity.logintest)
        {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }else
        {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_logout);
            drawer.closeDrawer(GravityCompat.START);
            return true;

        }



    }


}
