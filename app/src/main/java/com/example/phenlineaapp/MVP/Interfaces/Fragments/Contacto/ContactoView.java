package com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public interface ContactoView {
    void getListButtons(List<ButtonsUserControlModel> listButtons);

    void showToast(String message);
}
