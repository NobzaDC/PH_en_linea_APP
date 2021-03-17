package com.example.phenlineaapp.MVP.Presenters.Fragments;

import com.example.phenlineaapp.MVP.Interactors.Fragments.ContactoInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto.ContactoInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto.ContactoPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto.ContactoView;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public class ContactoPresenterImpl implements ContactoPresenter {

    private final ContactoView view;
    private final ContactoInteractor interactor;

    public ContactoPresenterImpl(ContactoView view) {
        this.view = view;
        interactor = new ContactoInteractorImpl(this);
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
