
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
public class BuscarMedicosTareasAltaPrioridad {
    private List<Medico> medicos;

    public BuscarMedicosTareasAltaPrioridad(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public List<Medico> buscarMedicosTareasAltaPrioridad() {
        List<Medico> medicosPrioridad = new ArrayList<>();

        for (Medico medico : medicos) {
            if (medico.tieneTareasAltaPrioridad()) {
                medicosPrioridad.add(medico);
            }
        }

        return medicosPrioridad;
    }
}
