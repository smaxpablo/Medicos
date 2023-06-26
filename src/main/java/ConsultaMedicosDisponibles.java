
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * The type Consulta medicos disponibles.
 *
 * @author pablo
 */
public class ConsultaMedicosDisponibles {
    private List<Medico> medicos;

    /**
     * Instantiates a new Consulta medicos disponibles.
     */
    public ConsultaMedicosDisponibles() {
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
     * Consultar medicos disponibles list.
     *
     * @param fecha the fecha
     * @return the list
     */
    public List<Medico> consultarMedicosDisponibles(final LocalDate fecha) {
        List<Medico> medicosDisponibles = new ArrayList<>();
        for (Medico medico : medicos) {
            if (medico.getFechaDisponible().isEqual(fecha)) {
                medicosDisponibles.add(medico);
            }
        }
        return medicosDisponibles;
    }
}
