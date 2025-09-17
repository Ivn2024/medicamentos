package com.example.medicamentos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "efectos_adversos")
public class EfectosAdversosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_efecto_adverso")
    private Long idEfectoAdverso;

     @Column(name = "efecto_adverso")
    private  String efectoAdverso;

    public EfectosAdversosModel() {
    }

    public EfectosAdversosModel(Long idEfectoAdverso, String efectoAdverso) {
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
