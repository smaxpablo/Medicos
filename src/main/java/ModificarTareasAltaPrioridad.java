
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class ModificarTareasAltaPrioridad {
    private List<Tarea> tareas;

    public ModificarTareasAltaPrioridad(List<Tarea> tareas) {
        this.tareas = tareas;
    }

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
