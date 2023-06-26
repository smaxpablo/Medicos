
import java.time.LocalDate;
import java.time.LocalTime;


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
    public void setMedico(final Medico medico) {
        this.medico = medico;
    }

    /**
     * Sets fecha inicio.
     *
     * @param fechaInicio the fecha inicio
     */
    public void setFechaInicio(final LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Sets hora inicio.
     *
     * @param horaInicio the hora inicio
     */
    public void setHoraInicio(final LocalTime horaInicio) {
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
    public Guardia(final Medico medico, final LocalDate fechaInicio,
                   final LocalTime horaInicio) {
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
    void setFechaFin(final LocalDate now) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Sets hora fin.
     *
     * @param now the now
     */
    void setHoraFin(final LocalTime now) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
