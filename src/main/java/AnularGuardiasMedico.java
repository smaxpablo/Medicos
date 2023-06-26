
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The type Anular guardias medico.
 *
 * @author pablo
 */
public class AnularGuardiasMedico {
private Map<Medico, List<LocalDate>> planificacion;

    /**
     * Instantiates a new Anular guardias medico.
     */
    public AnularGuardiasMedico() {
        planificacion = new HashMap<>();
    }

    /**
     * Anular guardias.
     *
     * @param medico the medico
     */
    public void anularGuardias(final Medico medico) {
        if (planificacion.containsKey(medico)) {
            planificacion.remove(medico);
            System.out.println("Guardias del médico anuladas exitosamente.");
        } else {
            System.out.println("El médico no tiene una planificación de "
                    + "guardias.");
        }
    }
}
