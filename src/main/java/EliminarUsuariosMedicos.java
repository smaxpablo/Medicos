
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class EliminarUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    public EliminarUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        usuariosMedicos.add(medico);
    }

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
