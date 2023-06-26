
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    public void asignarRol(String usuario, boolean activo) {
        rolesActivos.put(usuario, activo);
    }

    /**
     * Eliminar rol boolean.
     *
     * @param usuario the usuario
     * @return the boolean
     */
    public boolean eliminarRol(String usuario) {
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
    public boolean obtenerRolActivo(String usuario) {
        return rolesActivos.getOrDefault(usuario, false);
    }
}
