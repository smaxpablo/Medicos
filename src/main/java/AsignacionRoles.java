
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    public void asignarRol(String usuario, String rol) {
        asignaciones.put(usuario, rol);
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
