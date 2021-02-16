package com.example.phenlineaapp.Interfaces.Login;

public interface LoginView {

    void cleanUser();
    void cleanPassword();

    void setError(String error);

    void changeStateUser();
    void changeStatePassword();
    void changeStateButton();

    void showProgressBar();
    void hideProgressBar();


    void sendData();
    void toHome();

}
