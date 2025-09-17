package com.example.medicamentos.services;

import com.example.medicamentos.dto.*;
import com.example.medicamentos.dto.response.MedicamentoResponse;
import com.example.medicamentos.models.MedicamentosModel;
import com.example.medicamentos.repositories.ImedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {
    @Autowired
    ImedicamentoRepository medicamentoRepository;

    public List<MedicamentosModel> getMedicamento(){
        return medicamentoRepository.findAll();
    }

    public MedicamentosModel saveMedicamento(MedicamentosModel medicamento){
        return medicamentoRepository.save(medicamento);

    }

    public Optional<MedicamentosModel> getById(Long id){
        return medicamentoRepository.findById(id);
    }

    public MedicamentoResponse findMedicamentoById(Long id){
        MedicamentoResponse medicamento = new MedicamentoResponse();
        MedicamentosModel medicamentosModel =  medicamentoRepository.findById(id).get();
        medicamento.setIdMedicamento(medicamentosModel.getIdMedicamento());
        medicamento.setNombre(medicamentosModel.getNombre());
        medicamento.setDosis(medicamentosModel.getDosis());
        medicamento.setVia(medicamentosModel.getVia());
        List<ContraindicacionesDTO> listaContraindicaciones = medicamentoRepository.findContraindicacionById(id);
        medicamento.setContraindicaciones(listaContraindicaciones);
        List<CuidadosEnfermeriaDTO> listaCuidados = medicamentoRepository.findCuidadoEnfremeriaById(id);
        medicamento.setCuidadosEnfermeria(listaCuidados);
        List<EfectosAdversosDTO> listaEfectos = medicamentoRepository.findEfectoAdversoById(id);
        medicamento.setEfectosAdversos(listaEfectos);
        List<IndicacionesDTO> listaIndicaciones = medicamentoRepository.findIndicacionesById(id);
        medicamento.setIndicaciones(listaIndicaciones);
        List<NombresComercialesDto> listaNombresComerciales = medicamentoRepository.findNombresComercialesById(id);
        medicamento.setNombresComerciales(listaNombresComerciales);

        return medicamento;

    }
    public List<MedicamentoResponse> findAllMedicamentosCompletos(){
        List<MedicamentosModel> medicamentos = medicamentoRepository.findAll();
        List<MedicamentoResponse> medicamentoList = new ArrayList<>();

        for (MedicamentosModel m : medicamentos){
            MedicamentoResponse medicamento = new MedicamentoResponse();
            Long id = m.getIdMedicamento();

            medicamento.setIdMedicamento(id);
            medicamento.setNombre(m.getNombre());
            medicamento.setDosis(m.getDosis());
            medicamento.setVia(m.getVia());

            medicamento.setContraindicaciones(medicamentoRepository.findContraindicacionById(id));
            medicamento.setCuidadosEnfermeria(medicamentoRepository.findCuidadoEnfremeriaById(id));
            medicamento.setEfectosAdversos(medicamentoRepository.findEfectoAdversoById(id));
            medicamento.setIndicaciones(medicamentoRepository.findIndicacionesById(id));
            medicamento.setNombresComerciales(medicamentoRepository.findNombresComercialesById(id));

            medicamentoList.add(medicamento);
        }
        return medicamentoList;

    }



    public MedicamentosModel updateById(MedicamentosModel request, Long id){
        MedicamentosModel medicamentosModel = medicamentoRepository.findById(id).get();
        medicamentosModel.setNombre(request.getNombre());
        medicamentosModel.setVia(request.getVia());
        medicamentosModel.setDosis(request.getDosis());
        medicamentoRepository.save(medicamentosModel);
        return medicamentosModel;

    }
    public Boolean deleteMedicamento (Long id){
        if (medicamentoRepository.existsById(id)){
            medicamentoRepository.deleteById(id);
            return true;
        }else {
            return false;
        }

    }


}
