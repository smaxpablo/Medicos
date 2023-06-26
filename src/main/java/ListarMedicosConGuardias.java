
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    public ListarMedicosConGuardias(List<Medico> medicos) {
        this.medicos = medicos;
    }

    /**
     * Listar medicos con guardias.
     */
    public void listarMedicosConGuardias() {
        System.out.println("Médicos con guardias asignadas:");
        for (Medico medico : medicos) {
            if (!medico.getGuardias().isEmpty()) {
                System.out.println("- " + medico.getNombre() + " " + medico.getApellido());
            }
        }
    }
}
