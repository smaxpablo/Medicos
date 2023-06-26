
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 * The type Descargar reporte guardias medicos.
 *
 * @author pablo
 */
public class DescargarReporteGuardiasMedicos {
    private List<Medico> medicos;

    /**
     * Instantiates a new Descargar reporte guardias medicos.
     *
     * @param medicos the medicos
     */
    public DescargarReporteGuardiasMedicos(final List<Medico> medicos) {
        this.medicos = medicos;
    }

    /**
     * Descargar reporte.
     */
    public void descargarReporte() {
        try (FileWriter writer =
                     new FileWriter("reporte_guardias_medicos.txt")) {
            for (Medico medico : medicos) {
                writer.write("Nombre: " + medico.getNombre() + "\n");
                writer.write("Apellido: " + medico.getApellido() + "\n");
                writer.write("Especialidad: "
                        + medico.getEspecialidad() + "\n");
                writer.write("Guardias:\n");

                for (LocalDate fecha : medico.getGuardias()) {
                    writer.write("- " + fecha.toString() + "\n");
                }

                writer.write("------------------------\n");
            }

            System.out.println("El reporte se ha descargado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al descargar el reporte: "
                    + e.getMessage());
        }
    }
}
