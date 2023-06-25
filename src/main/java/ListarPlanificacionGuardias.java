
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class ListarPlanificacionGuardias {
    private Map<Medico, List<LocalDate>> planificacion;

    public ListarPlanificacionGuardias() {
        planificacion = new HashMap<>();
    }

    public void agregarGuardia(Medico medico, LocalDate fecha) {
        if (!planificacion.containsKey(medico)) {
            planificacion.put(medico, new ArrayList<>());
        }
        planificacion.get(medico).add(fecha);
    }

    public void listarPlanificacionGuardias() {
        System.out.println("Planificación de guardias de médicos:");
        for (Map.Entry<Medico, List<LocalDate>> entry : planificacion.entrySet()) {
            Medico medico = entry.getKey();
            List<LocalDate> guardias = entry.getValue();
            System.out.println("Médico: " + medico.getNombre() + " " + medico.getApellido());
            System.out.println("Guardias programadas:");
            for (LocalDate fecha : guardias) {
                System.out.println("- " + fecha);
            }
            System.out.println("------------------------");
        }
    }
}
