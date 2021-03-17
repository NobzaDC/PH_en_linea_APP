package com.example.phenlineaapp.MVP.Interactors.Fragments;

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
        listButtons.add(new ButtonsUserControlModel(1, R.drawable.img_default, "VER / PAGAR FACTURA", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(2, R.drawable.img_default, "RECIBO DE CAJA", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(3, R.drawable.img_default, "ESTADOS DE CUENTA", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(4, R.drawable.img_default, "PAZ Y SALVO", "this is a short description \nthis is a short description \nthis is a short description"));

        presenter.sentListButtons(listButtons);
    }
}
