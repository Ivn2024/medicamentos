package com.example.medicamentos.dto;


public class MedicamentoDTO {
    private Long idMedicamento;
    private String nombre;
    private String via;
    private String dosis;

    public MedicamentoDTO() {
    }

    public MedicamentoDTO(Long idMedicamento, String nombre, String via, String dosis) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.via = via;
        this.dosis = dosis;
    }

    public Long getIdMedicamento() {
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
