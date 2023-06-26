
import java.util.List;

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
    public ListarTareasAltaPrioridad(final List<Tarea> tareas) {
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
