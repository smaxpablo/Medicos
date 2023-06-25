
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
public class ModificarGuardiaMedico {
private Map<Medico, List<LocalDate>> planificacion;

    public ModificarGuardiaMedico() {
        planificacion = new HashMap<>();
    }

    public void modificarGuardia(Medico medico, LocalDate fechaExistente, LocalDate nuevaFecha) {
        if (planificacion.containsKey(medico)) {
            List<LocalDate> guardias = planificacion.get(medico);
            if (guardias.contains(fechaExistente)) {
                guardias.remove(fechaExistente);
                guardias.add(nuevaFecha);
                System.out.println("Guardia modificada exitosamente.");
            } else {
                System.out.println("La fecha existente no se encontró en la planificación del médico.");
            }
        } else {
            System.out.println("El médico no tiene una planificación de guardias.");
        }
    }
}
