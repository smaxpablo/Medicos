
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class GenerarReportesMedicos {
    private List<Medico> usuariosMedicos;

    public GenerarReportesMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        usuariosMedicos.add(medico);
    }

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
