
import java.util.HashMap;
import java.util.Map;

/**
 * The type Asignacion roles.
 *
 * @author pablo
 */
public class AsignacionRoles {
private Map<String, String> asignaciones;

    /**
     * Instantiates a new Asignacion roles.
     */
    public AsignacionRoles() {
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
     * Obtener rol string.
     *
     * @param usuario the usuario
     * @return the string
     */
    public String obtenerRol(final String usuario) {
        return asignaciones.get(usuario);
    }
}
