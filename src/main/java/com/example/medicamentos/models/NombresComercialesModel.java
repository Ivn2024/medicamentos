package com.example.medicamentos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "nombres_comerciales")
public class NombresComercialesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nombre_comercial")
    private Long idNombreComercial;

    @Column
    private String descripcion;

    public NombresComercialesModel() {
    }

    public NombresComercialesModel(Long idNombreComercial, String descripcion) {
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
