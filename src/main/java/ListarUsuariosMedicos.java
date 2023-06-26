
import java.util.ArrayList;
import java.util.List;


/**
 * The type Listar usuarios medicos.
 *
 * @author pablo
 */
public class ListarUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    /**
     * Instantiates a new Listar usuarios medicos.
     */
    public ListarUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    /**
     * Agregar medico.
     *
     * @param medico the medico
     */
    public void agregarMedico(final Medico medico) {
        usuariosMedicos.add(medico);
    }

    /**
     * Listar usuarios medicos.
     */
    public void listarUsuariosMedicos() {
        if (usuariosMedicos.isEmpty()) {
            System.out.println("No hay usuarios de médicos registrados.");
        } else {
            for (Medico medico : usuariosMedicos) {
                System.out.println("Nombre: " + medico.getNombre());
                System.out.println("Apellido: " + medico.getApellido());
                System.out.println("Especialidad: " + medico.getEspecialidad());
                System.out.println("------------------------");
            }
        }
    }
}
