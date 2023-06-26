
import java.util.HashMap;
import java.util.Map;

/**
 * The type Modificacion roles.
 *
 * @author pablo
 */
public class ModificacionRoles {
    private Map<String, String> asignaciones;

    /**
     * Instantiates a new Modificacion roles.
     */
    public ModificacionRoles() {
        asignaciones = new HashMap<>();
    }

    /**
     * Asignar rol.
     *
     * @param usuario the usuario
     * @param rol     the rol
     */
    public void asignarRol(final String usuario,
                           final String rol) {
        asignaciones.put(usuario, rol);
    }

    /**
     * Modificar rol.
     *
     * @param usuario  the usuario
     * @param nuevoRol the nuevo rol
     */
    public void modificarRol(final String usuario,
                             final String nuevoRol) {
        asignaciones.put(usuario, nuevoRol);
    }

    /**
     * Obtener rol string.
     *
     * @param usuario the usuario
     * @return the string
     */
    public String obtenerRol(final String usuario) {
        return asignaciones.get(usuario);
    }
}
