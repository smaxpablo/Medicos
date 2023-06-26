
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Eliminar usuarios medicos.
 *
 * @author pablo
 */
public class EliminarUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    /**
     * Instantiates a new Eliminar usuarios medicos.
     */
    public EliminarUsuariosMedicos() {
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
     * Eliminar medico boolean.
     *
     * @param nombre   the nombre
     * @param apellido the apellido
     * @return the boolean
     */
    public boolean eliminarMedico(String nombre, String apellido) {
        Iterator<Medico> iterator = usuariosMedicos.iterator();

        while (iterator.hasNext()) {
            Medico medico = iterator.next();

            if (medico.getNombre().equals(nombre) && medico.getApellido().equals(apellido)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
