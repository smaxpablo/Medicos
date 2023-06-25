
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class AnularTareasAltaPrioridad {
    private List<Tarea> tareas;

    public AnularTareasAltaPrioridad(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public boolean anularTarea(String nombre) {
        Iterator<Tarea> iterator = tareas.iterator();

        while (iterator.hasNext()) {
            Tarea tarea = iterator.next();

            if (tarea.getNombre().equals(nombre) && tarea.getPrioridad() == Tarea.Prioridad.ALTA) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
