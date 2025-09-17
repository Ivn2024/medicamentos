package com.example.medicamentos.controllers;

import com.example.medicamentos.dto.response.MedicamentoResponse;
import com.example.medicamentos.models.MedicamentosModel;
import com.example.medicamentos.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping(path = "/listaMedicamentos")
    public List<MedicamentosModel> getMedicamento() {
        return this.medicamentoService.getMedicamento();
    }

    @GetMapping("/listaMedicamentos/completos")
    public ResponseEntity<List<MedicamentoResponse>> getMedicamentosCompletos(){
        List<MedicamentoResponse> meddiamentos = medicamentoService.findAllMedicamentosCompletos();
        return ResponseEntity.ok(meddiamentos);
    }

    @PostMapping(path = "/agregarMedicamento")
    public MedicamentosModel saveMedicamento(@RequestBody MedicamentosModel medicamento) {
        return this.medicamentoService.saveMedicamento(medicamento);
    }

    @GetMapping(path = "/find/{id}")
    public Optional<MedicamentosModel> getMedicamentoById(@PathVariable("id") Long id) {
        return this.medicamentoService.getById(id);
    }

    @PutMapping(path = "/update/{id}")
    public MedicamentosModel updateMedicamentoById(@RequestBody MedicamentosModel request, @PathVariable("id") Long id) {
        return this.medicamentoService.updateById(request, id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        try {
            boolean ok = this.medicamentoService.deleteMedicamento(id);

            if (ok) {
                return "El medicamento con el id #" + id + " fue eliminado";
            } else {
                return "Error, no se pudo borrar el medicamento con id #" + id;
            }
        } catch (Exception e) {
            return "Error al intentar eliminar el medicamento con id #" + id;
        }
    }

        @GetMapping(path = "/getDetails/{id}")
    public MedicamentoResponse getDetails(@PathVariable("id") Long id){
        return medicamentoService.findMedicamentoById(id);
        }






//        boolean ok = this.medicamentoService.deleteMedicamento(id);

//        try {
//            if (ok) {
//                return "El medicamento con el id " + id + " fue eliminado";
//            }
//
//        } catch (Exception e) {
//            return "Error ";
//        }
//
////        if (ok){
////            return "El medicamento con el id " + id + " fue eliminado";
////        }else {
////            return "Error, no se pudo borrar el medicamento con id #" + id;
////        }


}
