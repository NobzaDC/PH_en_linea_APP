package com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public interface EconomiaPresenter {
    void onButtonClicked(int id);

    void openControlFacturas();

    void openControlReciboCaja();

    void openControlEstadoCuenta();

    void openControlPazSalvo();

    void createListButtons();

    void sentListButtons(List<ButtonsUserControlModel> listButtons);

    void createToast(String message);
}
