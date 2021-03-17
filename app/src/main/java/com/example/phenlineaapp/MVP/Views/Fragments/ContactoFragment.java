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
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto.ContactoPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Contacto.ContactoView;
import com.example.phenlineaapp.MVP.Presenters.Fragments.ContactoPresenterImpl;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.databinding.FragmentContactoBinding;

import java.util.List;


public class ContactoFragment extends BaseFragment implements View.OnClickListener, ContactoView {

    private FragmentContactoBinding binding;
    private ContactoPresenter presenter;
    private List<ButtonsUserControlModel> listButtons;
    private ButtonsUserControlAdapter adapter;

    public ContactoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContactoBinding.inflate(inflater, container, false);
        presenter = new ContactoPresenterImpl(this);
        binding.reciclerButtonsContacto.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.createListButtons();
    }

    @Override
    public void onClick(View view) {
        if (listButtons != null) {
            presenter.onButtonClicked(listButtons.get(binding.reciclerButtonsContacto.
                    getChildAdapterPosition(view)).getId());
        }
    }

    @Override
    public void getListButtons(List<ButtonsUserControlModel> listButtons) {
        this.listButtons = listButtons;
        adapter = new ButtonsUserControlAdapter(listButtons, this);
        binding.reciclerButtonsContacto.setAdapter(adapter);
    }

    @Override
    public void showToast(String message) {
        super.showToast(message);
    }
}