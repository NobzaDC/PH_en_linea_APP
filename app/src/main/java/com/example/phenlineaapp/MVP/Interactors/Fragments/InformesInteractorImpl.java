package com.example.phenlineaapp.MVP.Interactors.Fragments;

import com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes.InformesInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes.InformesPresenter;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.R;

import java.util.ArrayList;
import java.util.List;

public class InformesInteractorImpl implements InformesInteractor {

    private final InformesPresenter presenter;

    public InformesInteractorImpl(InformesPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onButtonClicked(int id) {
        switch (id) {
            case 0:
                presenter.createToast("Actualmente no posee permisos para ingresar a esta sección");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    @Override
    public void createListButtons() {
        List<ButtonsUserControlModel> listButtons = new ArrayList<>();

        listButtons.add(new ButtonsUserControlModel(1, R.drawable.img_default, "CERTIFICADO DE PAGOS", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(2, R.drawable.img_default, "BOLETINES ADMINISTRACIÓN", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(3, R.drawable.img_default, "CONSEJO ADMINISTRACIÓN", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(4, R.drawable.img_default, "INFORMES ASAMBLEA", "this is a short description \nthis is a short description \nthis is a short description"));
        listButtons.add(new ButtonsUserControlModel(5, R.drawable.img_default, "ENCUESTAS Y VOTACIONES", "this is a short description \nthis is a short description \nthis is a short description"));

        presenter.sentListButtons(listButtons);
    }
}
