
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Modificar tareas alta prioridad.
 *
 * @author pablo
 */
public class ModificarTareasAltaPrioridad {
    private List<Tarea> tareas;

    /**
     * Instantiates a new Modificar tareas alta prioridad.
     *
     * @param tareas the tareas
     */
    public ModificarTareasAltaPrioridad(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    /**
     * Modificar tarea boolean.
     *
     * @param nombre         the nombre
     * @param nuevaPrioridad the nueva prioridad
     * @return the boolean
     */
    public boolean modificarTarea(String nombre, Tarea.Prioridad nuevaPrioridad) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombre) && tarea.getPrioridad() == Tarea.Prioridad.ALTA) {
                tarea.setPrioridad(nuevaPrioridad);
                return true;
            }
        }
        return false;
    }
}
