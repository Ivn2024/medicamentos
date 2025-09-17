package com.example.medicamentos.repositories;

import com.example.medicamentos.dto.*;
import com.example.medicamentos.models.MedicamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImedicamentoRepository extends JpaRepository<MedicamentosModel, Long> {

    @Query(value = """
            select
            cast(c.id_contraindicacion as bigint) as idContraindicacion,
            c.contraindicacion as contraindicacion
            from contraindicaciones c
            inner join med_per_contraindicaciones mpc on mpc.id_contraindicacion = c.id_contraindicacion
            where mpc.id_medicamento = :idMedicamento
            """, nativeQuery = true)
    public List<ContraindicacionesDTO> findContraindicacionById(Long idMedicamento);

    @Query(value = """
            select
            ce.id_cuidado_enfermeria as idCuidadoEnfermeria,
            ce.cuidado_enfermeria as cuidadoEnfermeria
            from cuidados_enfermeria ce
            inner join med_per_cuidados_enfermeria mpce on mpce.id_cuidado_enfermeria = ce.id_cuidado_enfermeria
            where mpce.id_medicamento = :idMedicamento
            """, nativeQuery = true)
    public List<CuidadosEnfermeriaDTO> findCuidadoEnfremeriaById(Long idMedicamento);

    @Query(value = """
            select
            ea.id_efecto_adverso as idEfectoAdverso,
            ea.efecto_adverso as efectoAdverso
            from efectos_adversos ea
            inner join med_per_efectos_adversos mpea on mpea.id_efecto_adverso = ea.id_efecto_adverso
            where mpea.id_medicamento = :idMedicamento
            """, nativeQuery = true)
    public List<EfectosAdversosDTO> findEfectoAdversoById(Long idMedicamento);

    @Query(value = """
            select
            i.id_indicacion as idIndicacion,
            i.indicacion as indicacion
            from indicaciones i
            inner join med_per_indicaciones mpi on mpi.id_indicacion = i.id_indicacion
            where mpi.id_medicamento = :idMedicamento
            """, nativeQuery = true)
    public List<IndicacionesDTO> findIndicacionesById(Long idMedicamento);

    @Query(value = """
            select
            nc.id_nombre_comercial as idNombreComercial,
            nc.descripcion as descripcion
            from nombres_comerciales nc
            inner join med_per_nom_comercial mpnc on mpnc.id_nombre_comercial = nc.id_nombre_comercial
            where mpnc.id_medicamento = :idMedicamento
            """, nativeQuery = true)
    public List<NombresComercialesDto> findNombresComercialesById(Long idMedicamento);





}
