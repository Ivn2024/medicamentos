package com.example.medicamentos.dto;

import jakarta.persistence.Column;

public class IndicacionesDTO {
    private long idIndicacion;
    private String indicacion;

    public IndicacionesDTO() {
    }

    public IndicacionesDTO(long idIndicacion, String indicacion) {
        this.idIndicacion = idIndicacion;
        this.indicacion = indicacion;
    }

    public long getIdIndicacion() {
        return idIndicacion;
    }

    public void setIdIndicacion(long idIndicacion) {
        this.idIndicacion = idIndicacion;
    }

    public String getIndicacion() {
        return indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }
}
