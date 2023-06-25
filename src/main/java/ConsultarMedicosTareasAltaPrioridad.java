
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
public class ConsultarMedicosTareasAltaPrioridad {
    private List<Medico> medicos;

    public ConsultarMedicosTareasAltaPrioridad() {
        medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> obtenerMedicosConTareasAltaPrioridad() {
        List<Medico> medicosConTareasAltaPrioridad = new ArrayList<>();

        for (Medico medico : medicos) {
            if (medico.tieneTareasAltaPrioridad()) {
                medicosConTareasAltaPrioridad.add(medico);
            }
        }

        return medicosConTareasAltaPrioridad;
    }
}
