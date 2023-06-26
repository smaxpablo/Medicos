
import java.util.Map;

/**
 * The type Listar guardias asignadas.
 *
 * @author pablo
 */
public class ListarGuardiasAsignadas {
    private Map<Medico, Guardia> guardias;

    /**
     * Instantiates a new Listar guardias asignadas.
     *
     * @param guardias the guardias
     */
    public ListarGuardiasAsignadas(final Map<Medico, Guardia> guardias) {
        this.guardias = guardias;
    }

    /**
     * Listar guardias.
     */
    public void listarGuardias() {
        System.out.println("Lista de Guardias Asignadas:");

        for (Map.Entry<Medico, Guardia> entry : guardias.entrySet()) {
            Medico medico = entry.getKey();
            Guardia guardia = entry.getValue();

            System.out.println("Médico: " + medico.getNombre());
            System.out.println("Fecha de Inicio: " + guardia.getFechaInicio());
            System.out.println("Hora de Inicio: " + guardia.getHoraInicio());
            System.out.println("Fecha de Fin: " + guardia.getFechaFin());
            System.out.println("Hora de Fin: " + guardia.getHoraFin());
            System.out.println("------------------------------------");
        }
    }
}
