package com.malemone.apps.malemone;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Destination extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    ImageView btnBack;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        viewPager = (ViewPager) findViewById(R.id.transportContainer);
        tabLayout = (TabLayout) findViewById(R.id.transportTabs);
        btnBack = (ImageView) findViewById(R.id.img_back);

        tabLayout.addTab(tabLayout.newTab().setText("Via Taxi"));
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_local_taxi_black_24dp);
        tabLayout.addTab(tabLayout.newTab().setText("Via Bus"));
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_directions_bus_black_24dp);
        tabLayout.addTab(tabLayout.newTab().setText("Via Train"));
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_train_black_24dp);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        Pager pager = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());
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

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
