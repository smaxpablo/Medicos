
import java.util.ArrayList;
import java.util.List;


/**
 * The type Creacion roles.
 *
 * @author pablo
 */
public class CreacionRoles {
    private List<String> roles;

    /**
     * Instantiates a new Creacion roles.
     */
    public CreacionRoles() {
        roles = new ArrayList<>();
    }

    /**
     * Agregar rol.
     *
     * @param rol the rol
     */
    public void agregarRol(final String rol) {
        roles.add(rol);
    }

    /**
     * Listar roles.
     */
    public void listarRoles() {
        System.out.println("Lista de Roles:");
        for (String rol : roles) {
            System.out.println("- " + rol);
        }
    }

}
