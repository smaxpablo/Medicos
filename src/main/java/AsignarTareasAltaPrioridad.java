
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Asignar tareas alta prioridad.
 *
 * @author pablo
 */
public class AsignarTareasAltaPrioridad {
    private List<Tarea> tareas;

    /**
     * Instantiates a new Asignar tareas alta prioridad.
     */
    public AsignarTareasAltaPrioridad() {
        tareas = new ArrayList<>();
    }

    /**
     * Agregar tarea.
     *
     * @param tarea the tarea
     */
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    /**
     * Obtener tareas prioridad list.
     *
     * @return the list
     */
    public List<Tarea> obtenerTareasPrioridad() {
        List<Tarea> tareasPrioridad = new ArrayList<>();

        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() == Tarea.Prioridad.ALTA) {
                tareasPrioridad.add(tarea);
            }
        }

        return tareasPrioridad;
    }
}
