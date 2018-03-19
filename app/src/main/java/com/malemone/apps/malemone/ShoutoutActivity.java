package com.malemone.apps.malemone;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.widget.TextView;

import com.malemone.apps.malemone.Fragments.ShoutoutMainFragment;

public class ShoutoutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        setPageHeader();

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new ShoutoutMainFragment();
        fragmentTransaction.replace(R.id.shoutout_fragments_placeholder, fragment);
        fragmentTransaction.commit();

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    void setPageHeader(){
        pageHeader = (TextView) findViewById(R.id.page_header_title);
        pageHeader.setText(R.string.title_shoutout);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_shoutout;
    }

    @Override
    int getNavigationMenuItemId() { return R.id.navigation_shoutout; }
}
