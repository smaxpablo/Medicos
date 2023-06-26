/**
 * The type Usuario.
 *
 * @author pablo
 */
public class Usuario {
    private String username;
    private String password;
    private String email;

    /**
     * Instantiates a new Usuario.
     *
     * @param username the username
     * @param password the password
     * @param email    the email
     */
    public Usuario(final String username, final String password,
                   final String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters y Setters

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(final String email) {
        this.email = email;
    }
}
