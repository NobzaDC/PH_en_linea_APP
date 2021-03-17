package com.example.phenlineaapp.Base.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.phenlineaapp.MVP.Views.Activitys.ControlEstadoCuentaActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlFacturasActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlPazSalvoActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlReciboCajaActivity;
import com.example.phenlineaapp.R;

import org.jetbrains.annotations.NotNull;

public class BaseFragment extends Fragment {

    public BaseFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    protected void goToControlFacturas(@NotNull Context context) {
        context.startActivity(new Intent(context, ControlFacturasActivity.class));
    }

    protected void goToControlReciboCaja(@NotNull Context context) {
        context.startActivity(new Intent(context, ControlReciboCajaActivity.class));
    }

    protected void goToControlEstadoCuenta(@NotNull Context context) {
        context.startActivity(new Intent(context, ControlEstadoCuentaActivity.class));
    }

    protected void goToControControlPazSalvo(@NotNull Context context) {
        context.startActivity(new Intent(context, ControlPazSalvoActivity.class));
    }

    protected void showToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}