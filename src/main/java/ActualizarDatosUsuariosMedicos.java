
import java.util.ArrayList;
import java.util.List;


/**
 * The type Actualizar datos usuarios medicos.
 *
 * @author pablo
 */
public class ActualizarDatosUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    /**
     * Instantiates a new Actualizar datos usuarios medicos.
     */
    public ActualizarDatosUsuariosMedicos() {
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
     * Actualizar datos medico boolean.
     *
     * @param nombre            the nombre
     * @param nuevaEspecialidad the nueva especialidad
     * @return the boolean
     */
    public boolean actualizarDatosMedico(final String nombre,
                                         final String nuevaEspecialidad) {
        for (Medico medico : usuariosMedicos) {
            if (medico.getNombre().equals(nombre)) {
                medico.setEspecialidad(nuevaEspecialidad);
                return true;
            }
        }
        return false;
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
