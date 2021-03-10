package com.example.phenlineaapp.MVP.Views.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phenlineaapp.Base.Fragments.BaseFragment;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.InicioFragmentPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.InicioFragmentView;
import com.example.phenlineaapp.MVP.Presenters.Fragments.InicioFragPresenterImpl;
import com.example.phenlineaapp.databinding.FragmentInicioBinding;

public class InicioFragment extends BaseFragment implements View.OnClickListener, InicioFragmentView {

    private FragmentInicioBinding binding;
    private InicioFragmentPresenter presenter;

    public InicioFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInicioBinding.inflate(inflater, container, false);
        presenter = new InicioFragPresenterImpl(this);
        init();
        return binding.getRoot();
    }

    private void init() {
        binding.btnPagarVerFactura.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        presenter.onButtonClicked(view.getId());
    }

    @Override
    public void openControlFacturas() {
        goToControlFacturas(getContext());
    }

    @Override
    public void openControlCertificados() {
        goToControlCertificados(getContext());
    }

    @Override
    public void openControlMensajes() {
        goToControlMensajes(getContext());
    }

    @Override
    public void openControlBoletines() {
        goToControlBoletines(getContext());
    }

    @Override
    public void openControlInformes() {
        goToControlInformes(getContext());
    }

    @Override
    public void openControlEncuestas() {
        goToControlEncuestas(getContext());
    }
}