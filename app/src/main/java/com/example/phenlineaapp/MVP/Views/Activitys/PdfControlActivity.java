package com.example.phenlineaapp.MVP.Views.Activitys;

import android.os.Bundle;

import com.example.phenlineaapp.Base.Activitys.BaseActivity;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl.PdfControlPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl.PdfControlView;
import com.example.phenlineaapp.MVP.Presenters.Activitys.PdfControlPresenterImpl;
import com.example.phenlineaapp.databinding.ActivityPdfControlBinding;

public class PdfControlActivity extends BaseActivity implements PdfControlView {

    private PdfControlPresenter presenter;
    private ActivityPdfControlBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPdfControlBinding.inflate(getLayoutInflater());
        presenter = new PdfControlPresenterImpl(this);
        setContentView(binding.getRoot());
        init();
    }

    private void init() {
        String periodo = getIntent().getStringExtra("periodo");
        presenter.loadSoap(periodo, binding.progressBar, binding.pdfViewer);
    }
}