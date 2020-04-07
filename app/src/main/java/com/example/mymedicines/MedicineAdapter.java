package com.example.mymedicines;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.MedicineHolder> {
    ArrayList<item> obj;

    public MedicineAdapter(ArrayList<item> obj) {
        this.obj = obj;
    }
    @NonNull
    @Override
    public MedicineHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.meditems, null, false);
        return new MedicineHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull MedicineHolder holder, int position) {
        item medicine = obj.get(position);
        holder.mtv.setText(medicine.getName_item());
        holder.mimag.setImageResource(medicine.getImg_item());
    }
    @Override
    public int getItemCount() {
        return obj.size();
    }

    public class MedicineHolder extends RecyclerView.ViewHolder {
        TextView mtv;
        ImageView mimag;

        public MedicineHolder(@NonNull View itemView) {
            super(itemView);
            mtv = itemView.findViewById(R.id.medtex);
            mimag = itemView.findViewById(R.id.medima);
        }
    }
}
