package com.example.phenlineaapp.MVP.Interactors.Fragments;

import com.example.phenlineaapp.Global.Descriptions;
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
            case 1:
                break;

        }
    }

    @Override
    public void createListButtons() {
        List<ButtonsUserControlModel> listButtons = new ArrayList<>();

        listButtons.add(new ButtonsUserControlModel(1, R.drawable.img_default, "RESERVA DE ZONAS SOCIALES", Descriptions.MENU_SOCIAL.RESERVA_ZONAS_SOCIALES));
        listButtons.add(new ButtonsUserControlModel(2, R.drawable.img_default, "PQRSF", Descriptions.MENU_SOCIAL.PQRSF));
        listButtons.add(new ButtonsUserControlModel(3, R.drawable.img_default, "CALENDARIO DE EVENTOS", Descriptions.MENU_SOCIAL.CALENDARIO_DE_EVENTOS));
        listButtons.add(new ButtonsUserControlModel(4, R.drawable.img_default, "MUDANZAS", Descriptions.MENU_SOCIAL.MUDANZAS));
        listButtons.add(new ButtonsUserControlModel(5, R.drawable.img_default, "ENCUESTAS Y VOTACIONES", Descriptions.MENU_SOCIAL.ENCUESTAS_Y_VOTACIONES));
        listButtons.add(new ButtonsUserControlModel(6, R.drawable.img_default, "ANUNCIOS Y OFERTAS", Descriptions.MENU_SOCIAL.ANUNCIOS_Y_OFERTAS));

        presenter.sentListButtons(listButtons);
    }
}
