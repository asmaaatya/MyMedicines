package com.example.mymedicines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
RecyclerView recyclerView;
RecyclerView recyclerView1;
    ArrayList<medicine1> obj;
    ArrayList<disks1> obj1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.maintab);
        viewPager=findViewById(R.id.mainviewpager);
pagerAdapter adapter=new pagerAdapter(getSupportFragmentManager());
adapter.addFrag(new medicine1(),"MEDICINE");
        adapter.addFrag(new disks1(),"DISKS");
viewPager.setAdapter(adapter);
intializerecycler();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void intializerecycler() {
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        MedicineAdapter medicineAdapter=new MedicineAdapter(obj);
        obj.add(new medicine1("name",R.drawable.ic_launcher_background));
        obj.add(new medicine1("name1",R.drawable.ic_launcher_background));
        obj.add(new medicine1("name2",R.drawable.ic_launcher_background));
        recyclerView.setLayoutManager(lm);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(medicineAdapter);
        DisksAdapter disksAdapter=new DisksAdapter(obj1);
        obj1.add(new disks1("adisk",R.drawable.ic_launcher_foreground));
        obj1.add(new disks1("adisk1",R.drawable.ic_launcher_foreground));
        obj1.add(new disks1("adisk2",R.drawable.ic_launcher_foreground));
recyclerView1.setLayoutManager(lm);
recyclerView1.setHasFixedSize(true);
recyclerView1.setAdapter(disksAdapter);
    }
}
