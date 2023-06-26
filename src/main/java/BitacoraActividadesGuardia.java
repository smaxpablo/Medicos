
import java.util.ArrayList;
import java.util.List;


/**
 * The type Bitacora actividades guardia.
 *
 * @author pablo
 */
public class BitacoraActividadesGuardia {
    private List<String> actividades;

    /**
     * Instantiates a new Bitacora actividades guardia.
     */
    public BitacoraActividadesGuardia() {
        actividades = new ArrayList<>();
    }

    /**
     * Registrar actividad.
     *
     * @param actividad the actividad
     */
    public void registrarActividad(final String actividad) {
        actividades.add(actividad);
    }

    /**
     * Mostrar bitacora.
     */
    public void mostrarBitacora() {
        System.out.println("Bitácora de Actividades de Guardia:");

        if (actividades.isEmpty()) {
            System.out.println("No se han registrado actividades.");
        } else {
            for (int i = 0; i < actividades.size(); i++) {
                System.out.println((i + 1) + ". " + actividades.get(i));
            }
        }
    }
}
