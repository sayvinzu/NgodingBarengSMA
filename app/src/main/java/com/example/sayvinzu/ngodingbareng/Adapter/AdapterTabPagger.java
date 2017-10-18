package com.example.sayvinzu.ngodingbareng.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sayvinzu.ngodingbareng.Fragment.FragmentCreated;
import com.example.sayvinzu.ngodingbareng.Fragment.FragmentJoin;

/**
 * Created by SAYVINZU on 13/10/2017.
 */

public class AdapterTabPagger extends FragmentStatePagerAdapter {

    int noTab;

    public AdapterTabPagger(FragmentManager fm, int NoTab) {
        super(fm);
        this.noTab = NoTab;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                FragmentJoin frgJoin = new FragmentJoin();
                return frgJoin;
            case 1:
                FragmentCreated frgCreated = new FragmentCreated();
                return frgCreated;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return noTab;
    }
}
