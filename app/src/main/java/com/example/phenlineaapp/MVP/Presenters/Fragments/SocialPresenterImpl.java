package com.example.phenlineaapp.MVP.Presenters.Fragments;

import com.example.phenlineaapp.MVP.Interactors.Fragments.SocialInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Social.SocialInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Social.SocialPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Social.SocialView;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;

import java.util.List;

public class SocialPresenterImpl implements SocialPresenter {

    private final SocialView view;
    private final SocialInteractor interactor;

    public SocialPresenterImpl(SocialView view) {
        this.view = view;
        interactor = new SocialInteractorImpl(this);
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
