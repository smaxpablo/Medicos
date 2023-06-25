
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class AsignarTareasAltaPrioridad {
    private List<Tarea> tareas;

    public AsignarTareasAltaPrioridad() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

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
