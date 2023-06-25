
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class BitacoraActividadesGuardia {
    private List<String> actividades;

    public BitacoraActividadesGuardia() {
        actividades = new ArrayList<>();
    }

    public void registrarActividad(String actividad) {
        actividades.add(actividad);
    }

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
