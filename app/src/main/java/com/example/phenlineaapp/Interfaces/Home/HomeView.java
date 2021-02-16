package com.example.phenlineaapp.Interfaces.Home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public interface HomeView {

    void setFragment(Fragment fragment);
    void closeDrawer();
    void closeHomeActivity();
}
