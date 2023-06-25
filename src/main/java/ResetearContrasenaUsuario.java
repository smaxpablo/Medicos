
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
public class ResetearContrasenaUsuario {
    private Map<String, String> usuariosContrasenas;

    public ResetearContrasenaUsuario() {
        usuariosContrasenas = new HashMap<>();
    }

    public void agregarUsuarioContrasena(String usuario, String contrasena) {
        usuariosContrasenas.put(usuario, contrasena);
    }

    public boolean resetearContrasena(String usuario, String nuevaContrasena) {
        if (usuariosContrasenas.containsKey(usuario)) {
            usuariosContrasenas.put(usuario, nuevaContrasena);
            return true;
        }
        return false;
    }
}
