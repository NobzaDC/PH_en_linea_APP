package com.example.phenlineaapp.MVP.Presenters.Fragments;

import com.example.phenlineaapp.MVP.Interactors.Fragments.InicioFragInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.InicioFragmentInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.InicioFragmentPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.InicioFragmentView;

public class InicioFragPresenterImpl implements InicioFragmentPresenter {

    private final InicioFragmentView view;
    private final InicioFragmentInteractor interactor;

    public InicioFragPresenterImpl(InicioFragmentView view) {
        this.view = view;
        interactor = new InicioFragInteractorImpl(this);
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
    public void openControlCertificados() {
        if (view != null) {
            view.openControlCertificados();
        }
    }

    @Override
    public void openControlMensajes() {
        if (view != null) {
            view.openControlMensajes();
        }
    }

    @Override
    public void openControlBoletines() {
        if (view != null) {
            view.openControlBoletines();
        }
    }

    @Override
    public void openControlInformes() {
        if (view != null) {
            view.openControlInformes();
        }
    }

    @Override
    public void openControlEncuestas() {
        if (view != null) {
            view.openControlEncuestas();
        }
    }
}
