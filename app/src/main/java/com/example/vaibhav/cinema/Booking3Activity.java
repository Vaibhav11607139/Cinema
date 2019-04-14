package com.example.vaibhav.cinema;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.vaibhav.cinema.My_Utiity.gselectedcount;
import static com.example.vaibhav.cinema.My_Utiity.pselectedcount;
import static com.example.vaibhav.cinema.My_Utiity.counter1;
import static com.example.vaibhav.cinema.My_Utiity.seatbook;
import static com.example.vaibhav.cinema.My_Utiity.mExamplelist;

public class Booking3Activity extends AppCompatActivity {
    TextView moviename,language,movieday,movietime,totalseat,totalseat2,seatno,amount1,amount2,amounttotal,totalseat3,amount3;
    Button proceedtobook;
    ImageView movieimage;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking3_main);
        moviename=findViewById(R.id.mntv);
        language=findViewById(R.id.mltv);
        movieday=findViewById(R.id.mdtv);
       // seatselected=findViewById(R.id.mnstv);
        movietime=findViewById(R.id.mttv);
        totalseat=findViewById(R.id.totalseat);
        totalseat2=findViewById(R.id.totalseat2);
        seatno=findViewById(R.id.seatno);
        amount1=findViewById(R.id.matv);
        amount2=findViewById(R.id.matv2);
        amounttotal=findViewById(R.id.matv3);
        proceedtobook=findViewById(R.id.buttonbooktickets);
        movieimage=findViewById(R.id.movieimage);
        totalseat3=findViewById(R.id.totalseat3);
        amount3=findViewById(R.id.amount3);


        moviename.setText(My_Utiity.selecteddItem.get(0).getmText1());
        language.setText(My_Utiity.selecteddItem.get(0).getmText2());
        movieimage.setImageResource(My_Utiity.selecteddItem.get(0).getmImageR());
        movieday.setText(My_Utiity.dayselected);
        movietime.setText(My_Utiity.timeselected);

        String seatselectd = "";
        for(int i=0;i<My_Utiity.seatbook.size();i++)
        {
            if(i==0)
            {
                seatselectd = seatselectd + " " + My_Utiity.seatbook.get(i).toUpperCase();
            }
            else
                seatselectd = seatselectd + "," + My_Utiity.seatbook.get(i).toUpperCase();
        }

        seatno.setText(seatselectd);

        totalseat.setText(My_Utiity.seatbook.size()+"");
        double a1=0;
        double a2=0,a3=0,a4=0;
      //  int counter1=0;


//        for(int i=0;i<My_Utiity.seatbook.size();i++) {
//            if (!My_Utiity.seatbook.contains("p11") || !My_Utiity.seatbook.contains("p12") || !My_Utiity.seatbook.contains("p13") || !My_Utiity.seatbook.contains("p14") || !My_Utiity.seatbook.contains("p15") || !My_Utiity.seatbook.contains("p21") || !My_Utiity.seatbook.contains("p22") || !My_Utiity.seatbook.contains("p24") || !My_Utiity.seatbook.contains("p25")) {
//                counter1++;
//                Toast.makeText(this, My_Utiity.seatbook.get(i), Toast.LENGTH_SHORT).show();
//
//            }
//        }
//

        a1 = pselectedcount * 250;


        a3 = (a1 * 0.18);
        a2 =gselectedcount * 175;
        a4 = (a2 * 0.18);

        totalseat2.setText(pselectedcount+"");
        totalseat3.setText(gselectedcount+"");



        amount1.setText(a1+"");
        amount2.setText(a3+a4+"");
        amount3.setText(a2+"");
        My_Utiity.amounttotal=a1+a2+a3+a4;
        amounttotal.setText(a1+a3+a2+a4+"");

        proceedtobook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!My_Utiity.logintest)
                {

                    Intent intent=new Intent(Booking3Activity.this,Login_Activity.class);
                    startActivity(intent);
                    My_Utiity.loginfinal=true;
                }
                else
                {
               final ProgressDialog     progressDoalog = new ProgressDialog(Booking3Activity.this);
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
                            Intent intent=new Intent(Booking3Activity.this,FinalActivity.class);
                    startActivity(intent);

                        }
                    },3000);

//

                }
                  //  Toast.makeText(Booking3Activity.this, "Booked Succesfully", Toast.LENGTH_SHORT).show();



            }
        });







//
//
////        Intent i = getIntent();
////        String name=i.getStringExtra("name");
////        String language=i.getStringExtra("language");
//
//        // seatbook.get(i);
//
//        if(seatbook.size()==1)
//        {
//            textView.setText(seatbook.get(0));
//        }
//        if(seatbook.size()==2)
//        {
//            textView.setText(seatbook.get(0));
//            textView2.setText(seatbook.get(1));
//        }
//        if(seatbook.size()==3)
//        {
//            textView.setText(seatbook.get(0));
//            textView2.setText(seatbook.get(1));
//            textView3.setText(seatbook.get(2));
//            textView4.setText(seatbook.size()*100+"");
//        }
//        textView4.setText(My_Utiity.selecteddItem.get(0).getmText1());
       // textView5.setText(My_Utiity.selecteddItem.get(0).getmText2());
      // textView5.setText(My_Utiity.dayselected);
//        ImageView imageView = findViewById(R.id.imageviewselected);
//        imageView.setImageResource(My_Utiity.selecteddItem.get(0).getmImageR());
////





    }
}
