
import java.util.HashMap;
import java.util.Map;

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
    public void agregarUsuarioContrasena(final String usuario,
                                         final String contrasena) {
        usuariosContrasenas.put(usuario, contrasena);
    }

    /**
     * Resetear contrasena boolean.
     *
     * @param usuario         the usuario
     * @param nuevaContrasena the nueva contrasena
     * @return the boolean
     */
    public boolean resetearContrasena(final String usuario,
                                      final String nuevaContrasena) {
        if (usuariosContrasenas.containsKey(usuario)) {
            usuariosContrasenas.put(usuario, nuevaContrasena);
            return true;
        }
        return false;
    }
}
