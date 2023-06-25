
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class EliminacionLogicaRoles {
    private Map<String, Boolean> rolesActivos;

    public EliminacionLogicaRoles() {
        rolesActivos = new HashMap<>();
    }

    public void asignarRol(String usuario, boolean activo) {
        rolesActivos.put(usuario, activo);
    }

    public boolean eliminarRol(String usuario) {
        if (rolesActivos.containsKey(usuario)) {
            rolesActivos.remove(usuario);
            return true;
        }
        return false;
    }

    public boolean obtenerRolActivo(String usuario) {
        return rolesActivos.getOrDefault(usuario, false);
    }
}
