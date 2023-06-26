
import java.util.ArrayList;
import java.util.List;


/**
 * The type Listado medicos.
 *
 * @author pablo
 */
public class ListadoMedicos {
    private List<Medico> medicos;

    /**
     * Instantiates a new Listado medicos.
     */
    public ListadoMedicos() {
        medicos = new ArrayList<>();
    }

    /**
     * Agregar medico.
     *
     * @param medico the medico
     */
    public void agregarMedico(final Medico medico) {
        medicos.add(medico);
    }

    /**
     * Obtener medicos list.
     *
     * @return the list
     */
    public List<Medico> obtenerMedicos() {
        return medicos;
    }
}
