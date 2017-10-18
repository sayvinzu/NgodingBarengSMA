package com.example.sayvinzu.ngodingbareng.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sayvinzu.ngodingbareng.Activity.MenuUtama;
import com.example.sayvinzu.ngodingbareng.Adapter.AdapterRvDasbor;
import com.example.sayvinzu.ngodingbareng.R;

/**
 * Created by SAYVINZU on 12/10/2017.
 */

public class FragmentDasbor extends Fragment {

    RecyclerView recyclerView;
    AdapterRvDasbor adapter;

    String title [] = new String[10];
    int imgBg [] = new int[10];
    int imgType [] = new int[10];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_dasbor, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rView);

        isi();

        adapter = new AdapterRvDasbor(title, imgBg, imgType, getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return v;
    }

    private void isi(){
        title[0] = "Kelas Android Malang";
        title[1] = "Kelas Android Malang";
        title[2] = "Kelas Android Malang";
        title[3] = "Kelas Android Malang";
        title[4] = "Kelas Android Malang";
        title[5] = "Kelas Android Malang";
        title[6] = "Kelas Android Malang";
        title[7] = "Kelas Android Malang";
        title[8] = "Kelas Android Malang";
        title[9] = "Kelas Android Malang";

        imgBg[0] = R.drawable.ngalup;
        imgBg[1] = R.drawable.ngalup;
        imgBg[2] = R.drawable.ngalup;
        imgBg[3] = R.drawable.ngalup;
        imgBg[4] = R.drawable.ngalup;
        imgBg[5] = R.drawable.ngalup;
        imgBg[6] = R.drawable.ngalup;
        imgBg[7] = R.drawable.ngalup;
        imgBg[8] = R.drawable.ngalup;
        imgBg[9] = R.drawable.ngalup;

        imgType[0] = R.drawable.ic_dasbor;
        imgType[1] = R.drawable.ic_schedule;
        imgType[2] = R.drawable.ic_add;
        imgType[3] = R.drawable.ic_chat;
        imgType[4] = R.drawable.ic_account;
        imgType[5] = R.drawable.ic_dasbor;
        imgType[6] = R.drawable.ic_schedule;
        imgType[7] = R.drawable.ic_add;
        imgType[8] = R.drawable.ic_chat;
        imgType[9] = R.drawable.ic_account;
    }
}
