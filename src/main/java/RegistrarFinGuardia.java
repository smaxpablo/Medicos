
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Registrar fin guardia.
 *
 * @author pablo
 */
public class RegistrarFinGuardia {
    private Map<Medico, Guardia> guardias;

    /**
     * Instantiates a new Registrar fin guardia.
     */
    public RegistrarFinGuardia() {
        guardias = new HashMap<>();
    }

    /**
     * Registrar fin.
     *
     * @param medico the medico
     */
    public void registrarFin(Medico medico) {
        if (guardias.containsKey(medico)) {
            Guardia guardia = guardias.get(medico);
            guardia.setFechaFin(LocalDate.now());
            guardia.setHoraFin(LocalTime.now());
            System.out.println("Se ha registrado el fin de guardia para el médico: " + medico.getNombre());
        } else {
            System.out.println("No se encontró ninguna guardia en curso para el médico: " + medico.getNombre());
        }
    }

    /**
     * Gets guardias.
     *
     * @return the guardias
     */
    public Map<Medico, Guardia> getGuardias() {
        return guardias;
    }
}
