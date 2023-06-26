/**
 * The type Tarea.
 *
 * @author pablo
 */
public class Tarea {
    private String nombre;
    private Prioridad prioridad;

    /**
     * Instantiates a new Tarea.
     *
     * @param nombre    the nombre
     * @param prioridad the prioridad
     */
    public Tarea(final String nombre, final Prioridad prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    /**
     * Sets prioridad.
     *
     * @param prioridad the prioridad
     */
    public void setPrioridad(final Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Gets prioridad.
     *
     * @return the prioridad
     */
    public Prioridad getPrioridad() {
        return prioridad;
    }

    /**
     * The enum Prioridad.
     */
    public enum Prioridad {
        /**
         * Baja prioridad.
         */
        BAJA,
        /**
         * Media prioridad.
         */
        MEDIA,
        /**
         * Alta prioridad.
         */
        ALTA
    }
}
