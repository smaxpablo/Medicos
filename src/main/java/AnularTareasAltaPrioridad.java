
import java.util.Iterator;
import java.util.List;


/**
 * The type Anular tareas alta prioridad.
 *
 * @author pablo
 */
public class AnularTareasAltaPrioridad {
    private List<Tarea> tareas;

    /**
     * Instantiates a new Anular tareas alta prioridad.
     *
     * @param tareas the tareas
     */
    public AnularTareasAltaPrioridad(final List<Tarea> tareas) {
        this.tareas = tareas;
    }

    /**
     * Anular tarea boolean.
     *
     * @param nombre the nombre
     * @return the boolean
     */
    public boolean anularTarea(final String nombre) {
        Iterator<Tarea> iterator = tareas.iterator();

        while (iterator.hasNext()) {
            Tarea tarea = iterator.next();

            if (tarea.getNombre().equals(nombre)
                    && tarea.getPrioridad() == Tarea.Prioridad.ALTA) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
