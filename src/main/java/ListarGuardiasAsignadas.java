
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class ListarGuardiasAsignadas {
    private Map<Medico, Guardia> guardias;

    public ListarGuardiasAsignadas(Map<Medico, Guardia> guardias) {
        this.guardias = guardias;
    }

    public void listarGuardias() {
        System.out.println("Lista de Guardias Asignadas:");

        for (Map.Entry<Medico, Guardia> entry : guardias.entrySet()) {
            Medico medico = entry.getKey();
            Guardia guardia = entry.getValue();

            System.out.println("Médico: " + medico.getNombre());
            System.out.println("Fecha de Inicio: " + guardia.getFechaInicio());
            System.out.println("Hora de Inicio: " + guardia.getHoraInicio());
            System.out.println("Fecha de Fin: " + guardia.getFechaFin());
            System.out.println("Hora de Fin: " + guardia.getHoraFin());
            System.out.println("------------------------------------");
        }
    }
}
