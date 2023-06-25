
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
public class CreacionRoles {
    private List<String> roles;

    public CreacionRoles() {
        roles = new ArrayList<>();
    }

    public void agregarRol(String rol) {
        roles.add(rol);
    }

    public void listarRoles() {
        System.out.println("Lista de Roles:");
        for (String rol : roles) {
            System.out.println("- " + rol);
        }
    }

}
