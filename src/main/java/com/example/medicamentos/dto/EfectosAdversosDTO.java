package com.example.medicamentos.dto;

import jakarta.persistence.Column;

public class EfectosAdversosDTO {
    private Long idEfectoAdverso;
    private  String efectoAdverso;

    public EfectosAdversosDTO() {
    }

    public EfectosAdversosDTO(Long idEfectoAdverso, String efectoAdverso) {
        this.idEfectoAdverso = idEfectoAdverso;
        this.efectoAdverso = efectoAdverso;
    }

    public Long getIdEfectoAdverso() {
        return idEfectoAdverso;
    }

    public void setIdEfectoAdverso(Long idEfectoAdverso) {
        this.idEfectoAdverso = idEfectoAdverso;
    }

    public String getEfectoAdverso() {
        return efectoAdverso;
    }

    public void setEfectoAdverso(String efectoAdverso) {
        this.efectoAdverso = efectoAdverso;
    }
}
