
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The type Listar planificacion guardias.
 *
 * @author pablo
 */
public class ListarPlanificacionGuardias {
    private Map<Medico, List<LocalDate>> planificacion;

    /**
     * Instantiates a new Listar planificacion guardias.
     */
    public ListarPlanificacionGuardias() {
        planificacion = new HashMap<>();
    }

    /**
     * Agregar guardia.
     *
     * @param medico the medico
     * @param fecha  the fecha
     */
    public void agregarGuardia(final Medico medico,
                               final LocalDate fecha) {
        if (!planificacion.containsKey(medico)) {
            planificacion.put(medico, new ArrayList<>());
        }
        planificacion.get(medico).add(fecha);
    }

    /**
     * Listar planificacion guardias.
     */
    public void listarPlanificacionGuardias() {
        System.out.println("Planificación de guardias de médicos:");
        for (Map.Entry<Medico, List<LocalDate>> entry
                : planificacion.entrySet()) {
            Medico medico = entry.getKey();
            List<LocalDate> guardias = entry.getValue();
            System.out.println("Médico: " + medico.getNombre() + " "
                    + medico.getApellido());
            System.out.println("Guardias programadas:");
            for (LocalDate fecha : guardias) {
                System.out.println("- " + fecha);
            }
            System.out.println("------------------------");
        }
    }
}
