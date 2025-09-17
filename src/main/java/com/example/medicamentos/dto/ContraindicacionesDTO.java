package com.example.medicamentos.dto;

public class ContraindicacionesDTO {

    private Long idContraindicacion;
    private String contraindicacion;

    public ContraindicacionesDTO() {
    }

    public ContraindicacionesDTO(Long idContraindicacion, String contraindicacion) {
        this.idContraindicacion = idContraindicacion;
        this.contraindicacion = contraindicacion;
    }

    public Long getIdContraindicacion() {
        return idContraindicacion;
    }

    public void setIdContraindicacion(Long idContraindicacion) {
        this.idContraindicacion = idContraindicacion;
    }

    public String getContraindicacion() {
        return contraindicacion;
    }

    public void setContraindicacion(String contraindicacion) {
        this.contraindicacion = contraindicacion;
    }
}
