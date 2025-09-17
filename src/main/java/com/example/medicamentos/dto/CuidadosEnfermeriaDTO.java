package com.example.medicamentos.dto;
public class CuidadosEnfermeriaDTO {
    private Long idCuidadoEnfermeria;
    private String cuidadoEneferia;

    public CuidadosEnfermeriaDTO() {
    }

    public CuidadosEnfermeriaDTO(Long idCuidadoEnfermeria, String cuidadoEneferia) {
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
