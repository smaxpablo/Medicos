
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class DescargarReporteGuardiasMedicos {
    private List<Medico> medicos;

    public DescargarReporteGuardiasMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public void descargarReporte() {
        try (FileWriter writer = new FileWriter("reporte_guardias_medicos.txt")) {
            for (Medico medico : medicos) {
                writer.write("Nombre: " + medico.getNombre() + "\n");
                writer.write("Apellido: " + medico.getApellido() + "\n");
                writer.write("Especialidad: " + medico.getEspecialidad() + "\n");
                writer.write("Guardias:\n");

                for (LocalDate fecha : medico.getGuardias()) {
                    writer.write("- " + fecha.toString() + "\n");
                }

                writer.write("------------------------\n");
            }

            System.out.println("El reporte se ha descargado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al descargar el reporte: " + e.getMessage());
        }
    }
}
