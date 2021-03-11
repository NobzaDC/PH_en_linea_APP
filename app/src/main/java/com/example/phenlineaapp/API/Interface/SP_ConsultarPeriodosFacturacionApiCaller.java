package com.example.phenlineaapp.API.Interface;

import com.example.phenlineaapp.Models.ListFacturasModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SP_ConsultarPeriodosFacturacionApiCaller {
    @GET
    Call<List<ListFacturasModel>> get_list_periodos_facturacion(@Query("NombreBD") String NombreBD);

    @GET
    Call<List<ListFacturasModel>> get_list_periodos_facturacion(@Query("NombreBD") String NombreBD, @Query("CantidadDatos") int CantidadDatos);
}
