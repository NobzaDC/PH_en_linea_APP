package com.example.phenlineaapp.Interfaces.Login;

public interface LoginInteractor {

    void submit(String user, String password, boolean remember);

    void validatePreferences(boolean remember, String user, String password);

}
