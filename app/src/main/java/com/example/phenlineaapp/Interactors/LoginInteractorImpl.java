package com.example.phenlineaapp.Interactors;

import com.example.phenlineaapp.Interfaces.LoginInteractor;
import com.example.phenlineaapp.Interfaces.LoginPresenter;

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter presenter;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void checkData(String user, String password) {
        presenter.changeStateUser();
        presenter.changeStatePassword();
        presenter.changeStateButton();
        presenter.showProgressBar();
        if (user.isEmpty() || password.isEmpty()) {
            presenter.cleanUser();
            presenter.cleanPassword();
            presenter.setError("Debe llenar los campos correctamente");
        } else {
            presenter.toHome();
        }
        presenter.changeStateUser();
        presenter.changeStatePassword();
        presenter.changeStateButton();
        presenter.hideProgressBar();
        presenter.cleanUser();
        presenter.cleanPassword();
    }
}
