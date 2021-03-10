package com.example.phenlineaapp.MVP.Interactors.Fragments;

import com.example.phenlineaapp.MVP.Interfaces.Fragments.InicioFragmentInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Fragments.InicioFragmentPresenter;
import com.example.phenlineaapp.MVP.Presenters.Fragments.InicioFragPresenterImpl;
import com.example.phenlineaapp.R;

public class InicioFragInteractorImpl implements InicioFragmentInteractor {

    private final InicioFragmentPresenter presenter;

    public InicioFragInteractorImpl(InicioFragPresenterImpl presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onButtonClicked(int id) {
        switch (id) {
            case R.id.btn_pagar_ver_factura:
                presenter.openControlFacturas();
                break;
            case R.id.btn_certificados_estado_recibos:
                presenter.openControlCertificados();
                break;
            case R.id.btn_mensajes_pqrsf:
                presenter.openControlMensajes();
                break;
            case R.id.btn_boletines_administracion:
                presenter.openControlBoletines();
                break;
            case R.id.btn_informes_asamblea:
                presenter.openControlInformes();
                break;
            case R.id.btn_encuestas_votaciones:
                presenter.openControlEncuestas();
                break;
        }
    }
}
