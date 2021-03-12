package com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas;

import com.example.phenlineaapp.Models.FacturasModel;

import java.util.List;

public interface ControlFacturasPresenter {
    void loadListFacturas(String NombreBD, int CantidadDatos);

    void showListFacturas(List<FacturasModel> mListFacturas);
}
