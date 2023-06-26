/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Acceso sistema.
 *
 * @author pablo
 */
public class AccesoSistema {
    private String usuario;
    private String contrasena;

    /**
     * Instantiates a new Acceso sistema.
     *
     * @param usuario    the usuario
     * @param contrasena the contrasena
     */
    public AccesoSistema(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    /**
     * Validar credenciales boolean.
     *
     * @param usuario    the usuario
     * @param contrasena the contrasena
     * @return the boolean
     */
    public boolean validarCredenciales(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }
}
