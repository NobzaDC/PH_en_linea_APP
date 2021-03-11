package com.example.phenlineaapp.Models;

public class FacturasModel {

    private String anio;
    private String mes;
    private String periodo;

    public FacturasModel(String anio, String mes, String periodo) {
        this.anio = anio;
        this.mes = mes;
        this.periodo = periodo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
