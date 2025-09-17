package com.example.medicamentos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "contraindicaciones")
public class ContraindicacionesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contraindicaciones")
    private Long idContraindicaciones;

    @Column(name = "contraindicacion")
    private String contraindicacion;

    public ContraindicacionesModel() {
    }

    public ContraindicacionesModel(Long idContraindicaciones, String contraindicacion) {
        this.idContraindicaciones = idContraindicaciones;
        this.contraindicacion = contraindicacion;
    }

    public Long getIdContraindicaciones() {
        return idContraindicaciones;
    }

    public void setIdContraindicaciones(Long idContraindicaciones) {
        this.idContraindicaciones = idContraindicaciones;
    }

    public String getContraindicacion() {
        return contraindicacion;
    }

    public void setContraindicacion(String contraindicacion) {
        this.contraindicacion = contraindicacion;
    }
}
