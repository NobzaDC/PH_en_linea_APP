package com.example.phenlineaapp.MVP.Views.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.phenlineaapp.Adapters.ButtonsUserControlAdapter;
import com.example.phenlineaapp.Base.Fragments.BaseFragment;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes.InformesPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Informes.InformesView;
import com.example.phenlineaapp.MVP.Presenters.Fragments.InformesPresenterImpl;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.databinding.FragmentInformesBinding;

import java.util.List;

public class InformesFragment extends BaseFragment implements View.OnClickListener, InformesView {

    private FragmentInformesBinding binding;
    private InformesPresenter presenter;
    private List<ButtonsUserControlModel> listButtons;
    private ButtonsUserControlAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public InformesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInformesBinding.inflate(inflater, container, false);
        presenter = new InformesPresenterImpl(this);
        binding.reciclerButtonsInformes.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.createListButtons();
    }

    @Override
    public void getListButtons(List<ButtonsUserControlModel> listButtons) {
        this.listButtons = listButtons;
        adapter = new ButtonsUserControlAdapter(listButtons, this);
        binding.reciclerButtonsInformes.setAdapter(adapter);
    }

    @Override
    public void showToast(String message) {
        super.showToast(message);
    }

    @Override
    public void onClick(View view) {
        if (listButtons != null) {
            presenter.onButtonClicked(listButtons.get(binding.reciclerButtonsInformes.
                    getChildAdapterPosition(view)).getId());
        }
    }
}