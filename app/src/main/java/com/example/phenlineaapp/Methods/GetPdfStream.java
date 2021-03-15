package com.example.phenlineaapp.Methods;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetPdfStream extends AsyncTask<String, Void, InputStream> {

    private final ProgressBar progressBar;
    private final PDFView pdfView;

    public GetPdfStream(ProgressBar progressBar, PDFView pdfView) {
        this.progressBar = progressBar;
        this.pdfView = pdfView;
    }

    @Override
    protected InputStream doInBackground(String... strings) {
        InputStream inputStream = null;
        try {
            URL urlPdf = new URL(strings[0]);
            HttpURLConnection urlConnection = (HttpURLConnection) urlPdf.openConnection();
            if (urlConnection.getResponseCode() == 200) {
                inputStream = new BufferedInputStream(urlConnection.getInputStream());
            }
        } catch (IOException e) {
            return null;
        }
        return inputStream;
    }

    @Override
    protected void onPostExecute(InputStream inputStream) {
        super.onPostExecute(inputStream);

        progressBar.setVisibility(View.GONE);

        pdfView.fromStream(inputStream)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true)
                .spacing(0)
                .load();
    }
}
