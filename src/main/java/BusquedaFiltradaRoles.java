
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Busqueda filtrada roles.
 *
 * @author pablo
 */
public class BusquedaFiltradaRoles {
    private Map<String, String> roles;

    /**
     * Instantiates a new Busqueda filtrada roles.
     */
    public BusquedaFiltradaRoles() {
        roles = new HashMap<>();
    }

    /**
     * Asignar rol.
     *
     * @param usuario the usuario
     * @param rol     the rol
     */
    public void asignarRol(String usuario, String rol) {
        roles.put(usuario, rol);
    }

    /**
     * Buscar rol string.
     *
     * @param filtro the filtro
     * @return the string
     */
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
