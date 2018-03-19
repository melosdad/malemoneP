package com.malemone.apps.malemone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public abstract class BaseActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    protected Fragment fragment;
    protected FragmentManager fragmentManager;
    protected FragmentTransaction fragmentTransaction;

    protected TextView pageHeader;
    protected BottomNavigationView navigationView;

    @Override
    protected void onStart() {
        super.onStart();
        updateNavigationBarState();
    }

    // Remove inter-activity transition to avoid screen tossing on tapping bottom navigation items
    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        navigationView.postDelayed(() -> {
            int itemId = item.getItemId();
                if (itemId == R.id.navigation_home) {
                    startActivity(new Intent(this, HomeActivity.class));
                } else if (itemId == R.id.navigation_directions) {
                    startActivity(new Intent(this, DirectionsActivity.class));
                } else if (itemId == R.id.navigation_info) {
                    startActivity(new Intent(this, InformationActivity.class));
                } else if (itemId == R.id.navigation_shoutout) {
                    startActivity(new Intent(this, ShoutoutActivity.class));
                } else if (itemId == R.id.navigation_settings) {
                    startActivity(new Intent(this, SettingsActivity.class));
                }
            finish();
        }, 300);
        return true;
    }

    private void updateNavigationBarState(){
        int actionId = getNavigationMenuItemId();
        selectBottomNavigationBarItem(actionId);
    }

    void selectBottomNavigationBarItem(int itemId) {
        Menu menu = navigationView.getMenu();
        for (int i = 0, size = menu.size(); i < size; i++) {
            MenuItem item = menu.getItem(i);
            boolean shouldBeChecked = item.getItemId() == itemId;
            if (shouldBeChecked) {
                item.setChecked(true);
                break;
            }
        }
    }

    abstract void setPageHeader();

    abstract int getContentViewId();

    abstract int getNavigationMenuItemId();
}
