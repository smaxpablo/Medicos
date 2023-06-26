
import java.util.ArrayList;
import java.util.List;

/**
 * The type Registro usuario.
 *
 * @author pablo
 */
public class RegistroUsuario {
    private List<Usuario> usuarios;

    /**
     * Instantiates a new Registro usuario.
     */
    public RegistroUsuario() {
        usuarios = new ArrayList<>();
    }

    /**
     * Registrar usuario boolean.
     *
     * @param usuario the usuario
     * @return the boolean
     */
    public boolean registrarUsuario(final Usuario usuario) {
        // Verificar si el usuario ya está registrado
        if (existeUsuario(usuario.getUsername())) {
            return false;
        }

        // Registrar el usuario
        usuarios.add(usuario);
        return true;
    }

    /**
     * Existe usuario boolean.
     *
     * @param username the username
     * @return the boolean
     */
    public boolean existeUsuario(final String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
