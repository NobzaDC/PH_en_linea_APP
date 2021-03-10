package com.example.phenlineaapp.MVP.Interfaces.Activitys.Login;

public interface LoginPresenter {

    void cleanUser();
    void cleanPassword();

    void setError(String error);

    void changeStateUser();

    void changeStatePassword();

    void changeStateButton();

    void showProgressBar();

    void hideProgressBar();


    void submit(String user, String password, boolean remember);

    void accesAllowed();

    void validatePreferences(boolean remember, String user, String password);

    void setPreferences(boolean remember, String user, String password);
}
