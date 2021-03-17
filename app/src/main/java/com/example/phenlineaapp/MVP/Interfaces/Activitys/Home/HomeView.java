package com.example.phenlineaapp.MVP.Interfaces.Activitys.Home;

import androidx.fragment.app.Fragment;

public interface HomeView {

    void setFragment(Fragment fragment);

    void closeDrawer();

    void closeHomeActivity();

    void setTitleHeader(String title);

    void setSubTitleHeader(String subTitle);

    void setImageHeader(int image);

    void setBackgroud(int background);
}
