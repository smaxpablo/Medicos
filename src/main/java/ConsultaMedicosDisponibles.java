
import java.time.LocalDate;
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
public class ConsultaMedicosDisponibles {
    private List<Medico> medicos;

    public ConsultaMedicosDisponibles() {
        medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> consultarMedicosDisponibles(LocalDate fecha) {
        List<Medico> medicosDisponibles = new ArrayList<>();
        for (Medico medico : medicos) {
            if (medico.getFechaDisponible().isEqual(fecha)) {
                medicosDisponibles.add(medico);
            }
        }
        return medicosDisponibles;
    }
}
