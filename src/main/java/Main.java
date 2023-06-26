/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The type Main.
 *
 * @author pablo
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BitacoraActividadesGuardia bitacora = new BitacoraActividadesGuardia();

        // Registrar actividades
        bitacora.registrarActividad("Realizar revisión de pacientes");
        bitacora.registrarActividad("Atender llamadas de emergencia");
        bitacora.registrarActividad("Administrar medicamentos");

        // Mostrar bitácora
        bitacora.mostrarBitacora();
    }
}
