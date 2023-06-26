
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Registrar inicio guardia.
 *
 * @author pablo
 */
public class RegistrarInicioGuardia {
    private Map<Medico, Guardia> guardias;

    /**
     * Instantiates a new Registrar inicio guardia.
     */
    public RegistrarInicioGuardia() {
        guardias = new HashMap<>();
    }

    /**
     * Registrar inicio.
     *
     * @param medico the medico
     */
    public void registrarInicio(final Medico medico) {
        Guardia guardia = new Guardia(medico, LocalDate.now(), LocalTime.now());
        guardias.put(medico, guardia);
        System.out.println("Se ha registrado el inicio de guardia"
                + " para el médico: "
                + medico.getNombre());
    }

    /**
     * Gets guardias.
     *
     * @return the guardias
     */
    public Map<Medico, Guardia> getGuardias() {
        return guardias;
    }
}
