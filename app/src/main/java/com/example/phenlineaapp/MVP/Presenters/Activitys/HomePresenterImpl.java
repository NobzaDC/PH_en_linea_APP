package com.example.phenlineaapp.MVP.Presenters.Activitys;

import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.phenlineaapp.MVP.Interactors.Activitys.HomeInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Home.HomeInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Home.HomePresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Home.HomeView;

public class HomePresenterImpl implements HomePresenter {

    private final HomeView view;
    private final HomeInteractor interactor;

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
