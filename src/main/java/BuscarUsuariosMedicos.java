
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Buscar usuarios medicos.
 *
 * @author pablo
 */
public class BuscarUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    /**
     * Instantiates a new Buscar usuarios medicos.
     */
    public BuscarUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    /**
     * Agregar medico.
     *
     * @param medico the medico
     */
    public void agregarMedico(Medico medico) {
        usuariosMedicos.add(medico);
    }

    /**
     * Buscar medico por especialidad list.
     *
     * @param especialidad the especialidad
     * @return the list
     */
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
