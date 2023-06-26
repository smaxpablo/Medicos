/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    public Tarea(String nombre, Prioridad prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Sets prioridad.
     *
     * @param prioridad the prioridad
     */
    public void setPrioridad(Prioridad prioridad) {
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
