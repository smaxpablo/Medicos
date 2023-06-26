
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Consultar medicos tareas alta prioridad.
 *
 * @author pablo
 */
public class ConsultarMedicosTareasAltaPrioridad {
    private List<Medico> medicos;

    /**
     * Instantiates a new Consultar medicos tareas alta prioridad.
     */
    public ConsultarMedicosTareasAltaPrioridad() {
        medicos = new ArrayList<>();
    }

    /**
     * Agregar medico.
     *
     * @param medico the medico
     */
    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    /**
     * Obtener medicos con tareas alta prioridad list.
     *
     * @return the list
     */
    public List<Medico> obtenerMedicosConTareasAltaPrioridad() {
        List<Medico> medicosConTareasAltaPrioridad = new ArrayList<>();

        for (Medico medico : medicos) {
            if (medico.tieneTareasAltaPrioridad()) {
                medicosConTareasAltaPrioridad.add(medico);
            }
        }

        return medicosConTareasAltaPrioridad;
    }
}
