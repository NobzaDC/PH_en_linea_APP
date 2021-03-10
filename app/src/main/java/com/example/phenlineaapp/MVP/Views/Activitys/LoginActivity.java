package com.example.phenlineaapp.MVP.Views.Activitys;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import com.example.phenlineaapp.Base.Activitys.BaseActivity;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Login.LoginPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.Login.LoginView;
import com.example.phenlineaapp.MVP.Presenters.Activitys.LoginPresenterImpl;
import com.example.phenlineaapp.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity implements LoginView {

    private ActivityLoginBinding binding;
    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        presenter = new LoginPresenterImpl(this);
        setContentView(binding.getRoot());
        validatePreferences();
        init();
    }

    private void init() {
        setLog("open LoginActivity");
        TabHost tabs= binding.tabhost;
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("Ingreso");
        spec.setContent(binding.Ingreso.getId());
        spec.setIndicator("Ingreso");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("Registro");
        spec.setContent(binding.Registro.getId());
        spec.setIndicator("Registro");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);

        binding.btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();
            }
        });
    }

    @Override
    public void cleanUser() {
        binding.txtUser.getEditText().setText("");
    }

    @Override
    public void cleanPassword() {
        binding.txtPassword.getEditText().setText("");
    }

    @Override
    public void setError(String error) {
        binding.txtUser.getEditText().setError(error);
    }

    @Override
    public void changeStateUser() {
        binding.txtUser.getEditText().setEnabled(!binding.txtUser.getEditText().isEnabled());
    }

    @Override
    public void changeStatePassword() {
        binding.txtPassword.getEditText().setEnabled(!binding.txtPassword.getEditText().isEnabled());
    }

    @Override
    public void changeStateButton() {
        binding.btnContinuar.setEnabled(!binding.btnContinuar.isEnabled());
    }

    @Override
    public void showProgressBar() {
        binding.progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        binding.progressBar.setVisibility(View.GONE);
    }


    @Override
    public void submit() {
        presenter.submit(binding.txtUser.getEditText().getText().toString(), binding.txtPassword.getEditText().getText().toString(), binding.cbRememberMe.isChecked());
    }


    @Override
    public void accesAllowed() {
        goToHome(LoginActivity.this);
    }

    @Override
    public void setPreferences(boolean remember, String user, String password) {
        SharedPreferences preferences = getPref();
        SharedPreferences.Editor editor = preferences.edit();

        editor.putBoolean("rememberLogin", remember);
        editor.putString("userLogin", user);
        editor.putString("passwordLogin", password);

        editor.apply();
    }

    @Override
    public void validatePreferences() {
        SharedPreferences preferences = getPref();
        boolean remember = preferences.getBoolean("rememberLogin", false);
        String user = preferences.getString("userLogin", "can't get data");
        String password = preferences.getString("passwordLogin", "can't get data");
        presenter.validatePreferences(remember, user, password);
    }


}