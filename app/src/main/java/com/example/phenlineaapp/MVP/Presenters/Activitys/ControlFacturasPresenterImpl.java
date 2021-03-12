package com.example.phenlineaapp.MVP.Presenters.Activitys;

import com.example.phenlineaapp.MVP.Interactors.Activitys.ControlFacturasInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas.ControlFacturasInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas.ControlFacturasPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas.ControlFacturasView;
import com.example.phenlineaapp.Models.FacturasModel;

import java.util.List;

public class ControlFacturasPresenterImpl implements ControlFacturasPresenter {

    private final ControlFacturasView view;
    private final ControlFacturasInteractor interactor;

    public ControlFacturasPresenterImpl(ControlFacturasView view) {
        this.view = view;
        interactor = new ControlFacturasInteractorImpl(this);
    }

    @Override
    public void loadListFacturas(String NombreBD, int CantidadDatos) {
        if (view != null) {
            interactor.loadListFacturas(NombreBD, CantidadDatos);
        }
    }

    @Override
    public void showListFacturas(List<FacturasModel> mListFacturas) {
        if (view != null) {
            view.showListFacturas(mListFacturas);
        }
    }
}
