package Problema4;
public class DispositivoSierra extends Dispositivo {

    public DispositivoSierra(String ubicacion) {
        super("Sierra", ubicacion);
    }

    @Override
    public void recolectarDatos() {
        indicadores.clear();
        indicadores.add(20.0); // Temperatura
        indicadores.add(150.0); // Precipitación
        indicadores.add(60.0); // Humedad del suelo
    }

    @Override
    public String analizarDatos() {
        double precipitacion = indicadores.get(1);
        double humedadSuelo = indicadores.get(2);

        if (precipitacion > 120.0 && humedadSuelo > 70.0) {
            return "Alerta de deslizamientos";
        } else {
            return "Condiciones estables";
        }
    }

    @Override
    public String toString() {
        return "\n--- Reporte Dispositivo Sierra ---\n" + super.toString();
    }
}
