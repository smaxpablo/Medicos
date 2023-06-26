
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Consulta medicos disponibles.
 *
 * @author pablo
 */
public class ConsultaMedicosDisponibles {
    private List<Medico> medicos;

    /**
     * Instantiates a new Consulta medicos disponibles.
     */
    public ConsultaMedicosDisponibles() {
        medicos = new ArrayList<>();
    }

    /**
     * Agregar medico.
     *
     * @param medico the medico
     */
    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    /**
     * Consultar medicos disponibles list.
     *
     * @param fecha the fecha
     * @return the list
     */
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
