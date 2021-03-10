package com.example.phenlineaapp.MVP.Views.Activitys;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.phenlineaapp.Base.Activitys.BaseActivity;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Home.HomePresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Home.HomeView;
import com.example.phenlineaapp.MVP.Presenters.Activitys.HomePresenterImpl;
import com.example.phenlineaapp.MVP.Views.Fragments.HomeFragment;
import com.example.phenlineaapp.R;
import com.example.phenlineaapp.databinding.ActivityHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends BaseActivity implements HomeView, NavigationView.OnNavigationItemSelectedListener {

    private ActivityHomeBinding binding;
    private HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = new HomePresenterImpl(this);

        /*----------------------------------------------------------------------------------------*/

        binding.navView.bringToFront();
        setSupportActionBar(binding.toolbar.getRoot());
        binding.bottomNavigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                presenter.changeFragment(item);
                return false;
            }
        });
        setFragment(new HomeFragment());
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, binding.drawerLayout,
                binding.toolbar.getRoot(), R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        binding.navView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        presenter.onBackPressed(binding.drawerLayout);
    }

    @Override
    public void setFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(binding.frameContainer.getId(), fragment);
        transaction.commit();
    }

    @Override
    public void closeDrawer() {
        binding.drawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public void closeHomeActivity() {
        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}