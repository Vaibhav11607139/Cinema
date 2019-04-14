package com.example.vaibhav.cinema;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import static com.example.vaibhav.cinema.My_Utiity.seatbook;
import static com.example.vaibhav.cinema.My_Utiity.pselectedcount;
import static com.example.vaibhav.cinema.My_Utiity.gselectedcount;


import java.io.Serializable;
import java.util.ArrayList;



public class Boook2Activity extends AppCompatActivity {
    Button p11,p12,p13,p14,p15;
    Button p21,p22,p24,p25;
    Button a1,a2,a4,a5;
    Button b1,b2,b4,b5;
    Button c1,c2,c4,c5;
    Button d1,d2,d4,d5;
    Button e1,e2,e4,e5;

    int counter=0;

  //  ArrayList<String> seatbook=new ArrayList<>();

      @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking2_main);
        p11=findViewById(R.id.p11);
        p12=findViewById(R.id.p12);
        p13=findViewById(R.id.p13);
        p14=findViewById(R.id.p14);
        p15=findViewById(R.id.p15);

          p21=findViewById(R.id.p21);
          p22=findViewById(R.id.p22);
          p24=findViewById(R.id.p24);
          p25=findViewById(R.id.p25);

        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);


        b1=findViewById(R.id.b1);
          b2=findViewById(R.id.b2);
          b4=findViewById(R.id.b4);
          b5=findViewById(R.id.b5);

          c1=findViewById(R.id.c1);
          c2=findViewById(R.id.c2);
          c4=findViewById(R.id.c4);
          c5=findViewById(R.id.c5);

          d1=findViewById(R.id.d1);
          d2=findViewById(R.id.d2);
          d4=findViewById(R.id.d4);
          d5=findViewById(R.id.d5);

          e1=findViewById(R.id.e1);
          e2=findViewById(R.id.e2);
          e4=findViewById(R.id.e4);
          e5=findViewById(R.id.e5);

