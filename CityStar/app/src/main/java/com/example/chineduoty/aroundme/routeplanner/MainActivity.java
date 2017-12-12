package com.example.chineduoty.aroundme.routeplanner;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.chineduoty.aroundme.BaseActivity;
import com.example.chineduoty.aroundme.R;
import com.example.chineduoty.aroundme.shareride.ShareRideFragment;
import com.example.chineduoty.aroundme.ticket.DisplayTicketsFragment;

public class MainActivity extends BaseActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    ft.replace(R.id.fragment_box, new SelectRouteFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    ft.replace(R.id.fragment_box, new DisplayTicketsFragment()).commit();
                    return true;
                case R.id.share_ride:
                    ft.replace(R.id.fragment_box, new ShareRideFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    ft.replace(R.id.fragment_box, new DisplayTicketsFragment()).commit();
                    return true;
            }
            ft.commit();
            return false;
        }
    };

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);
    }

}
