
import java.util.ArrayList;
import java.util.List;


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
    public void agregarMedico(final Medico medico) {
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
