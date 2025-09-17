package com.example.medicamentos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cuidados_enfermeria")
public class CuidadosEnferneriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuidado_enfermeria")
    private Long idCuidadoEnfermeria;

    @Column(name = "cuidado_enfermeria")
    private String cuidadoEneferia;

    public CuidadosEnferneriaModel() {
    }

    public CuidadosEnferneriaModel(Long idCuidadoEnfermeria, String cuidadoEneferia) {
        this.idCuidadoEnfermeria = idCuidadoEnfermeria;
        this.cuidadoEneferia = cuidadoEneferia;
    }

    public Long getIdCuidadoEnfermeria() {
        return idCuidadoEnfermeria;
    }

    public void setIdCuidadoEnfermeria(Long idCuidadoEnfermeria) {
        this.idCuidadoEnfermeria = idCuidadoEnfermeria;
    }

    public String getCuidadoEneferia() {
        return cuidadoEneferia;
    }

    public void setCuidadoEneferia(String cuidadoEneferia) {
        this.cuidadoEneferia = cuidadoEneferia;
    }
}
