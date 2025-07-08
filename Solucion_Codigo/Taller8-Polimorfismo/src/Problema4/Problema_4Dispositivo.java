package Problema4;
import java.util.ArrayList;

public class Problema_4Dispositivo {
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new DispositivoCosta("Guayaquil"));
        dispositivos.add(new DispositivoSierra("Quito"));
        dispositivos.add(new DispositivoOriente("Puyo"));

        for (Dispositivo d : dispositivos) {
            d.recolectarDatos();
            System.out.println(d.toString());
            System.out.println("----------------------------------------");
        }
    }
}
