package com.example.vaibhav.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_Today extends Fragment
{
    Button tentod,onetod,threetod,fivetod,ninetod;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_today_main,container,false);
      tentod=  view.findViewById(R.id.tentod);
      onetod=view.findViewById(R.id.onetod);
        threetod=view.findViewById(R.id.threetod);
        fivetod=view.findViewById(R.id.fivetod);
        ninetod=view.findViewById(R.id.ninetod);

      tentod.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              My_Utiity.timeselected="10:00 AM";
              My_Utiity.seatbook.clear();
              My_Utiity.pselectedcount=0;
              My_Utiity.gselectedcount=0;
              Intent intent=new Intent(view.getContext(),Boook2Activity.class);
              view.getContext().startActivity(intent);
          }
      });
        onetod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                My_Utiity.timeselected="1:15 PM";
                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                view.getContext().startActivity(intent);
            }
        });

        threetod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                My_Utiity.timeselected="3:00 PM";
                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                view.getContext().startActivity(intent);
            }
        });

        fivetod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Utiity.timeselected="5:15 PM";
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.counter1=0;
                view.getContext().startActivity(intent);
            }
        });

        ninetod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Utiity.timeselected="9:30 PM";
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                view.getContext().startActivity(intent);
            }
        });


        return view;
    }
}
