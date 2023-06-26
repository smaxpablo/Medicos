
import java.util.ArrayList;
import java.util.List;


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
    public void agregarTarea(final Tarea tarea) {
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
