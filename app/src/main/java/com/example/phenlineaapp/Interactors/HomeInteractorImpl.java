package com.example.phenlineaapp.Interactors;

import android.view.MenuItem;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.phenlineaapp.Interfaces.Home.HomeInteractor;
import com.example.phenlineaapp.Interfaces.Home.HomePresenter;
import com.example.phenlineaapp.R;
import com.example.phenlineaapp.Views.Fragments.HomeFragment;
import com.example.phenlineaapp.Views.Fragments.ProfileFragment;
import com.example.phenlineaapp.Views.Fragments.UpdateFragment;

public class HomeInteractorImpl implements HomeInteractor {

    private final HomeFragment homeFragment = new HomeFragment();
    private final UpdateFragment updateFragment = new UpdateFragment();
    private final ProfileFragment profileFragment = new ProfileFragment();

    private HomePresenter presenter;

    public HomeInteractorImpl(HomePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void changeFragment(MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.HomeFragment:
                fragment = homeFragment;
                break;
            case R.id.UpdateFragment:
                fragment = updateFragment;
                break;
            case R.id.ProfileFragment:
                fragment = profileFragment;
                break;
        }
        presenter.setFragment(fragment);
    }

    @Override
    public void onBackPressed(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            presenter.closeDrawer();
        }else {
            presenter.closeHomeActivity();
        }
    }
}
