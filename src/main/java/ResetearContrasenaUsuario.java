
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Resetear contrasena usuario.
 *
 * @author pablo
 */
public class ResetearContrasenaUsuario {
    private Map<String, String> usuariosContrasenas;

    /**
     * Instantiates a new Resetear contrasena usuario.
     */
    public ResetearContrasenaUsuario() {
        usuariosContrasenas = new HashMap<>();
    }

    /**
     * Agregar usuario contrasena.
     *
     * @param usuario    the usuario
     * @param contrasena the contrasena
     */
    public void agregarUsuarioContrasena(String usuario, String contrasena) {
        usuariosContrasenas.put(usuario, contrasena);
    }

    /**
     * Resetear contrasena boolean.
     *
     * @param usuario         the usuario
     * @param nuevaContrasena the nueva contrasena
     * @return the boolean
     */
    public boolean resetearContrasena(String usuario, String nuevaContrasena) {
        if (usuariosContrasenas.containsKey(usuario)) {
            usuariosContrasenas.put(usuario, nuevaContrasena);
            return true;
        }
        return false;
    }
}
