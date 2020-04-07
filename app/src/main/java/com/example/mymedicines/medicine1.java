package com.example.mymedicines;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class medicine1 extends Fragment {

    public medicine1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     View  view=inflater.inflate(R.layout.medicine,container,false);
        RecyclerView recyclerView =view.findViewById(R.id.mrec);
        ArrayList <item> arrayList=new ArrayList<>();
        arrayList.add(new item(R.drawable.ic_launcher_foreground,"jgvfv"));
        arrayList.add(new item(R.drawable.ic_launcher_foreground,"jgvfv"));
        arrayList.add(new item(R.drawable.ic_launcher_foreground,"jgvfv"));
        arrayList.add(new item(R.drawable.ic_launcher_foreground,"jgvfv"));

        MedicineAdapter medicineAdapter=new MedicineAdapter(arrayList);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       recyclerView.setHasFixedSize(true);
       recyclerView.setAdapter(medicineAdapter);
        return view;
    }
}
