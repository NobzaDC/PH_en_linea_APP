package com.example.phenlineaapp.MVP.Presenters.Activitys;

import android.widget.ProgressBar;

import com.example.phenlineaapp.MVP.Interactors.Activitys.PdfControlInteractorImpl;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl.PdfControlInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl.PdfControlPresenter;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl.PdfControlView;
import com.github.barteksc.pdfviewer.PDFView;

public class PdfControlPresenterImpl implements PdfControlPresenter {

    private final PdfControlView view;
    private final PdfControlInteractor interactor;

    public PdfControlPresenterImpl(PdfControlView view) {
        this.view = view;
        interactor = new PdfControlInteractorImpl(this);
    }

    @Override
    public void loadSoap(String periodo, ProgressBar mBar, PDFView mPdfViewer) {
        if (view != null) {
            interactor.loadSoap(periodo, mBar, mPdfViewer);
        }
    }

}
