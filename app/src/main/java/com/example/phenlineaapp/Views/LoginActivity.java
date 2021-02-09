package com.example.phenlineaapp.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import com.example.phenlineaapp.Base.BaseActivity;
import com.example.phenlineaapp.Interfaces.LoginPresenter;
import com.example.phenlineaapp.Interfaces.LoginView;
import com.example.phenlineaapp.Presenters.LoginPresenterImpl;
import com.example.phenlineaapp.R;
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

        init();
    }

    private void init() {
        TabHost tabs= binding.tabhost;
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("Ingreso");
        spec.setContent(R.id.Ingreso);
        spec.setIndicator("Ingreso");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("Registro");
        spec.setContent(R.id.Registro);
        spec.setIndicator("Registro");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);

        binding.btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
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
    public void sendData() {
        presenter.sendData(binding.txtUser.getEditText().getText().toString(), binding.txtPassword.getEditText().getText().toString());
    }

    @Override
    public void toHome() {
        goToHome(LoginActivity.this);
    }


}