package com.example.mymedicines;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DisksAdapter extends RecyclerView.Adapter<DisksAdapter.DisksHolder> {
    ArrayList<item> obj1;

    public DisksAdapter(ArrayList<item> obj1) {
        this.obj1 = obj1;
    }

    @NonNull
    @Override
    public DisksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.disks,null,false);
        return new DisksHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DisksHolder holder, int position) {
   item disks=obj1.get(position);
holder.dtextView.setText(disks.getName_item());
holder.dimageView.setImageResource(disks.getImg_item());
    }

    @Override
    public int getItemCount() {
        return obj1.size();
    }

    public class DisksHolder extends RecyclerView.ViewHolder{
TextView dtextView;
ImageView dimageView;
        public DisksHolder(@NonNull View itemView) {
            super(itemView);
            dtextView=itemView.findViewById(R.id.disktex);
            dimageView=itemView.findViewById(R.id.diskima);
        }
    }

}
