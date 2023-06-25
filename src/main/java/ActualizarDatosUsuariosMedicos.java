
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
public class ActualizarDatosUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    public ActualizarDatosUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        usuariosMedicos.add(medico);
    }

    public boolean actualizarDatosMedico(String nombre, String nuevaEspecialidad) {
        for (Medico medico : usuariosMedicos) {
            if (medico.getNombre().equals(nombre)) {
                medico.setEspecialidad(nuevaEspecialidad);
                return true;
            }
        }
        return false;
    }

    public List<Medico> getUsuariosMedicos() {
        return usuariosMedicos;
    }
}
