package com.example.phenlineaapp.MVP.Interfaces.Fragments.Social;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public interface SocialView {
    void getListButtons(List<ButtonsUserControlModel> listButtons);

    void showToast(String message);
}
