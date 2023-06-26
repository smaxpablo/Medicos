/**
 * The type Acceso sistema.
 *
 * @author pablo
 */
public class AccesoSistema {
    /**
     * Atributo usuario
    */
    private String usuario;

    /**
     * Atributo contrasena
    */
    private String contrasena;

    /**
     * Instantiates a new Acceso sistema.
     *
     * @param usuario    the usuario
     * @param contrasena the contrasena
     */
    public AccesoSistema(final String usuario, final String contrasena) {
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
    public boolean validarCredenciales(final String usuario,
                                       final String contrasena) {
        return this.usuario.equals(usuario)
                && this.contrasena.equals(contrasena);
    }
}
