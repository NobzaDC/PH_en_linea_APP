package com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public interface ContactoPresenter {
    void onButtonClicked(int id);

    void createListButtons();

    void sentListButtons(List<ButtonsUserControlModel> listButtons);

    void createToast(String message);
}
