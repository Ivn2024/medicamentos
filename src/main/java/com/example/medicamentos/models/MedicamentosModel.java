package com.example.medicamentos.models;


import jakarta.persistence.*;

@Entity
@Table(name = "medicamentos")
public class MedicamentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_medicamento")
    private Long idMedicamento;

    @Column
    private String nombre;

    @Column
    private String via;
    @Column
    private String dosis;

    public MedicamentosModel() {
    }

    public MedicamentosModel(Long idMedicamento, String nombre, String via, String dosis) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.via = via;
        this.dosis = dosis;
    }

    public Long getIdMedicamento()  {
        return idMedicamento;
    }

    public void setIdMedicamento(Long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}
