package com.example.phenlineaapp.Presenters;

import com.example.phenlineaapp.Interactors.LoginInteractorImpl;
import com.example.phenlineaapp.Interfaces.LoginInteractor;
import com.example.phenlineaapp.Interfaces.LoginPresenter;
import com.example.phenlineaapp.Interfaces.LoginView;

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void cleanUser() {
        if (view!=null){
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
    public void sendData(String user, String password) {
        interactor.checkData(user, password);
    }


    @Override
    public void toHome() {
        if (view!=null){
            view.toHome();
        }
    }
}
