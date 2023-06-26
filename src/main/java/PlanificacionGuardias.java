
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Planificacion guardias.
 *
 * @author pablo
 */
public class PlanificacionGuardias {
private List<Medico> medicos;

    /**
     * Instantiates a new Planificacion guardias.
     */
    public PlanificacionGuardias() {
        medicos = new ArrayList<>();
    }

    /**
     * Agregar medico.
     *
     * @param medico the medico
     */
    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    /**
     * Planificar guardia.
     *
     * @param fecha the fecha
     */
    public void planificarGuardia(LocalDate fecha) {
        for (Medico medico : medicos) {
            medico.agregarGuardia(fecha);
        }
    }

    /**
     * Imprimir planificacion.
     */
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
