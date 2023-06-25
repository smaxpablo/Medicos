
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class PlanificacionGuardias {
private List<Medico> medicos;

    public PlanificacionGuardias() {
        medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void planificarGuardia(LocalDate fecha) {
        for (Medico medico : medicos) {
            medico.agregarGuardia(fecha);
        }
    }

    public void imprimirPlanificacion() {
        System.out.println("Planificación de Guardias:");
        for (Medico medico : medicos) {
            System.out.println("Médico: " + medico.getNombre() + " " + medico.getApellido());
            System.out.println("Guardias programadas:");
            for (LocalDate fecha : medico.getGuardias()) {
                System.out.println(fecha);
            }
            System.out.println("------------------------");
        }
    }
}
