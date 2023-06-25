
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class RegistroUsuario {
    private List<Usuario> usuarios;

    public RegistroUsuario() {
        usuarios = new ArrayList<>();
    }

    public boolean registrarUsuario(Usuario usuario) {
        // Verificar si el usuario ya está registrado
        if (existeUsuario(usuario.getUsername())) {
            return false;
        }

        // Registrar el usuario
        usuarios.add(usuario);
        return true;
    }

    public boolean existeUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
