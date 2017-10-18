package com.example.sayvinzu.ngodingbareng.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sayvinzu.ngodingbareng.Adapter.AdapterTabPagger;
import com.example.sayvinzu.ngodingbareng.R;

/**
 * Created by SAYVINZU on 12/10/2017.
 */


public class FragmentSchedule extends Fragment {

    AdapterTabPagger adapterTabPagger;
    TabLayout tbLayout;
    ViewPager vPagger;
    View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.content_schedule, container, false);
        tabPagger();
        return v;
    }

    public void tabPagger(){
        tbLayout = (TabLayout) v.findViewById(R.id.tbLayout);
        vPagger = (ViewPager) v.findViewById(R.id.viewPager);
        adapterTabPagger = new AdapterTabPagger(getFragmentManager(),2);
        vPagger.setAdapter(adapterTabPagger);

        vPagger.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tbLayout));
        tbLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vPagger.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onResume() {
        tabPagger();
        super.onResume();
    }
}
