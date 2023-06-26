
import java.util.ArrayList;
import java.util.List;


/**
 * The type Generar reportes medicos.
 *
 * @author pablo
 */
public class GenerarReportesMedicos {
    private List<Medico> usuariosMedicos;

    /**
     * Instantiates a new Generar reportes medicos.
     */
    public GenerarReportesMedicos() {
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
     * Generar reporte.
     */
    public void generarReporte() {
        System.out.println("Reporte de Médicos:");
        for (Medico medico : usuariosMedicos) {
            System.out.println("Nombre: " + medico.getNombre());
            System.out.println("Apellido: " + medico.getApellido());
            System.out.println("Especialidad: " + medico.getEspecialidad());
            System.out.println("------------------------");
        }
    }
}
