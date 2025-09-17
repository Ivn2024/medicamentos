package com.example.medicamentos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "indicaciones")
public class IndicacionesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_indicacion")
    private long idIndicacion;

    @Column
    private String indicacion;

    public IndicacionesModel() {
    }

    public IndicacionesModel(long idIndicacion, String indicacion) {
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
