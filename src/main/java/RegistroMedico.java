
import java.util.ArrayList;
import java.util.List;

/**
 * The type Registro medico.
 *
 * @author pablo
 */
public class RegistroMedico {
    private List<Medico> medicos;

    /**
     * Instantiates a new Registro medico.
     */
    public RegistroMedico() {
        medicos = new ArrayList<>();
    }

    /**
     * Registrar medico boolean.
     *
     * @param medico the medico
     * @return the boolean
     */
    public boolean registrarMedico(final Medico medico) {
        // Verificar si el médico ya está registrado
        if (existeMedico(medico.getNumeroColegiado())) {
            return false;
        }

        // Registrar el médico
        medicos.add(medico);
        return true;
    }

    /**
     * Existe medico boolean.
     *
     * @param numeroColegiado the numero colegiado
     * @return the boolean
     */
    public boolean existeMedico(final int numeroColegiado) {
        for (Medico medico : medicos) {
            if (medico.getNumeroColegiado() == numeroColegiado) {
                return true;
            }
        }
        return false;
    }
}
