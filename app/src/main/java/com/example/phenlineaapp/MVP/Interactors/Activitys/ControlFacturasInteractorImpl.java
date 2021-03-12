package com.example.phenlineaapp.MVP.Interactors.Activitys;

import com.example.phenlineaapp.API.Interface.SP_ConsultarPeriodosFacturacionApiCaller;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas.ControlFacturasInteractor;
import com.example.phenlineaapp.MVP.Interfaces.Activitys.ControlFacturas.ControlFacturasPresenter;
import com.example.phenlineaapp.Methods.SP_consultarPeriodosFacturacionMethods;
import com.example.phenlineaapp.Models.FacturasModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ControlFacturasInteractorImpl implements ControlFacturasInteractor {

    private final ControlFacturasPresenter presenter;
    private final SP_consultarPeriodosFacturacionMethods facturacionMethods;
    private List<FacturasModel> mListFacturas;

    public ControlFacturasInteractorImpl(ControlFacturasPresenter presenter) {
        this.presenter = presenter;
        facturacionMethods = new SP_consultarPeriodosFacturacionMethods();
    }


    @Override
    public void loadListFacturas(String NombreBD, int CantidadDatos) {
        Retrofit retrofit = facturacionMethods.getRetrofit();
        if (!NombreBD.isEmpty()) {
            if (CantidadDatos >= 1) {
                try {
                    SP_ConsultarPeriodosFacturacionApiCaller apiCaller = retrofit.create(SP_ConsultarPeriodosFacturacionApiCaller.class);
                    Call<List<FacturasModel>> model = apiCaller.get_list_periodos_facturacion(NombreBD, CantidadDatos);
                    model.enqueue(new Callback<List<FacturasModel>>() {
                        @Override
                        public void onResponse(Call<List<FacturasModel>> call, Response<List<FacturasModel>> response) {

                            if (response.isSuccessful()) {
                                mListFacturas = response.body();
                            } else {
                                mListFacturas = null;
                            }
                            presenter.showListFacturas(mListFacturas);
                        }

                        @Override
                        public void onFailure(Call<List<FacturasModel>> call, Throwable t) {
                            mListFacturas = null;
                            presenter.showListFacturas(mListFacturas);
                        }
                    });
                } catch (Exception e) {
                    mListFacturas = null;
                    presenter.showListFacturas(mListFacturas);
                }
            } else {
                mListFacturas = null;
                presenter.showListFacturas(mListFacturas);
            }
        } else {
            mListFacturas = null;
            presenter.showListFacturas(mListFacturas);
        }
    }
}
