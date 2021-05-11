package com.example.phenlineaapp.MVP.Interactors.Fragments;

import com.example.phenlineaapp.Global.Descriptions;
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

        listButtons.add(new ButtonsUserControlModel(1, R.drawable.boletines_administracion, "BOLETINES DE LA ADMINISTRACIÓN", Descriptions.MENU_INFORMACION.BOLETINES_DE_ADMINISTACION));
        listButtons.add(new ButtonsUserControlModel(2, R.drawable.consejo_administracion, "CONSEJO DE ADMINISTRACIÓN", Descriptions.MENU_INFORMACION.CONSEJO_DE_ADMINISTRACION));
        listButtons.add(new ButtonsUserControlModel(3, R.drawable.manual_de_convivencia, "MANUAL DE CONVIVENCIA", Descriptions.MENU_INFORMACION.MANUAL_DE_CONVIVENCIA));
        listButtons.add(new ButtonsUserControlModel(4, R.drawable.informes_asambleas, "INFORMES DE ASAMBLEA", Descriptions.MENU_INFORMACION.INFORMES_DE_ASAMBLEA));


        presenter.sentListButtons(listButtons);
    }
}
