package com.example.phenlineaapp.MVP.Interfaces.Activitys.Home;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;

public interface HomeInteractor {
    void changeFragment(MenuItem item);
    void onBackPressed(DrawerLayout drawerLayout);
}
