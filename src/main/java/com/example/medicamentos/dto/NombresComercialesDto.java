package com.example.medicamentos.dto;

import jakarta.persistence.Column;

public class NombresComercialesDto {
    private Long idNombreComercial;
    private String descripcion;

    public NombresComercialesDto() {
    }

    public NombresComercialesDto(Long idNombreComercial, String descripcion) {
        this.idNombreComercial = idNombreComercial;
        this.descripcion = descripcion;
    }

    public Long getIdNombreComercial() {
        return idNombreComercial;
    }

    public void setIdNombreComercial(Long idNombreComercial) {
        this.idNombreComercial = idNombreComercial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
