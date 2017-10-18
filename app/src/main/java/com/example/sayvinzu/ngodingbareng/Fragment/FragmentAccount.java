package com.example.sayvinzu.ngodingbareng.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sayvinzu.ngodingbareng.R;

/**
 * Created by SAYVINZU on 12/10/2017.
 */

public class FragmentAccount extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.conntent_account, container, false);
        return v;
    }
}
