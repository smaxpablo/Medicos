
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    public void agregarParametro(String clave, String valor) {
        parametrosSistema.put(clave, valor);
    }

    /**
     * Obtener parametro string.
     *
     * @param clave the clave
     * @return the string
     */
    public String obtenerParametro(String clave) {
        return parametrosSistema.get(clave);
    }

    /**
     * Actualizar parametro.
     *
     * @param clave      the clave
     * @param nuevoValor the nuevo valor
     */
    public void actualizarParametro(String clave, String nuevoValor) {
        if (parametrosSistema.containsKey(clave)) {
            parametrosSistema.put(clave, nuevoValor);
        }
    }

    /**
     * Eliminar parametro.
     *
     * @param clave the clave
     */
    public void eliminarParametro(String clave) {
        parametrosSistema.remove(clave);
    }
}
