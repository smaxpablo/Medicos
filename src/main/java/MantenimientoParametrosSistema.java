
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class MantenimientoParametrosSistema {
    private Map<String, String> parametrosSistema;

    public MantenimientoParametrosSistema() {
        parametrosSistema = new HashMap<>();
    }

    public void agregarParametro(String clave, String valor) {
        parametrosSistema.put(clave, valor);
    }

    public String obtenerParametro(String clave) {
        return parametrosSistema.get(clave);
    }

    public void actualizarParametro(String clave, String nuevoValor) {
        if (parametrosSistema.containsKey(clave)) {
            parametrosSistema.put(clave, nuevoValor);
        }
    }

    public void eliminarParametro(String clave) {
        parametrosSistema.remove(clave);
    }
}
