package com.example.phenlineaapp.MVP.Views.Activitys;


import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.phenlineaapp.Adapters.ListFacturasAdapter;
import com.example.phenlineaapp.Base.Activitys.BaseActivity;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas.ControlFacturasPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas.ControlFacturasView;
import com.example.phenlineaapp.MVP.Presenters.Activitys.ControlFacturasPresenterImpl;
import com.example.phenlineaapp.Models.FacturasModel;
import com.example.phenlineaapp.R;
import com.example.phenlineaapp.databinding.ActivityControlFacturasBinding;
import com.example.phenlineaapp.databinding.DialogRecliclerFacturasBinding;

import java.util.List;

public class ControlFacturasActivity extends BaseActivity implements ControlFacturasView {

    private ActivityControlFacturasBinding binding;
    private DialogRecliclerFacturasBinding dialogBinding;
    private Dialog dialog;
    private ListFacturasAdapter adapter;
    private ControlFacturasPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityControlFacturasBinding.inflate(getLayoutInflater());
        dialogBinding = DialogRecliclerFacturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    private void init() {
        presenter = new ControlFacturasPresenterImpl(this);
        dialogBinding.reciclerFacturas.setLayoutManager(new LinearLayoutManager(this));
        dialog = new Dialog(ControlFacturasActivity.this);
        dialog.setContentView(dialogBinding.getRoot());
        dialog.getWindow().setBackgroundDrawable(ContextCompat.
                getDrawable(ControlFacturasActivity.this, R.drawable.dialog_facturas));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
        dialog.setCancelable(true);
        dialogBinding.btnCloseDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        binding.btnVerFacturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loadListFacturas("ORSECRETO", 4);
                dialog.show();
            }
        });
    }

    @Override
    public void showListFacturas(List<FacturasModel> mListFacturas) {
        if (mListFacturas != null) {
            adapter = new ListFacturasAdapter(mListFacturas);
            dialogBinding.reciclerFacturas.setAdapter(adapter);
        } else {
            createToast(ControlFacturasActivity.this, "No es posible cargar las facturas", Toast.LENGTH_LONG);
            dialog.dismiss();
        }
    }
}