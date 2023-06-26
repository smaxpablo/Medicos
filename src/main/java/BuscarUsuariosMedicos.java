
import java.util.ArrayList;
import java.util.List;

/**
 * The type Buscar usuarios medicos.
 *
 * @author pablo
 */
public class BuscarUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    /**
     * Instantiates a new Buscar usuarios medicos.
     */
    public BuscarUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    /**
     * Agregar medico.
     *
     * @param medico the medico
     */
    public void agregarMedico(final Medico medico) {
        usuariosMedicos.add(medico);
    }

    /**
     * Buscar medico por especialidad list.
     *
     * @param especialidad the especialidad
     * @return the list
     */
    public List<Medico> buscarMedicoPorEspecialidad(final String especialidad) {
        List<Medico> medicosEncontrados = new ArrayList<>();

        for (Medico medico : usuariosMedicos) {
            if (medico.getEspecialidad().equalsIgnoreCase(especialidad)) {
                medicosEncontrados.add(medico);
            }
        }

        return medicosEncontrados;
    }
}
