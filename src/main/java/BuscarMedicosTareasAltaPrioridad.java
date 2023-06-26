
import java.util.ArrayList;
import java.util.List;


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
    public BuscarMedicosTareasAltaPrioridad(final List<Medico> medicos) {
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
