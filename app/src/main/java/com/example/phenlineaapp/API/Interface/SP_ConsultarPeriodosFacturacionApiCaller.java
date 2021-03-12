package com.example.phenlineaapp.API.Interface;

import com.example.phenlineaapp.Models.FacturasModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SP_ConsultarPeriodosFacturacionApiCaller {
    @GET("SP_ConsultarPeriodosFacturaciones")
    Call<List<FacturasModel>> get_list_periodos_facturacion(@Query("NombreBD") String NombreBD);

    @GET("SP_ConsultarPeriodosFacturaciones")
    Call<List<FacturasModel>> get_list_periodos_facturacion(@Query("NombreBD") String NombreBD, @Query("CantidadDatos") int CantidadDatos);
}
