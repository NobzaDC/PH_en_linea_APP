package com.example.phenlineaapp.MVP.Interfaces.Activitys.Home;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

public interface HomePresenter {
    void changeFragment(MenuItem item);
    void setFragment(Fragment fragment);
    void onBackPressed(DrawerLayout drawerLayout);
    void closeDrawer();
    void closeHomeActivity();
}
