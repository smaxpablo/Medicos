
import java.util.HashMap;
import java.util.Map;


/**
 * The type Busqueda filtrada roles.
 *
 * @author pablo
 */
public class BusquedaFiltradaRoles {
    private Map<String, String> roles;

    /**
     * Instantiates a new Busqueda filtrada roles.
     */
    public BusquedaFiltradaRoles() {
        roles = new HashMap<>();
    }

    /**
     * Asignar rol.
     *
     * @param usuario the usuario
     * @param rol     the rol
     */
    public void asignarRol(final String usuario,
                           final String rol) {
        roles.put(usuario, rol);
    }

    /**
     * Buscar rol string.
     *
     * @param filtro the filtro
     * @return the string
     */
    public String buscarRol(final String filtro) {
        for (Map.Entry<String, String> entry : roles.entrySet()) {
            String usuario = entry.getKey();
            String rol = entry.getValue();

            if (usuario.contains(filtro) || rol.contains(filtro)) {
                return rol;
            }
        }

        return null;
    }
}
