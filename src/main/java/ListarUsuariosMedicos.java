
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
public class ListarUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    public ListarUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        usuariosMedicos.add(medico);
    }

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
