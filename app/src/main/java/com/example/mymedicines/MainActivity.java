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
        tabLayout.setupWithViewPager(viewPager);
    }


}
