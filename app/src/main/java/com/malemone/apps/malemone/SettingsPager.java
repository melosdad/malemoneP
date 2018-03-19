package com.malemone.apps.malemone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.malemone.apps.malemone.Fragments.Fragment_AboutUs;
import com.malemone.apps.malemone.Fragments.Fragment_Feedback;
import com.malemone.apps.malemone.Fragments.Fragment_Profile;
import com.malemone.apps.malemone.Fragments.Fragment_Share;

/**
 * Created by mcsbusing on 2018/03/17.
 */

public class SettingsPager extends FragmentStatePagerAdapter {

    private int tabCount;


    SettingsPager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment_AboutUs tabAbout = new Fragment_AboutUs();
                return tabAbout;
            case 1:
                Fragment_Profile tabProfile = new Fragment_Profile();
                return tabProfile;
            case 2:
                Fragment_Feedback tabFeedback= new Fragment_Feedback();
                return tabFeedback;
            case 3:
                Fragment_Share tabShare= new Fragment_Share();
                return tabShare;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
