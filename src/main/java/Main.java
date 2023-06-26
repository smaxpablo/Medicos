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
    public static void main(final String[] args) {
        BitacoraActividadesGuardia bitacora = new BitacoraActividadesGuardia();

        // Registrar actividades
        bitacora.registrarActividad("Realizar revisión de pacientes");
        bitacora.registrarActividad("Atender llamadas de emergencia");
        bitacora.registrarActividad("Administrar medicamentos");

        // Mostrar bitácora
        bitacora.mostrarBitacora();
    }
}
