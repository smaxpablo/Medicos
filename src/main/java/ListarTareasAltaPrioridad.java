
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Listar tareas alta prioridad.
 *
 * @author pablo
 */
public class ListarTareasAltaPrioridad {
    private List<Tarea> tareas;

    /**
     * Instantiates a new Listar tareas alta prioridad.
     *
     * @param tareas the tareas
     */
    public ListarTareasAltaPrioridad(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    /**
     * Listar tareas prioridad.
     */
    public void listarTareasPrioridad() {
        System.out.println("Tareas de alta prioridad:");
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() == Tarea.Prioridad.ALTA) {
                System.out.println("- " + tarea.getNombre());
            }
        }
    }
}
