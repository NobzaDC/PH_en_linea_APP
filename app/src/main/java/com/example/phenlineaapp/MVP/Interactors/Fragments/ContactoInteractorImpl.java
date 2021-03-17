package com.example.phenlineaapp.MVP.Interactors.Fragments;

import com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto.ContactoInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto.ContactoPresenter;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.R;

import java.util.ArrayList;
import java.util.List;

public class ContactoInteractorImpl implements ContactoInteractor {

    private final ContactoPresenter presenter;

    public ContactoInteractorImpl(ContactoPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onButtonClicked(int id) {
        switch (id) {
            case 0:
                presenter.createToast("Actualmente no posee permisos para ingresar a esta sección");
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    @Override
    public void createListButtons() {
        List<ButtonsUserControlModel> listButtons = new ArrayList<>();

        listButtons.add(new ButtonsUserControlModel(1, R.drawable.img_default, "PQRSF", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(2, R.drawable.img_default, "ACTUALIZACIÓN DATOS", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(3, R.drawable.img_default, "BOLETINES ADMINISTRACIÓN ", "this is a short description \nthis is a short description \nthis is a short description"));

        presenter.sentListButtons(listButtons);
    }
}
