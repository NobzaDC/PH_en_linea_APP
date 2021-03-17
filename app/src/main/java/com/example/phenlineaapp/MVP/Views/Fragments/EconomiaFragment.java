package com.example.phenlineaapp.MVP.Views.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.phenlineaapp.Adapters.ButtonsUserControlAdapter;
import com.example.phenlineaapp.Base.Fragments.BaseFragment;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia.EconomiaPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Economia.EconomiaView;
import com.example.phenlineaapp.MVP.Presenters.Fragments.EconomiaPresenterImpl;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.databinding.FragmentEconomiaBinding;

import java.util.List;

public class EconomiaFragment extends BaseFragment implements View.OnClickListener, EconomiaView {

    private FragmentEconomiaBinding binding;
    private EconomiaPresenter presenter;
    private List<ButtonsUserControlModel> listButtons;
    private ButtonsUserControlAdapter adapter;

    public EconomiaFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEconomiaBinding.inflate(inflater, container, false);
        presenter = new EconomiaPresenterImpl(this);
        binding.reciclerButtonsEconomia.setLayoutManager(new LinearLayoutManager(getContext()));
        init();
        return binding.getRoot();
    }

    private void init() {

        presenter.createListButtons();
    }

    @Override
    public void onClick(View view) {
        if (listButtons != null) {
            presenter.onButtonClicked(listButtons.get(binding.reciclerButtonsEconomia.getChildAdapterPosition(view)).getId());
        }
    }

    @Override
    public void openControlFacturas() {
        goToControlFacturas(getContext());
    }

    @Override
    public void openControlReciboCaja() {
        goToControlReciboCaja(getContext());
    }

    @Override
    public void openControlEstadoCuenta() {
        goToControlEstadoCuenta(getContext());
    }

    @Override
    public void openControlPazSalvo() {
        goToControControlPazSalvo(getContext());
    }

    @Override
    public void getListButtons(List<ButtonsUserControlModel> listButtons) {
        this.listButtons = listButtons;
        adapter = new ButtonsUserControlAdapter(listButtons, this);
        binding.reciclerButtonsEconomia.setAdapter(adapter);
    }

    @Override
    public void showToast(String message) {
        super.showToast(message);
    }
}