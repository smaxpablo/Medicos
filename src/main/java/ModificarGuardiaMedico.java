
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The type Modificar guardia medico.
 *
 * @author pablo
 */
public class ModificarGuardiaMedico {
private Map<Medico, List<LocalDate>> planificacion;

    /**
     * Instantiates a new Modificar guardia medico.
     */
    public ModificarGuardiaMedico() {
        planificacion = new HashMap<>();
    }

    /**
     * Modificar guardia.
     *
     * @param medico         the medico
     * @param fechaExistente the fecha existente
     * @param nuevaFecha     the nueva fecha
     */
    public void modificarGuardia(final Medico medico,
                                 final LocalDate fechaExistente,
                                 final LocalDate nuevaFecha) {
        if (planificacion.containsKey(medico)) {
            List<LocalDate> guardias = planificacion.get(medico);
            if (guardias.contains(fechaExistente)) {
                guardias.remove(fechaExistente);
                guardias.add(nuevaFecha);
                System.out.println("Guardia modificada exitosamente.");
            } else {
                System.out.println("La fecha existente no se encontró en la "
                        + "planificación del médico.");
            }
        } else {
            System.out.println("El médico no tiene una planificación "
                    + "de guardias.");
        }
    }
}
