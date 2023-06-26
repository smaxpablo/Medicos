
import java.util.ArrayList;
import java.util.List;


/**
 * The type Crear usuarios medicos.
 *
 * @author pablo
 */
public class CrearUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    /**
     * Instantiates a new Crear usuarios medicos.
     */
    public CrearUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    /**
     * Crear usuario medico.
     *
     * @param nombre       the nombre
     * @param especialidad the especialidad
     */
    public void crearUsuarioMedico(final String nombre,
                                   final String especialidad) {
        Medico medico = new Medico(nombre, especialidad);
        usuariosMedicos.add(medico);
    }

    /**
     * Gets usuarios medicos.
     *
     * @return the usuarios medicos
     */
    public List<Medico> getUsuariosMedicos() {
        return usuariosMedicos;
    }
}
