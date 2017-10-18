package com.example.sayvinzu.ngodingbareng.Activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.sayvinzu.ngodingbareng.Fragment.FragmentAccount;
import com.example.sayvinzu.ngodingbareng.Fragment.FragmentAdd;
import com.example.sayvinzu.ngodingbareng.Fragment.FragmentChat;
import com.example.sayvinzu.ngodingbareng.Fragment.FragmentDasbor;
import com.example.sayvinzu.ngodingbareng.Fragment.FragmentSchedule;
import com.example.sayvinzu.ngodingbareng.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MenuUtama extends AppCompatActivity {

    BottomBar btBar;
    FragmentDasbor frgDasbor;
    FragmentSchedule frgSchedule;
    FragmentAdd frgAdd;
    FragmentChat frgChat;
    FragmentAccount frgAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btBar = (BottomBar) findViewById(R.id.bottomBar);

        frgDasbor = new FragmentDasbor();
        frgSchedule = new FragmentSchedule();
        frgAdd = new FragmentAdd();
        frgChat = new FragmentChat();
        frgAccount = new FragmentAccount();

        isi_fragment(frgDasbor);

        btBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.menu_dasbor:
                        isi_fragment(frgDasbor);
                        break;
                    case R.id.menu_schedule:
                        isi_fragment(frgSchedule);
                        break;
                    case R.id.menu_add:
                        isi_fragment(frgAdd);
                        break;
                    case R.id.menu_chat:
                        isi_fragment(frgChat);
                        break;
                    case R.id.menu_account:
                        isi_fragment(frgAccount);
                        break;

                }
            }
        });


    }

    private void isi_fragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.isi_fragment, fragment).commit();
    }

}
