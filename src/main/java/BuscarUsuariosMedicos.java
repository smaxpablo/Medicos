
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
public class BuscarUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    public BuscarUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        usuariosMedicos.add(medico);
    }

    public List<Medico> buscarMedicoPorEspecialidad(String especialidad) {
        List<Medico> medicosEncontrados = new ArrayList<>();

        for (Medico medico : usuariosMedicos) {
            if (medico.getEspecialidad().equalsIgnoreCase(especialidad)) {
                medicosEncontrados.add(medico);
            }
        }

        return medicosEncontrados;
    }
}
