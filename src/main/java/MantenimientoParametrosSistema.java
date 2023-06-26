
import java.util.HashMap;
import java.util.Map;


/**
 * The type Mantenimiento parametros sistema.
 *
 * @author pablo
 */
public class MantenimientoParametrosSistema {
    private Map<String, String> parametrosSistema;

    /**
     * Instantiates a new Mantenimiento parametros sistema.
     */
    public MantenimientoParametrosSistema() {
        parametrosSistema = new HashMap<>();
    }

    /**
     * Agregar parametro.
     *
     * @param clave the clave
     * @param valor the valor
     */
    public void agregarParametro(final String clave,
                                 final String valor) {
        parametrosSistema.put(clave, valor);
    }

    /**
     * Obtener parametro string.
     *
     * @param clave the clave
     * @return the string
     */
    public String obtenerParametro(final String clave) {
        return parametrosSistema.get(clave);
    }

    /**
     * Actualizar parametro.
     *
     * @param clave      the clave
     * @param nuevoValor the nuevo valor
     */
    public void actualizarParametro(final String clave,
                                    final String nuevoValor) {
        if (parametrosSistema.containsKey(clave)) {
            parametrosSistema.put(clave, nuevoValor);
        }
    }

    /**
     * Eliminar parametro.
     *
     * @param clave the clave
     */
    public void eliminarParametro(final String clave) {
        parametrosSistema.remove(clave);
    }
}