//&&!seatbook.contains("p11")
        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(seatbook.size()<=2 )
                {
                    if(seatbook.contains("p11"))
                    {
                        p11.setBackgroundResource(R.drawable.button5);
                        seatbook.remove("p11");
                        counter--;
                        pselectedcount--;


                    }
                    else
                    {

                        p11.setBackgroundResource(R.drawable.button4);
                        seatbook.add("p11");
                     counter++;
                        pselectedcount++;


                                       }

                }else
                {

                    if(seatbook.contains("p11"))
                    {
                        p11.setBackgroundResource(R.drawable.button5);
                        seatbook.remove("p11");
                        counter--;
                        pselectedcount--;

                    }
                    else
                    {
                        Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                        //p11.setBackgroundResource(R.drawable.button5);

                    }


                }
                if(counter>0)
                {

                 Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                         startActivity(intent);

                     }
                 });
                 View sbView=snackbar.getView();
                 sbView.setBackgroundResource(R.drawable.button4);
                 snackbar.setActionTextColor(Color.WHITE);
                 snackbar.show();



                }
                else
                {
                    Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                    View sbView=snackbar.getView();
                    sbView.setBackgroundResource(R.drawable.button4);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();


                }




            }
        });
        /////////////////////////////////////////////////////////////////
          p12.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p12"))
                      {
                          p12.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p12");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p12.setBackgroundResource(R.drawable.button4);
                          seatbook.add("p12");
                          counter++;
                          pselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("p12"))
                      {
                          p12.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p12");
                              counter--;
                          pselectedcount--;
                      }
                      else
                          {
                              Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                        //  Snackbar.make(view,"Maximum 3 Tickets can be booked at a time",Snackbar.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          /////////////////////////////////////////////////////////////////////////////
          p13.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p13"))
                      {
                          p13.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p13");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p13.setBackgroundResource(R.drawable.button4);
                          seatbook.add("p13");
                          counter++;
                          pselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("p13"))
                      {
                          p13.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p13");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                         // Snackbar.make(view,"Maximum 3 Tickets can be booked at a time",Snackbar.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          //////////////////////////////////////////////////////////////////////////////
          p14.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p14"))
                      {
                          p14.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p14");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p14.setBackgroundResource(R.drawable.button4);
                          seatbook.add("p14");
                          counter++;
                          pselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("p14"))
                      {
                          p14.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p14");
                          counter--;
                          pselectedcount--;


                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                        //  Snackbar.make(view,"Maximum 3 Tickets can be booked at a time",Snackbar.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }



              }
          });//////////////////////////////////////////////////////
          p15.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p15"))
                      {
                          p15.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p15");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p15.setBackgroundResource(R.drawable.button4);
                          seatbook.add("p15");
                          counter++;
                          pselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("p15"))
                      {
                          p15.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("p15");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                         // Snackbar.make(view,"Maximum 3 Tickets can be booked at a time",Snackbar.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });///////////////////////////////////////////////////////////////////////////
          p21.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {


                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p21"))
                      {
                          p21.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p21");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p21.setBackgroundResource(R.drawable.button4);

                          seatbook.add("p21");
                          counter++;
                          pselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("p21"))
                      {
                          p21.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p21");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          ///////////////////////////////////////////////////////////////
          p22.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {


                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p22"))
                      {
                          p22.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p22");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p22.setBackgroundResource(R.drawable.button4);

                          seatbook.add("p22");
                          counter++;
                          pselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("p22"))
                      {
                          p22.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p22");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });/////////////////////////////////////////////////////////////
          p24.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {


                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p24"))
                      {
                          p24.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p24");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p24.setBackgroundResource(R.drawable.button4);

                          seatbook.add("p24");
                          counter++;
                          pselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("p24"))
                      {
                          p24.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p24");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });/////////////////////////////////////////////////////////////////
          p25.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {


                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("p25"))
                      {
                          p25.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p25");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {

                          p25.setBackgroundResource(R.drawable.button4);

                          seatbook.add("p25");
                          counter++;
                          pselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("p25"))
                      {
                          p25.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("p25");
                          counter--;
                          pselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });///////////////////////////////////////////////////////////////
          a1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("a1"))
                      {
                          a1.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("a1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          a1.setBackgroundResource(R.drawable.button4);
                          seatbook.add("a1");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("a1"))
                      {
                          a1.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("a1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          ///////////////////////////////////////////////////////////////////////
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(seatbook.size()<=2)
                {
                    if(seatbook.contains("a2"))
                    {
                        a2.setBackgroundResource(R.drawable.button5);
                        seatbook.remove("a2");
                        counter--;
                        gselectedcount--;

                    }
                    else
                    {

                        a2.setBackgroundResource(R.drawable.button4);

                        seatbook.add("a2");
                        counter++;
                        gselectedcount++;
                    }

                }else
                {

                    if(seatbook.contains("a2"))
                    {
                        a2.setBackgroundResource(R.drawable.button5);

                        seatbook.remove("a2");
                        counter--;
                        gselectedcount--;

                    }
                    else
                    {
                        Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                    }


                }
                if(counter>0)
                {

                    Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                            startActivity(intent);
                        }
                    });
                    View sbView=snackbar.getView();
                    sbView.setBackgroundResource(R.drawable.button4);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();



                }
                else
                {
                    Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                    View sbView=snackbar.getView();
                    sbView.setBackgroundResource(R.drawable.button4);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();


                }



            }
        });
  /////////////////////////////////////////////////////////////////////
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(seatbook.size()<=2)
                {
                    if(seatbook.contains("a4"))
                    {
                        a4.setBackgroundResource(R.drawable.button5);
                        seatbook.remove("a4");
                        counter--;
                        gselectedcount--;

                    }
                    else
                    {

                        a4.setBackgroundResource(R.drawable.button4);
                        seatbook.add("a4");
                        counter++;
                        gselectedcount++;
                    }

                }else
                {

                    if(seatbook.contains("a4"))
                    {
                        a4.setBackgroundResource(R.drawable.button5);
                        seatbook.remove("a4");
                        counter--;
                        gselectedcount--;

                    }
                    else
                    {
                        Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                    }


                }
                if(counter>0)
                {

                    Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                            startActivity(intent);
                        }
                    });
                    View sbView=snackbar.getView();
                    sbView.setBackgroundResource(R.drawable.button4);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();



                }
                else
                {
                    Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                    View sbView=snackbar.getView();
                    sbView.setBackgroundResource(R.drawable.button4);
                    snackbar.setActionTextColor(Color.WHITE);
                    snackbar.show();


                }



            }
        });
        ///////////////////////////////////////////////////////////////////
          a5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("a5"))
                      {
                          a5.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("a5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          a5.setBackgroundResource(R.drawable.button4);
                          seatbook.add("a5");
                          counter++;
                          gselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("a5"))
                      {
                          a5.setBackgroundResource(R.drawable.button5);
                          seatbook.remove("a5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });

        ////////////////////////////////////////////////////////////////////////
          b1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("b1"))
                      {
                          b1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("b1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          b1.setBackgroundResource(R.drawable.button4);

                          seatbook.add("b1");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("b1"))
                      {
                          b1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("b1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }



              }
          });
          ///////////////////////////////////////////////////////////////////
          b2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("b2"))
                      {
                          b2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("b2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          b2.setBackgroundResource(R.drawable.button4);

                          seatbook.add("b2");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("b2"))
                      {
                          b2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("b2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          ///////////////////////////////////////////////////////////
          b4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("b4"))
                      {
                          b4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("b4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          b4.setBackgroundResource(R.drawable.button4);

                          seatbook.add("b4");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("b4"))
                      {
                          b4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("b4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }



              }
          });
          ///////////////////////////////////////////////////////////////////
          b5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("b5"))
                      {
                          b5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("a5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          b5.setBackgroundResource(R.drawable.button4);

                          seatbook.add("b5");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("b5"))
                      {
                          b5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("b5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }

                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          ////////////////////////////////////////////////////////////////////////
          c1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("c1"))
                      {
                          c1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          c1.setBackgroundResource(R.drawable.button4);

                          seatbook.add("c1");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("c1"))
                      {
                          c1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          /////////////////////////////////////////////////////////////////
          c2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("c2"))
                      {
                          c2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          c2.setBackgroundResource(R.drawable.button4);

                          seatbook.add("c2");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("c2"))
                      {
                          c2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }



              }
          });
          ///////////////////////////////////////////////////////////////////////////
          c4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("c4"))
                      {
                          c4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          c4.setBackgroundResource(R.drawable.button4);

                          seatbook.add("c4");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("c4"))
                      {
                          c4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          //////////////////////////////////////////////////////////////////////////

          ////////////////////////////////////////////////////////////////
          c5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("c5"))
                      {
                          c5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          c5.setBackgroundResource(R.drawable.button4);

                          seatbook.add("c5");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("c5"))
                      {
                          c5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("c5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }



              }
          });
          //////////////////////////////////////////////////////////////////////
          d1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("d1"))
                      {
                          d1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          d1.setBackgroundResource(R.drawable.button4);

                          seatbook.add("d1");
                          counter++;
                          gselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("d1"))
                      {
                          d1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d1");
                          counter--;
                          gselectedcount--;
                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }





              }
          });
          ///////////////////////////////////////////////////////////////////////////
          d2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("d2"))
                      {
                          d2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          d2.setBackgroundResource(R.drawable.button4);

                          seatbook.add("d2");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("d2"))
                      {
                          d2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });/////////////////////////////////////////////////////////////////////
          d4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("d4"))
                      {
                          d4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          d4.setBackgroundResource(R.drawable.button4);

                          seatbook.add("d4");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("d4"))
                      {
                          d4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });///////////////////////////////////////////////////////////
          d5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("d5"))
                      {
                          d5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          d5.setBackgroundResource(R.drawable.button4);

                          seatbook.add("d5");
                          counter++;

                          gselectedcount++;
                      }

                  }else
                  {

                      if(seatbook.contains("d5"))
                      {
                          d5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("d5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });///////////////////////////////////////////////////////////
          e1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("e1"))
                      {
                          e1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          e1.setBackgroundResource(R.drawable.button4);

                          seatbook.add("e1");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("e1"))
                      {
                          e1.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e1");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }



              }
          });/////////////////////////////////////////////////////////////////
          e2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("e2"))
                      {
                          e2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          e2.setBackgroundResource(R.drawable.button4);

                          seatbook.add("e2");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("e2"))
                      {
                          e2.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e2");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }



              }
          });////////////////////////////////////////////////////////////////////
          e4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("e4"))
                      {
                          e4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          e4.setBackgroundResource(R.drawable.button4);

                          seatbook.add("e4");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("e4"))
                      {
                          e4.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e4");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });/////////////////////////////////////////////////////////////////////////
          e5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  if(seatbook.size()<=2)
                  {
                      if(seatbook.contains("e5"))
                      {
                          e5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {

                          e5.setBackgroundResource(R.drawable.button4);

                          seatbook.add("e5");
                          counter++;
                          gselectedcount++;

                      }

                  }else
                  {

                      if(seatbook.contains("e5"))
                      {
                          e5.setBackgroundResource(R.drawable.button5);

                          seatbook.remove("e5");
                          counter--;
                          gselectedcount--;

                      }
                      else
                      {
                          Toast.makeText(Boook2Activity.this, "Maximum 3 Tickets can be booked at a time", Toast.LENGTH_SHORT).show();
                      }


                  }
                  if(counter>0)
                  {

                      Snackbar snackbar=Snackbar.make(view,"Book "+counter+" Tickets",Snackbar.LENGTH_INDEFINITE).setAction("Book Now", new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              Intent intent=new Intent(Boook2Activity.this,Booking3Activity.class);
                              startActivity(intent);
                          }
                      });
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();



                  }
                  else
                  {
                      Snackbar snackbar=Snackbar.make(view,"Select seats to book tickets",Snackbar.LENGTH_SHORT);
                      View sbView=snackbar.getView();
                      sbView.setBackgroundResource(R.drawable.button4);
                      snackbar.setActionTextColor(Color.WHITE);
                      snackbar.show();


                  }




              }
          });


    }
}
