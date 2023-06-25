
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class AnularGuardiasMedico {
private Map<Medico, List<LocalDate>> planificacion;

    public AnularGuardiasMedico() {
        planificacion = new HashMap<>();
    }

    public void anularGuardias(Medico medico) {
        if (planificacion.containsKey(medico)) {
            planificacion.remove(medico);
            System.out.println("Guardias del médico anuladas exitosamente.");
        } else {
            System.out.println("El médico no tiene una planificación de guardias.");
        }
    }
}
