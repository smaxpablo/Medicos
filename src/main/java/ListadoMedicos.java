
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Listado medicos.
 *
 * @author pablo
 */
public class ListadoMedicos {
    private List<Medico> medicos;

    /**
     * Instantiates a new Listado medicos.
     */
    public ListadoMedicos() {
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
     * Obtener medicos list.
     *
     * @return the list
     */
    public List<Medico> obtenerMedicos() {
        return medicos;
    }
}
