package com.example.phenlineaapp.MVP.Interfaces.Activitys.Login;

public interface LoginView {

    void cleanUser();
    void cleanPassword();

    void setError(String error);

    void changeStateUser();

    void changeStatePassword();

    void changeStateButton();

    void showProgressBar();

    void hideProgressBar();


    void submit();

    void accesAllowed();

    void setPreferences(boolean remember, String user, String password);

    void validatePreferences();

}
