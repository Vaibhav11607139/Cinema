package com.example.vaibhav.cinema;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.vaibhav.cinema.My_Utiity.mExamplelist;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder> {
   // private ArrayList<RecycleItemAdd> mExamplelist;
    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_main,viewGroup,false);
        RecycleViewHolder recycleViewHolder=new RecycleViewHolder(view);
        return recycleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecycleViewHolder recycleViewHolder, final int i) {
        final RecycleItemAdd recycleItemAdd=mExamplelist.get(i);
        recycleViewHolder.imageView.setImageResource(recycleItemAdd.getmImageR());
        recycleViewHolder.textView1.setText(recycleItemAdd.getmText1());
        recycleViewHolder.textView2.setText(recycleItemAdd.getmText2());
        recycleViewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Book1Activity.class);
                int bitmap = recycleItemAdd.getmImageR();
                intent.putExtra("image",bitmap);
                intent.putExtra("name",recycleItemAdd.getmText1());
                view.getContext().startActivity(intent);
                My_Utiity.selecteddItem.clear();
                My_Utiity.seatbook.clear();
                RecycleItemAdd recycleItemAdd1 = new RecycleItemAdd(recycleItemAdd.getmImageR(),recycleItemAdd.getmText1(),recycleItemAdd.getmText2());
                My_Utiity.selecteddItem.add(recycleItemAdd1);
//                Intent intent1 = new Intent(view.getContext(),Booking3Activity.class);
//                //int bitmap = recycleItemAdd.getmImageR();
//               // intent.putExtra("image",bitmap);
//                intent1.putExtra("name",recycleItemAdd.getmText1());
//                intent1.putExtra("language",recycleItemAdd.getmText2());
//                view.getContext().startActivity(intent1);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mExamplelist.size();
    }
public RecycleAdapter(ArrayList<RecycleItemAdd>exampleList)
{
    mExamplelist=exampleList;
}

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView1,textView2;
        public Button button;

        public RecycleViewHolder(@NonNull final View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textView1=itemView.findViewById(R.id.textView);
            textView2=itemView.findViewById(R.id.textView2);
            button=itemView.findViewById(R.id.button);


        }
    }
}
