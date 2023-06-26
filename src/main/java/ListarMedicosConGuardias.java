
import java.util.List;


/**
 * The type Listar medicos con guardias.
 *
 * @author pablo
 */
public class ListarMedicosConGuardias {
    private List<Medico> medicos;

    /**
     * Instantiates a new Listar medicos con guardias.
     *
     * @param medicos the medicos
     */
    public ListarMedicosConGuardias(final List<Medico> medicos) {
        this.medicos = medicos;
    }

    /**
     * Listar medicos con guardias.
     */
    public void listarMedicosConGuardias() {
        System.out.println("Médicos con guardias asignadas:");
        for (Medico medico : medicos) {
            if (!medico.getGuardias().isEmpty()) {
                System.out.println("- " + medico.getNombre() + " "
                        + medico.getApellido());
            }
        }
    }
}
