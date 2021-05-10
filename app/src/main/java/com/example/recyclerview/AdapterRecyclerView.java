package com.example.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.MyViewHolder> {

    ArrayList<ModelRecyclerView> burcList;
    LayoutInflater inflater;

    public AdapterRecyclerView(Context context, ArrayList<ModelRecyclerView> burc) {
        inflater = LayoutInflater.from(context);
        this.burcList = burc;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_view_design, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ModelRecyclerView selectedBurc = burcList.get(position);
        holder.setData(selectedBurc, position);

    }

    @Override
    public int getItemCount() {
        return burcList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView burcName;
        ImageView burcImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            burcName  = itemView.findViewById(R.id.burcName);
            burcImage =  itemView.findViewById(R.id.burcImage);

        }

        public void setData(ModelRecyclerView selectedBurc, int position) {

            this.burcName.setText(selectedBurc.getBurcName());
            this.burcImage.setImageResource(selectedBurc.getImageID());


        }


        @Override
        public void onClick(View v) {


        }


    }
}
