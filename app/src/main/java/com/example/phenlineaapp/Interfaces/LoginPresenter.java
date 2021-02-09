package com.example.phenlineaapp.Interfaces;

public interface LoginPresenter {

    void cleanUser();
    void cleanPassword();

    void setError(String error);

    void changeStateUser();
    void changeStatePassword();
    void changeStateButton();

    void showProgressBar();
    void hideProgressBar();


    void sendData(String user, String password);
    void toHome();
}
