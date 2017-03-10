package com.example.admin.ndtabswithgraphs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.admin.ndtabswithgraphs.TabFragment.int_items;

/**
 * Created by Admin on 3/7/2017.
 */

public class ChartsAdapater extends FragmentPagerAdapter {


 public  ChartsAdapater(FragmentManager fm){
     super(fm);
 }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BarChartFragment();
            case 1:
                return  new BargroupChartFragment();
            case 2:
                return new LinechartFragment();
            case 3:
                return new PiechartFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Bar";
            case 1:
                return "BarGroup";
            case 2:
                return "Line";
            case 3:
                return "Pie";




        }

        return null;
    }
}


