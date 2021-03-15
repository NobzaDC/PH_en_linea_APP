package com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl;

import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;

public interface PdfControlPresenter {

    void loadSoap(String periodo, ProgressBar mBar, PDFView mPdfViewer);
}
