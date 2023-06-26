
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Guardia.
 *
 * @author pablo
 */
public class Guardia {
    private Medico medico;
    private LocalDate fechaInicio;
    private LocalTime horaInicio;

    /**
     * Sets medico.
     *
     * @param medico the medico
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * Sets fecha inicio.
     *
     * @param fechaInicio the fecha inicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Sets hora inicio.
     *
     * @param horaInicio the hora inicio
     */
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Gets fecha fin.
     *
     * @return the fecha fin
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Gets hora fin.
     *
     * @return the hora fin
     */
    public LocalTime getHoraFin() {
        return horaFin;
    }
    private LocalDate fechaFin;
    private LocalTime horaFin;

    /**
     * Instantiates a new Guardia.
     *
     * @param medico      the medico
     * @param fechaInicio the fecha inicio
     * @param horaInicio  the hora inicio
     */
    public Guardia(Medico medico, LocalDate fechaInicio, LocalTime horaInicio) {
        this.medico = medico;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
    }

    /**
     * Gets medico.
     *
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * Gets fecha inicio.
     *
     * @return the fecha inicio
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Gets hora inicio.
     *
     * @return the hora inicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /**
     * Sets fecha fin.
     *
     * @param now the now
     */
    void setFechaFin(LocalDate now) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Sets hora fin.
     *
     * @param now the now
     */
    void setHoraFin(LocalTime now) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
