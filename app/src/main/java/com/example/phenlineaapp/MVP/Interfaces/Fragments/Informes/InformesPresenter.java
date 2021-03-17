package com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public interface InformesPresenter {
    void onButtonClicked(int id);

    void createListButtons();

    void sentListButtons(List<ButtonsUserControlModel> listButtons);

    void createToast(String message);
}
