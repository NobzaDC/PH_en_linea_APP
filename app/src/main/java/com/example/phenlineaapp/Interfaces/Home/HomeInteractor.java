package com.example.phenlineaapp.Interfaces.Home;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

public interface HomeInteractor {
    void changeFragment(MenuItem item);
    void onBackPressed(DrawerLayout drawerLayout);
}
