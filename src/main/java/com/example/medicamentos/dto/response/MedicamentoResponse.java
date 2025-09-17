package com.example.medicamentos.dto.response;

import com.example.medicamentos.dto.*;

import java.util.List;

public class MedicamentoResponse {
    private Long idMedicamento;
    private String nombre;
    private String via;
    private String dosis;

    private List<ContraindicacionesDTO> contraindicaciones;
    private List<CuidadosEnfermeriaDTO> cuidadosEnfermeria;
    private List<EfectosAdversosDTO> efectosAdversos;
    private List<IndicacionesDTO> indicaciones;
    private List<NombresComercialesDto> nombresComerciales;

    public MedicamentoResponse() {
    }

    public MedicamentoResponse(Long idMedicamento, String nombre, String via, String dosis, List<ContraindicacionesDTO> contraindicaciones, List<CuidadosEnfermeriaDTO> cuidadosEnfermeria, List<EfectosAdversosDTO> efectosAdversos, List<IndicacionesDTO> indicaciones, List<NombresComercialesDto> nombresComerciales) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.via = via;
        this.dosis = dosis;
        this.contraindicaciones = contraindicaciones;
        this.cuidadosEnfermeria = cuidadosEnfermeria;
        this.efectosAdversos = efectosAdversos;
        this.indicaciones = indicaciones;
        this.nombresComerciales = nombresComerciales;
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

    public List<ContraindicacionesDTO> getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(List<ContraindicacionesDTO> contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public List<CuidadosEnfermeriaDTO> getCuidadosEnfermeria() {
        return cuidadosEnfermeria;
    }

    public void setCuidadosEnfermeria(List<CuidadosEnfermeriaDTO> cuidadosEnfermeria) {
        this.cuidadosEnfermeria = cuidadosEnfermeria;
    }

    public List<EfectosAdversosDTO> getEfectosAdversos() {
        return efectosAdversos;
    }

    public void setEfectosAdversos(List<EfectosAdversosDTO> efectosAdversos) {
        this.efectosAdversos = efectosAdversos;
    }

    public List<IndicacionesDTO> getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(List<IndicacionesDTO> indicaciones) {
        this.indicaciones = indicaciones;
    }

    public List<NombresComercialesDto> getNombresComerciales() {
        return nombresComerciales;
    }

    public void setNombresComerciales(List<NombresComercialesDto> nombresComerciales) {
        this.nombresComerciales = nombresComerciales;
    }
}
