package com.example.anti.navigacijafragmenti;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Anti on 12/5/2017.
 */

public class MyPageAdapterPom extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> titles = new ArrayList<>();


    public  MyPageAdapterPom (FragmentManager fm ){
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }


    @Override
    public int getCount() {
        return 0;
    }
}
