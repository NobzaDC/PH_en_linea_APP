package com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public interface EconomiaView {
    void openControlFacturas();

    void openControlReciboCaja();

    void openControlEstadoCuenta();

    void openControlPazSalvo();

    void getListButtons(List<ButtonsUserControlModel> listButtons);

    void showToast(String message);
}
