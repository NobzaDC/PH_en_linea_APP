package com.example.phenlineaapp.Interactors;

import com.example.phenlineaapp.Interfaces.Login.LoginInteractor;
import com.example.phenlineaapp.Interfaces.Login.LoginPresenter;

public class LoginInteractorImpl implements LoginInteractor {

    private final LoginPresenter presenter;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void submit(String user, String password, boolean remember) {
        presenter.showProgressBar();
        presenter.changeStateUser();
        presenter.changeStatePassword();
        presenter.changeStateButton();
        if (user.isEmpty() || password.isEmpty()) {
            presenter.cleanUser();
            presenter.cleanPassword();
            presenter.setError("Debe llenar los campos correctamente");
        } else {
            if (remember) {
                presenter.setPreferences(true, user, password);
            }
            presenter.changeStateUser();
            presenter.changeStatePassword();
            presenter.changeStateButton();
            presenter.hideProgressBar();
            presenter.cleanUser();
            presenter.cleanPassword();
            presenter.accesAllowed();
        }
        presenter.changeStateUser();
        presenter.changeStatePassword();
        presenter.changeStateButton();
        presenter.hideProgressBar();
        presenter.cleanUser();
        presenter.cleanPassword();
    }

    @Override
    public void validatePreferences(boolean remember, String user, String password) {
        if (!remember)
            return;
        submit(user, password, true);
    }

}
