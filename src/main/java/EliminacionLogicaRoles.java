
import java.util.HashMap;
import java.util.Map;


/**
 * The type Eliminacion logica roles.
 *
 * @author pablo
 */
public class EliminacionLogicaRoles {
    private Map<String, Boolean> rolesActivos;

    /**
     * Instantiates a new Eliminacion logica roles.
     */
    public EliminacionLogicaRoles() {
        rolesActivos = new HashMap<>();
    }

    /**
     * Asignar rol.
     *
     * @param usuario the usuario
     * @param activo  the activo
     */
    public void asignarRol(final String usuario,
                           final boolean activo) {
        rolesActivos.put(usuario, activo);
    }

    /**
     * Eliminar rol boolean.
     *
     * @param usuario the usuario
     * @return the boolean
     */
    public boolean eliminarRol(final String usuario) {
        if (rolesActivos.containsKey(usuario)) {
            rolesActivos.remove(usuario);
            return true;
        }
        return false;
    }

    /**
     * Obtener rol activo boolean.
     *
     * @param usuario the usuario
     * @return the boolean
     */
    public boolean obtenerRolActivo(final String usuario) {
        return rolesActivos.getOrDefault(usuario, false);
    }
}
