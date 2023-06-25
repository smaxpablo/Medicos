
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
public class CrearUsuariosMedicos {
    private List<Medico> usuariosMedicos;

    public CrearUsuariosMedicos() {
        usuariosMedicos = new ArrayList<>();
    }

    public void crearUsuarioMedico(String nombre, String especialidad) {
        Medico medico = new Medico(nombre, especialidad);
        usuariosMedicos.add(medico);
    }

    public List<Medico> getUsuariosMedicos() {
        return usuariosMedicos;
    }
}
