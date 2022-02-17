package com.rachid_abbad.gosmart.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.rachid_abbad.gosmart.R;
import com.rachid_abbad.gosmart.ui.dashboard.DashboardFragment;
import com.rachid_abbad.gosmart.ui.notifications.NotificationsFragment;
import com.rachid_abbad.gosmart.ui.profile.ProfileFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    //Navigation fragment:
    final Fragment fragment1 = new DashboardFragment();
    final Fragment fragment2 = new NotificationsFragment();
    final Fragment fragment3 = new ProfileFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragment1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        //Get Window to change NotificationBar color :
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        navView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_dashboard:
                        //window.setStatusBarColor(getResources().getColor(R.color.));
                        fm.beginTransaction().hide(active).show(fragment1).commit();
                        active = fragment1;
                        return true;

                    case R.id.navigation_notification:
                        //window.setStatusBarColor(getResources().getColor(R.color.secondColor));
                        fm.beginTransaction().hide(active).show(fragment2).commit();
                        active = fragment2;
                        return true;

                    case R.id.navigation_profile:
                        //window.setStatusBarColor(getResources().getColor(R.color.firstColor));
                        fm.beginTransaction().hide(active).show(fragment3).commit();
                        active = fragment3;
                        return true;
                };
                return false;
            }
        });
    }

}