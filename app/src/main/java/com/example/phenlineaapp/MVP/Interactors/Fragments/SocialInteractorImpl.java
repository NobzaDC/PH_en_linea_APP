package com.example.phenlineaapp.MVP.Interactors.Fragments;

import com.example.phenlineaapp.MVP.Interfaces.Fragments.Social.SocialInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Social.SocialPresenter;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.R;

import java.util.ArrayList;
import java.util.List;

public class SocialInteractorImpl implements SocialInteractor {

    private final SocialPresenter presenter;

    public SocialInteractorImpl(SocialPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onButtonClicked(int id) {
        switch (id) {
            case 0:
                presenter.createToast("Actualmente no posee permisos para ingresar a esta sección");
                break;

        }
    }

    @Override
    public void createListButtons() {
        List<ButtonsUserControlModel> listButtons = new ArrayList<>();

        listButtons.add(new ButtonsUserControlModel(1, R.drawable.img_default, "RESERVA ZONAS SOCIALES", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(2, R.drawable.img_default, "CALENDARIO EVENTOS", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(3, R.drawable.img_default, "MUDANZAS", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(4, R.drawable.img_default, "MANUAL DE CONVIVENCIA", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(5, R.drawable.img_default, "ANUNCIOS Y OFERTAS", "this is a short description \nthis is a short description \nthis is a short description"));

        presenter.sentListButtons(listButtons);
    }
}
