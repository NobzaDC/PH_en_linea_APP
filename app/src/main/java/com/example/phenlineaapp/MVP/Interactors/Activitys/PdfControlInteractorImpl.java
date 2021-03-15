package com.example.phenlineaapp.MVP.Interactors.Activitys;

import android.os.AsyncTask;
import android.widget.ProgressBar;

import com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl.PdfControlInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.PdfControl.PdfControlPresenter;
import com.example.phenlineaapp.Methods.GetPdfStream;
import com.github.barteksc.pdfviewer.PDFView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import static com.example.phenlineaapp.Global.URL_BASE_ARCHIVOS_PHENLINEA;

public class PdfControlInteractorImpl implements PdfControlInteractor {

    final static String NAMESPACE = "http://tempuri.org/";
    final static String METHOD_NAME = "Reporte";
    final static String SOAP_ACTION = "http://tempuri.org/Reporte";
    final static String URL = "https://www.phenlinea.info/WSPhEnlinea/InformesPhenlinea.asmx";
    final static String tipo = "EstadoCuenta";
    final static String codigoBien = "1310";
    final static String nombreBD = "ORSECRETO";
    final static String tipoFormato = "Access";
    final static String ultimoMesFacturado = "202101";
    final static String porPropietario = "N";
    private final PdfControlPresenter presenter;
    private SoapPrimitive result;
    private String message = "N", periodo;
    private ProgressBar mBar;
    private PDFView mPdfViewer;

    public PdfControlInteractorImpl(PdfControlPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void loadSoap(String periodo, ProgressBar mBar, PDFView mPdfViewer) {
        this.periodo = periodo;
        this.mBar = mBar;
        this.mPdfViewer = mPdfViewer;
        AsyncCallSoap soap = new AsyncCallSoap();
        soap.execute();
    }

    private void getDireccion() {
        try {
            SoapObject Request = new SoapObject(NAMESPACE, METHOD_NAME);
            Request.addProperty("tipo", tipo);
            Request.addProperty("codigoBien", codigoBien);
            Request.addProperty("nombreBD", nombreBD);
            Request.addProperty("tipoFormato", tipoFormato);
            Request.addProperty("ultimoMesFacturado", periodo);
            Request.addProperty("porPropietario", porPropietario);
            SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            soapEnvelope.dotNet = true;
            soapEnvelope.setOutputSoapObject(Request);
            HttpTransportSE transport = new HttpTransportSE(URL);
            transport.call(SOAP_ACTION, soapEnvelope);
            result = (SoapPrimitive) soapEnvelope.getResponse();
            message = "OK";
        } catch (Exception e) {
            message = "Error: " + e.getMessage();
        }
    }

    public class AsyncCallSoap extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            getDireccion();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            if ((message.equals("OK"))) {
                String value = getLastValue(result.toString());
                new GetPdfStream(mBar, mPdfViewer).execute(URL_BASE_ARCHIVOS_PHENLINEA + value);
            }

        }

        private String getLastValue(String link) {
            String[] names = link.split("\\\\");
            int length = names.length;
            return names[length - 1];
        }
    }
}
