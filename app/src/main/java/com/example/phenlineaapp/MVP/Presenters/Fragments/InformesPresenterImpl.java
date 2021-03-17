package com.example.phenlineaapp.MVP.Presenters.Fragments;

import com.example.phenlineaapp.MVP.Interactors.Fragments.InformesInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes.InformesInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes.InformesPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes.InformesView;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public class InformesPresenterImpl implements InformesPresenter {

    private final InformesView view;
    private final InformesInteractor interactor;

    public InformesPresenterImpl(InformesView view) {
        this.view = view;
        interactor = new InformesInteractorImpl(this);
    }

    @Override
    public void onButtonClicked(int id) {
        if (view != null) {
            interactor.onButtonClicked(id);
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
        if (view != null) {
            view.showToast(message);
        }
    }
}
