package com.example.mymedicines;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class pagerAdapter extends FragmentPagerAdapter {
   private final ArrayList<Fragment> listfrag=new ArrayList<>();
    private final ArrayList<String> titlefrag=new ArrayList<>();
    public pagerAdapter(FragmentManager fm) {
        super(fm);
    }



public  void  addFrag(Fragment f,String title){
        listfrag.add(f);
        titlefrag.add(title);
}

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titlefrag.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return listfrag.get(position);
    }

    @Override
    public int getCount() {
        return titlefrag.size();
    }
}
