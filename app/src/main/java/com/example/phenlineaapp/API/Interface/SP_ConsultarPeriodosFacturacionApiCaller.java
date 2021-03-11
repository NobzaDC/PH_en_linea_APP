package com.example.phenlineaapp.API.Interface;

import com.example.phenlineaapp.Models.FacturasModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SP_ConsultarPeriodosFacturacionApiCaller {
    @GET
    Call<List<FacturasModel>> get_list_periodos_facturacion(@Query("NombreBD") String NombreBD);

    @GET
    Call<List<FacturasModel>> get_list_periodos_facturacion(@Query("NombreBD") String NombreBD, @Query("CantidadDatos") int CantidadDatos);
}
