
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
public class BusquedaFiltradaRoles {
    private Map<String, String> roles;

    public BusquedaFiltradaRoles() {
        roles = new HashMap<>();
    }

    public void asignarRol(String usuario, String rol) {
        roles.put(usuario, rol);
    }

    public String buscarRol(String filtro) {
        for (Map.Entry<String, String> entry : roles.entrySet()) {
            String usuario = entry.getKey();
            String rol = entry.getValue();

            if (usuario.contains(filtro) || rol.contains(filtro)) {
                return rol;
            }
        }

        return null;
    }
}
