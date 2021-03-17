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
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Social.SocialPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.Social.SocialView;
import com.example.phenlineaapp.MVP.Presenters.Fragments.SocialPresenterImpl;
import com.example.phenlineaapp.Models.ButtonsUserControlModel;
import com.example.phenlineaapp.databinding.FragmentSocialBinding;

import java.util.List;

public class SocialFragment extends BaseFragment implements View.OnClickListener, SocialView {

    private SocialPresenter presenter;
    private FragmentSocialBinding binding;
    private List<ButtonsUserControlModel> listButtons;
    private ButtonsUserControlAdapter adapter;

    public SocialFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSocialBinding.inflate(inflater, container, false);
        presenter = new SocialPresenterImpl(this);
        binding.reciclerButtonsSocial.setLayoutManager(new LinearLayoutManager(getContext()));
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
            presenter.onButtonClicked(listButtons.get(binding.reciclerButtonsSocial.
                    getChildAdapterPosition(view)).getId());
        }
    }

    @Override
    public void getListButtons(List<ButtonsUserControlModel> listButtons) {
        this.listButtons = listButtons;
        adapter = new ButtonsUserControlAdapter(listButtons, this);
        binding.reciclerButtonsSocial.setAdapter(adapter);
    }

    @Override
    public void showToast(String message) {
        super.showToast(message);
    }
}