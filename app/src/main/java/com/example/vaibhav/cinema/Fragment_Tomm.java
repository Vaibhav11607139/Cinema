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

public class Fragment_Tomm extends Fragment {
    Button ninetom,tentom,onetom,fivetom,seventom;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tomm_main,container,false);
        ninetom=view.findViewById(R.id.ninetom);
        tentom=view.findViewById(R.id.tentom);
        onetom=view.findViewById(R.id.onetom);
        fivetom=view.findViewById(R.id.fivetom);

        seventom=view.findViewById(R.id.seventom);
        ninetom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Utiity.timeselected="9:15 AM";
                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                view.getContext().startActivity(intent);
            }
        });
        tentom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Utiity.timeselected="10:30 AM";
                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                view.getContext().startActivity(intent);
            }
        });
        onetom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Utiity.timeselected="1:30 PM";

                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                view.getContext().startActivity(intent);
            }
        });
        fivetom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Utiity.timeselected="5:15 PM";
                My_Utiity.seatbook.clear();
                My_Utiity.gselectedcount=0;
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                view.getContext().startActivity(intent);
            }
        });
        seventom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                My_Utiity.timeselected="7:30 PM";
                My_Utiity.seatbook.clear();
                My_Utiity.pselectedcount=0;
                My_Utiity.gselectedcount=0;
                Intent intent=new Intent(view.getContext(),Boook2Activity.class);
                view.getContext().startActivity(intent);
            }
        });
        return view;
    }
}
