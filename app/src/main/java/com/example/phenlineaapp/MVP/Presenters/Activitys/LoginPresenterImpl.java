package com.example.phenlineaapp.MVP.Presenters.Activitys;

import com.example.phenlineaapp.MVP.Interactors.Activitys.LoginInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Login.LoginInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Login.LoginPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Login.LoginView;

public class LoginPresenterImpl implements LoginPresenter {

    private final LoginView view;
    private final LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void cleanUser() {
        if (view != null) {
            view.cleanUser();
        }
    }

    @Override
    public void cleanPassword() {
        if (view!=null){
            view.cleanPassword();
        }
    }

    @Override
    public void setError(String error) {
        if (view!=null){
            view.setError(error);
        }
    }

    @Override
    public void changeStateUser() {
        if (view!=null){
            view.changeStateUser();
        }
    }

    @Override
    public void changeStatePassword() {
        if (view!=null){
            view.changeStatePassword();
        }
    }

    @Override
    public void changeStateButton() {
        if (view!=null){
            view.changeStateButton();
        }
    }

    @Override
    public void showProgressBar() {
        if (view!=null){
            view.showProgressBar();
        }
    }

    @Override
    public void hideProgressBar() {
        if (view!=null){
            view.hideProgressBar();
        }
    }

    @Override
    public void submit(String user, String password, boolean remember) {
        interactor.submit(user, password, remember);
    }


    @Override
    public void accesAllowed() {
        if (view != null) {
            view.accesAllowed();
        }
    }

    @Override
    public void validatePreferences(boolean remember, String user, String password) {
        interactor.validatePreferences(remember, user, password);
    }

    @Override
    public void setPreferences(boolean remember, String user, String password) {
        if (view != null) {
            view.setPreferences(remember, user, password);
        }
    }
}
