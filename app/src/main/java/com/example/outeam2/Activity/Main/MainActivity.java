package com.example.outeam2.Activity.Main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.outeam2.Fragment.HomeFragment;
import com.example.outeam2.Fragment.NotifFragment;
import com.example.outeam2.Fragment.ProfileFragment;
import com.example.outeam2.Fragment.SearchFragment;
import com.example.outeam2.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mHomeNavigation;
    private FrameLayout mHomeFrame;

    private HomeFragment homeFragment;
    private NotifFragment notifFragment;
    private SearchFragment searchFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHomeNavigation = findViewById(R.id.bottom_navigation);
        mHomeFrame = findViewById(R.id.fragment_container);

        homeFragment = new HomeFragment();
        notifFragment = new NotifFragment();
        searchFragment = new SearchFragment();
        profileFragment = new ProfileFragment();

        setFragment(searchFragment);

        mHomeNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.bottom_menu_search:
                        mHomeNavigation.setItemBackgroundResource(R.color.colorGreen);
                        setFragment(searchFragment);
                        return true;
                    case R.id.bottom_menu_home:
                        mHomeNavigation.setItemBackgroundResource(R.color.colorGreen);
                        setFragment(homeFragment);
                        return true;
                    case R.id.bottom_menu_notify:
                        mHomeNavigation.setItemBackgroundResource(R.color.colorGreen);
                        setFragment(notifFragment);
                        return true;
                    case R.id.bottom_menu_profile:
                        mHomeNavigation.setItemBackgroundResource(R.color.colorGreen);
                        setFragment(profileFragment);
                        return true;

                    default:


                        return false;

                }
            }
        });

    }
    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }
}
