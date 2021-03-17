package com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes;

import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public interface InformesView {

    void getListButtons(List<ButtonsUserControlModel> listButtons);

    void showToast(String message);
}
