
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
public class RegistroMedico {
    private List<Medico> medicos;

    public RegistroMedico() {
        medicos = new ArrayList<>();
    }

    public boolean registrarMedico(Medico medico) {
        // Verificar si el médico ya está registrado
        if (existeMedico(medico.getNumeroColegiado())) {
            return false;
        }

        // Registrar el médico
        medicos.add(medico);
        return true;
    }

    public boolean existeMedico(int numeroColegiado) {
        for (Medico medico : medicos) {
            if (medico.getNumeroColegiado() == numeroColegiado) {
                return true;
            }
        }
        return false;
    }
}
