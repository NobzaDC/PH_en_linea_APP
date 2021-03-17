package com.example.phenlineaapp.MVP.Presenters.Fragments;

import com.example.phenlineaapp.MVP.Interactors.Fragments.EconomiaInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia.EconomiaInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia.EconomiaPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia.EconomiaView;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public class EconomiaPresenterImpl implements EconomiaPresenter {

    private final EconomiaView view;
    private final EconomiaInteractor interactor;

    public EconomiaPresenterImpl(EconomiaView view) {
        this.view = view;
        interactor = new EconomiaInteractorImpl(this);
    }

    @Override
    public void onButtonClicked(int id) {
        if (view != null) {
            interactor.onButtonClicked(id);
        }
    }

    @Override
    public void openControlFacturas() {
        if (view != null) {
            view.openControlFacturas();
        }
    }

    @Override
    public void openControlReciboCaja() {
        if (view != null) {
            view.openControlReciboCaja();
        }
    }

    @Override
    public void openControlEstadoCuenta() {
        if (view != null) {
            view.openControlEstadoCuenta();
        }
    }

    @Override
    public void openControlPazSalvo() {
        if (view != null) {
            view.openControlPazSalvo();
        }
    }

    @Override
    public void createListButtons() {
        if (view != null) {
            interactor.createListButtons();
        }
    }

    @Override
    public void sentListButtons(List<ButtonsUserControlModel> listButtons) {
        if (view != null) {
            view.getListButtons(listButtons);
        }
    }

    @Override
    public void createToast(String message) {
        view.showToast(message);
    }
}
