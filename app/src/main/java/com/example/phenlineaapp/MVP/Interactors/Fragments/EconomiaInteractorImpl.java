package com.example.phenlineaapp.MVP.Interactors.Fragments;

import com.example.phenlineaapp.Global.Descriptions;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia.EconomiaInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia.EconomiaPresenter;
import com.example.phenlineaapp.MVP.Presenters.Fragments.EconomiaPresenterImpl;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.R;

import java.util.ArrayList;
import java.util.List;

public class EconomiaInteractorImpl implements EconomiaInteractor {

    private final EconomiaPresenter presenter;

    public EconomiaInteractorImpl(EconomiaPresenterImpl presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onButtonClicked(int id) {
        switch (id) {
            case 0:
                presenter.createToast("Actualmente no posee permisos para ingresar a esta sección");
                break;
            case 1:
                presenter.openControlFacturas();
                break;
            case 2:
                presenter.openControlReciboCaja();
                break;
            case 3:
                presenter.openControlEstadoCuenta();
                break;
            case 4:
                presenter.openControlPazSalvo();
                break;
        }
    }

    @Override
    public void createListButtons() {
        List<ButtonsUserControlModel> listButtons = new ArrayList<>();
        listButtons.add(new ButtonsUserControlModel(1, R.drawable.pagar_factura, "VER / PAGAR FACTURA", Descriptions.MENU_ECONOMIA.VER_PAGAR_FACTURAS));
        listButtons.add(new ButtonsUserControlModel(2, R.drawable.recibo_de_caja, "RECIBO DE CAJA", Descriptions.MENU_ECONOMIA.RECIBO_DE_CAJA));
        listButtons.add(new ButtonsUserControlModel(3, R.drawable.estado_de_cuenta, "ESTADOS DE CUENTA", Descriptions.MENU_ECONOMIA.ESTADO_DE_CUENTA));
        listButtons.add(new ButtonsUserControlModel(4, R.drawable.paz_y_salvo, "PAZ Y SALVO", Descriptions.MENU_ECONOMIA.PAZ_Y_SALVO));
        listButtons.add(new ButtonsUserControlModel(5, R.drawable.certificado_de_pagos, "CERTIFICADO DE PAGOS", Descriptions.MENU_ECONOMIA.CERTIFICADO_DE_PAGOS));

        presenter.sentListButtons(listButtons);
    }
}
