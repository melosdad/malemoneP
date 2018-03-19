package com.malemone.apps.malemone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.malemone.apps.malemone.Fragments.DirectionsMainFragment;

public class DirectionsActivity extends BaseActivity {

    Button btnDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        setPageHeader();

        btnDes = (Button) findViewById(R.id.button_find_destination);
        btnDes.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),Destination.class)));


        /*fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new DirectionsMainFragment();
        fragmentTransaction.replace(R.id.directions_fragments_placeholder, fragment);
        fragmentTransaction.commit();*/

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    void setPageHeader(){
        pageHeader = (TextView) findViewById(R.id.page_header_title);
        pageHeader.setText(R.string.title_directions);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_directions;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_directions;
    }

}
