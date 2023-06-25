
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
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



    public Medico(int numeroColegiado, String nombre, String apellido, String especialidad, LocalDate fechaDisponible) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.guardias = new ArrayList<>();
        this.fechaDisponible = fechaDisponible;
        this.numeroColegiado = numeroColegiado;
    }
    Medico(String nombre, String especialidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setGuardias(List<LocalDate> guardias) {
        this.guardias = guardias;
    }

    public void setFechaDisponible(LocalDate fechaDisponible) {
        this.fechaDisponible = fechaDisponible;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
    private int numeroColegiado;



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public LocalDate getFechaDisponible() {
        return fechaDisponible;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Especialidad: " + especialidad);
    }

    public void actualizarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nuevo nombre del médico: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el nuevo apellido del médico: ");
        apellido = scanner.nextLine();

        System.out.println("Ingrese la nueva especialidad del médico: ");
        especialidad = scanner.nextLine();
    }
    
        public void agregarGuardia(LocalDate fecha) {
        guardias.add(fecha);
    }

    public List<LocalDate> getGuardias() {
        return guardias;
    }
    
        public List<Tarea> getTareas() {
        return tareas;
    }

    public boolean tieneTareasAltaPrioridad() {
        for (Tarea tarea : tareas) {
            if (tarea.getPrioridad() == Tarea.Prioridad.ALTA) {
                return true;
            }
        }
        return false;
    }
}
