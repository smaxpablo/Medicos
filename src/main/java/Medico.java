
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Medico.
 *
 * @author pablo
 */
public class Medico {
    private String nombre;
    private String apellido;
    private String especialidad;
    private List<LocalDate> guardias;
    private LocalDate fechaDisponible;
    private List<Tarea> tareas;


    /**
     * Instantiates a new Medico.
     *
     * @param numeroColegiado the numero colegiado
     * @param nombre          the nombre
     * @param apellido        the apellido
     * @param especialidad    the especialidad
     * @param fechaDisponible the fecha disponible
     */
    public Medico(int numeroColegiado, String nombre, String apellido, String especialidad, LocalDate fechaDisponible) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.guardias = new ArrayList<>();
        this.fechaDisponible = fechaDisponible;
        this.numeroColegiado = numeroColegiado;
    }

    /**
     * Instantiates a new Medico.
     *
     * @param nombre       the nombre
     * @param especialidad the especialidad
     */
    Medico(String nombre, String especialidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * Sets apellido.
     *
     * @param apellido the apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Sets especialidad.
     *
     * @param especialidad the especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Sets guardias.
     *
     * @param guardias the guardias
     */
    public void setGuardias(List<LocalDate> guardias) {
        this.guardias = guardias;
    }

    /**
     * Sets fecha disponible.
     *
     * @param fechaDisponible the fecha disponible
     */
    public void setFechaDisponible(LocalDate fechaDisponible) {
        this.fechaDisponible = fechaDisponible;
    }

    /**
     * Gets numero colegiado.
     *
     * @return the numero colegiado
     */
    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    /**
     * Sets numero colegiado.
     *
     * @param numeroColegiado the numero colegiado
     */
    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
    private int numeroColegiado;


    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Gets apellido.
     *
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Gets especialidad.
     *
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Gets fecha disponible.
     *
     * @return the fecha disponible
     */
    public LocalDate getFechaDisponible() {
        return fechaDisponible;
    }

    /**
     * Mostrar informacion.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Especialidad: " + especialidad);
    }

    /**
     * Actualizar datos.
     */
    public void actualizarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nuevo nombre del médico: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el nuevo apellido del médico: ");
        apellido = scanner.nextLine();

        System.out.println("Ingrese la nueva especialidad del médico: ");
        especialidad = scanner.nextLine();
    }

    /**
     * Agregar guardia.
     *
     * @param fecha the fecha
     */
    public void agregarGuardia(LocalDate fecha) {
        guardias.add(fecha);
    }

    /**
     * Gets guardias.
     *
     * @return the guardias
     */
    public List<LocalDate> getGuardias() {
        return guardias;
    }

    /**
     * Gets tareas.
     *
     * @return the tareas
     */
    public List<Tarea> getTareas() {
        return tareas;
    }

    /**
     * Tiene tareas alta prioridad boolean.
     *
     * @return the boolean
     */
    public boolean tieneTareasAltaPrioridad() {
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() == Tarea.Prioridad.ALTA) {
                return true;
            }
        }
        return false;
    }
}
