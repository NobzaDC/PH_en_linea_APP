package com.example.phenlineaapp.Methods;

import com.example.phenlineaapp.API.Interface.SP_ConsultarPeriodosFacturacionApiCaller;
import com.example.phenlineaapp.Models.FacturasModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.phenlineaapp.Global.UrlBase;

public class SP_consultarPeriodosFacturacionMethods {

    public static List<FacturasModel> mList = new ArrayList<>();
    private Retrofit retrofit;

    public List<FacturasModel> getFacturas(String NombreBd) {
        if (!NombreBd.isEmpty()) {
            try {
                SP_ConsultarPeriodosFacturacionApiCaller apiCaller = retrofit.create(SP_ConsultarPeriodosFacturacionApiCaller.class);
                Call<List<FacturasModel>> model = apiCaller.get_list_periodos_facturacion(NombreBd);
                model.enqueue(new Callback<List<FacturasModel>>() {
                    @Override
                    public void onResponse(Call<List<FacturasModel>> call, Response<List<FacturasModel>> response) {
                        if (response.isSuccessful()) {
                            mList = response.body();
                        } else {
                            mList = null;
                        }
                    }

                    @Override
                    public void onFailure(Call<List<FacturasModel>> call, Throwable t) {
                        mList = null;
                    }
                });
                return mList;
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public Retrofit getRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(UrlBase)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    //combertir en void y llamar a la variable statica
    public List<FacturasModel> getFacturas(String NombreBd, int CantidadDatos) {
        if (!NombreBd.isEmpty()) {
            if (CantidadDatos >= 1) {
                try {
                    SP_ConsultarPeriodosFacturacionApiCaller apiCaller = retrofit.create(SP_ConsultarPeriodosFacturacionApiCaller.class);
                    Call<List<FacturasModel>> model = apiCaller.get_list_periodos_facturacion(NombreBd, CantidadDatos);
                    model.enqueue(new Callback<List<FacturasModel>>() {
                        @Override
                        public void onResponse(Call<List<FacturasModel>> call, Response<List<FacturasModel>> response) {

                            if (response.isSuccessful()) {
                                mList = response.body();
                            } else {
                                mList = null;
                            }
                        }

                        @Override
                        public void onFailure(Call<List<FacturasModel>> call, Throwable t) {
                            mList = null;
                        }
                    });
                    return mList;
                } catch (Exception e) {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
