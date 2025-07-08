package Problema4;
import java.util.ArrayList;

public abstract class Dispositivo {
    protected String region;
    protected String ubicacion;
    protected ArrayList<Double> indicadores;

    public Dispositivo(String region, String ubicacion) {
        this.region = region;
        this.ubicacion = ubicacion;
        this.indicadores = new ArrayList<>();
    }

    public abstract void recolectarDatos();
    public abstract String analizarDatos();

    @Override
    public String toString() {
        return "Región: " + region +
               "\nUbicación: " + ubicacion +
               "\nIndicadores: " + indicadores.toString() +
               "\nAnálisis: " + analizarDatos();
    }
}
