
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Buscar medicos tareas alta prioridad.
 *
 * @author pablo
 */
public class BuscarMedicosTareasAltaPrioridad {
    private List<Medico> medicos;

    /**
     * Instantiates a new Buscar medicos tareas alta prioridad.
     *
     * @param medicos the medicos
     */
    public BuscarMedicosTareasAltaPrioridad(List<Medico> medicos) {
        this.medicos = medicos;
    }

    /**
     * Buscar medicos tareas alta prioridad list.
     *
     * @return the list
     */
    public List<Medico> buscarMedicosTareasAltaPrioridad() {
        List<Medico> medicosPrioridad = new ArrayList<>();

        for (Medico medico : medicos) {
            if (medico.tieneTareasAltaPrioridad()) {
                medicosPrioridad.add(medico);
            }
        }

        return medicosPrioridad;
    }
}
