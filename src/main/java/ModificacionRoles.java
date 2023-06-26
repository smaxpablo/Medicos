
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    public void asignarRol(String usuario, String rol) {
        asignaciones.put(usuario, rol);
    }

    /**
     * Modificar rol.
     *
     * @param usuario  the usuario
     * @param nuevoRol the nuevo rol
     */
    public void modificarRol(String usuario, String nuevoRol) {
        asignaciones.put(usuario, nuevoRol);
    }

    /**
     * Obtener rol string.
     *
     * @param usuario the usuario
     * @return the string
     */
    public String obtenerRol(String usuario) {
        return asignaciones.get(usuario);
    }
}
