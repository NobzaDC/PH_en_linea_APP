package com.example.phenlineaapp.Presenters;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.phenlineaapp.Interactors.HomeInteractorImpl;
import com.example.phenlineaapp.Interfaces.Home.HomeInteractor;
import com.example.phenlineaapp.Interfaces.Home.HomePresenter;
import com.example.phenlineaapp.Interfaces.Home.HomeView;

public class HomePresenterImpl implements HomePresenter {

    private HomeView view;
    private HomeInteractor interactor;

    public HomePresenterImpl(HomeView view) {
        this.view = view;
        interactor = new HomeInteractorImpl(this);
    }

    @Override
    public void changeFragment(MenuItem item) {
        if (view != null) {
            interactor.changeFragment(item);
        }
    }

    @Override
    public void setFragment(Fragment fragment) {
        if (view!=null){
            view.setFragment(fragment);
        }
    }

    @Override
    public void onBackPressed(DrawerLayout drawerLayout) {
        if (view!=null){
            interactor.onBackPressed(drawerLayout);
        }
    }

    @Override
    public void closeDrawer() {
        if (view!=null){
            view.closeDrawer();
        }
    }

    @Override
    public void closeHomeActivity() {
        if (view!=null){
            view.closeHomeActivity();
        }
    }
}
