package com.example.phenlineaapp.Base.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.phenlineaapp.MVP.Views.Activitys.ControlBoletinesActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlCertificadosActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlEncuestasActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlFacturasActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlInformesActivity;
import com.example.phenlineaapp.MVP.Views.Activitys.ControlMensajesActivity;
import com.example.phenlineaapp.R;

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

    protected void goToControlFacturas(Context context) {
        context.startActivity(new Intent(context, ControlFacturasActivity.class));
    }

    protected void goToControlCertificados(Context context) {
        context.startActivity(new Intent(context, ControlCertificadosActivity.class));
    }

    protected void goToControlMensajes(Context context) {
        context.startActivity(new Intent(context, ControlMensajesActivity.class));
    }

    protected void goToControlBoletines(Context context) {
        context.startActivity(new Intent(context, ControlBoletinesActivity.class));
    }

    protected void goToControlInformes(Context context) {
        context.startActivity(new Intent(context, ControlInformesActivity.class));
    }

    protected void goToControlEncuestas(Context context) {
        context.startActivity(new Intent(context, ControlEncuestasActivity.class));
    }
}