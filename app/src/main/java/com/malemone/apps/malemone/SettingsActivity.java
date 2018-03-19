package com.malemone.apps.malemone;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

public class SettingsActivity extends BaseActivity {

    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        setPageHeader();

        /*fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new SettingsMainFragment();
        fragmentTransaction.replace(R.id.settings_fragments_placeholder, fragment);
        fragmentTransaction.commit();*/


        tabLayout = (TabLayout) findViewById(R.id.tabSettings);
        viewPager = (ViewPager) findViewById(R.id.settingsContainer);

        tabLayout.addTab(tabLayout.newTab().setText("About"));
        tabLayout.addTab(tabLayout.newTab().setText("Profile"));
        tabLayout.addTab(tabLayout.newTab().setText("Feedback"));
        tabLayout.addTab(tabLayout.newTab().setText("Share"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        SettingsPager pager = new SettingsPager(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pager);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.setScrollPosition(position,0,true);
                tabLayout.setSelected(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    void setPageHeader(){
        pageHeader = (TextView) findViewById(R.id.page_header_title);
        pageHeader.setText(R.string.title_settings);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_settings;
    }

    @Override
    int getNavigationMenuItemId() { return R.id.navigation_settings; }
}
