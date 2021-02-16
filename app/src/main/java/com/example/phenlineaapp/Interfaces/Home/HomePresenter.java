package com.example.phenlineaapp.Interfaces.Home;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public interface HomePresenter {
    void changeFragment(MenuItem item);
    void setFragment(Fragment fragment);
    void onBackPressed(DrawerLayout drawerLayout);
    void closeDrawer();
    void closeHomeActivity();
}
