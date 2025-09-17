package com.example.medicamentos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MedicamentosController {

//    private final List<Medicamento> medicamentos = List.of(
//            new Medicamento(
//                    "Amoxicilina",
//                    Arrays.asList("Amoxil", "Trimox"),
//                    Arrays.asList("Oral"),
//                    "500 mg cada 8 h o 875 mg cada 12 h durante 10‑14 días",
//                    Arrays.asList("Infecciones de vía aérea superior", "Infecciones urinarias", "Infecciones de piel", "Erradicación de H. pylori"),
//                    Arrays.asList("Hipersensibilidad a penicilinas o cefalosporinas"),
//                    Arrays.asList("Diarrea", "Náuseas", "Erupción cutánea", "Reacciones alérgicas raras como anafilaxia"),
//                    Arrays.asList("Verificar alergias antes de administrar", "Finalizar curso completo del tratamiento", "Informar signos de reacciones adversas")
//            ),
//            new Medicamento(
//           "Diphenhydramina",
//    Arrays.asList("Benadryl", "Nytol"),
//    Arrays.asList("Oral", "Inyectable"),
//            "25‑50 mg cada 4‑6 h según necesidad",
//            Arrays.asList("Reacciones alérgicas", "Insomnio", "Mareo o vértigo"),
//            Arrays.asList("Hipersensibilidad; menores de 2 años"),
//            Arrays.asList("Somnolencia", "Boca seca", "Mareo", "Estreñimiento"),
//            Arrays.asList("Monitorear sedación", "Advertir sobre el uso con maquinaria", "Cuidado en ancianos y niños")
//            ),
//            new Medicamento(
//                    "Furosemida",
//                    Arrays.asList("Lasix"),
//                    Arrays.asList("Oral", "IV"),
//                    "Dosis variable según condición clínica; típicamente 20‑80 mg/día",
//                    Arrays.asList("Edema (ICC, enfermedad renal, cirrosis)", "Hipertensión severa"),
//                    Arrays.asList("Hipovolemia grave", "Anuria"),
//                    Arrays.asList("Hipokalemia", "Deshidratación", "Ototoxicidad (con administración IV rápida)"),
//                    Arrays.asList("Control de electrolitos y función renal", "Administrar en la mañana", "Observar signos de deshidratación")
//            ),
//            new Medicamento(
//                    "Ácido acetilsalicílico",
//                    Arrays.asList("Aspirina", "ASA"),
//                    Arrays.asList("Oral"),
//                    "81–325 mg una vez al día en prevención cardiovascular",
//                    Arrays.asList("Prevención secundaria cardiovascular", "Alivio de dolor leve"),
//                    Arrays.asList("Niños/adolescentes con infección viral", "Antes de cirugía (por riesgo de sangrado)"),
//                    Arrays.asList("Irritación gástrica", "Sangrado gastrointestinal"),
//                    Arrays.asList("Administrar con alimentos", "Vigilar señales de sangrado", "Advertir suspendido previo a cirugías")
//            ),
//            new Medicamento(
//                    "Levotiroxina",
//                    Arrays.asList("Synthroid"),
//                    Arrays.asList("Oral"),
//                    "Dosis individualizada según TSH/T4",
//                    Arrays.asList("Hipotiroidismo"),
//                    Arrays.asList("Hipertiroidismo no tratado", "Infarto reciente"),
//                    Arrays.asList("Palpitaciones", "Ansiedad", "Pérdida de peso", "Signos de tirotoxicosis si dosis excesiva"),
//                    Arrays.asList("Administrar en ayunas", "Monitorear niveles de TSH", "Evitar antiácidos cerca de la toma", "Educar sobre adherencia")
//            ),
//            new Medicamento(
//                    "Ondansetrón",
//                    Arrays.asList("Zofran"),
//                    Arrays.asList("Oral", "IV"),
//                    "Dosis según protocolo antiemético (por quimioterapia o posoperatorio)",
//                    Arrays.asList("Náuseas y vómitos inducidos por quimioterapia o cirugía"),
//                    Arrays.asList("Síndrome de QT largo", "Uso con otros medicamentos que prolongan QT"),
//                    Arrays.asList("Prolongación de QT", "Cefalea", "Estreñimiento"),
//                    Arrays.asList("Monitorizar ECG en riesgo cardíaco", "Observar signos de síndrome serotoninérgico")
//            ),
//            new Medicamento(
//                    "Haloperidol",
//                    Arrays.asList("Haldol"),
//                    Arrays.asList("Oral", "IM", "IV"),
//                    "Dosis ajustada según condición psiquiátrica y tolerancia del paciente",
//                    Arrays.asList("Psicosis aguda", "Esquizofrenia", "Agitación severa"),
//                    Arrays.asList("Parkinson; demencia vascular en ancianos (riesgo mortal)"),
//                    Arrays.asList("Síntomas extrapiramidales", "Sedación", "Prolongación de QT", "Aumento de prolactina"),
//                    Arrays.asList("Evaluar EPS regularmente", "Monitorizar ECG", "Educar sobre efectos y adherencia")
//            ),
//            new Medicamento(
//                    "Fenitoína",
//                    Arrays.asList("Dilantin"),
//                    Arrays.asList("Oral", "IV"),
//                    "Mantener niveles séricos entre 10‑20 µg/mL",
//                    Arrays.asList("Epilepsia", "Convulsiones tónico-clónicas"),
//                    Arrays.asList("Bradicardia", "Bloqueo AV sin marcapasos"),
//                    Arrays.asList("Hiperplasia gingival", "Ataxia", "Nistagmo", "Toxicidad neurológica"),
//                    Arrays.asList("Monitorear niveles séricos", "Cuidado dental (higiene oral)", "Infusión lenta si IV", "Evitar suspensión brusca")
//            ),
//            new Medicamento(
//                    "Morfina",
//                    Arrays.asList("MS Contin"),
//                    Arrays.asList("Oral", "IV", "IM", "Subcutánea"),
//                    "Dosis según dolor; iniciar baja y ajustar según tolerancia",
//                    Arrays.asList("Dolor severo, agudo o crónico"),
//                    Arrays.asList("Depresión respiratoria sin tratamiento", "Trauma craneal", "Asma no controlada"),
//                    Arrays.asList("Depresión respiratoria", "Sedación", "Estreñimiento", "Hipotensión", "Dependencia física"),
//                    Arrays.asList("Monitor respiratorio", "Escala de sedación", "Prevenir estreñimiento", "Cambios posturales lentos", "Evaluar signos de abuso")
//            ),
//            new Medicamento(
//                    "Diltiazem",
//                    Arrays.asList("Cardizem"),
//                    Arrays.asList("Oral", "IV"),
//                    "Ajustar dosis según respuesta (frecuencia cardíaca y presión)",
//                    Arrays.asList("Hipertensión", "Angina de pecho", "Control de frecuencia en taquiarritmias"),
//                    Arrays.asList("Bloqueo AV", "Síndrome del nódulo sinusal", "Insuficiencia cardíaca grave"),
//                    Arrays.asList("Bradicardia", "Hipotensión", "Edema", "Signos de ICC"),
//                    Arrays.asList("Monitorear ECG y frecuencia cardíaca", "Educar sobre cambios posturales lentos")
//            )
//
//    );
//    @GetMapping("/medicamentos")
//    public List<Medicamento> listaDeMedicamentos(){
//        return medicamentos;
//    }
//    @GetMapping("/sintomas")
//    public List<Medicamento> sintoma(@RequestParam String sintoma){
//        List<Medicamento> medicamentoConSintoma = new ArrayList<>();
//        for (Medicamento medicamento: medicamentos){
//            if (medicamento.getIndicaciones().contains(sintoma)){
//                medicamentoConSintoma.add(medicamento);
//            }
//        }
//        return medicamentoConSintoma;
//    }



}
