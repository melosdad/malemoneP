package com.malemone.apps.malemone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.malemone.apps.malemone.Fragments.Fragment_Bus;
import com.malemone.apps.malemone.Fragments.Fragment_Taxi;
import com.malemone.apps.malemone.Fragments.Fragment_Train;

/**
 * Created by mcsbusing on 2018/03/16.
 */

public class Pager extends FragmentStatePagerAdapter {

    private int tabCount;


    Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment_Taxi tabTaxi = new Fragment_Taxi();
                return tabTaxi;
            case 1:
                Fragment_Bus tabBus = new Fragment_Bus();
                return tabBus;
            case 2:
                Fragment_Train tabTrain = new Fragment_Train();
                return tabTrain;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
