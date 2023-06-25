
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
public class ModificacionRoles {
    private Map<String, String> asignaciones;

    public ModificacionRoles() {
        asignaciones = new HashMap<>();
    }

    public void asignarRol(String usuario, String rol) {
        asignaciones.put(usuario, rol);
    }

    public void modificarRol(String usuario, String nuevoRol) {
        asignaciones.put(usuario, nuevoRol);
    }

    public String obtenerRol(String usuario) {
        return asignaciones.get(usuario);
    }
}
