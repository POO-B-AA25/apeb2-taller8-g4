package Problema4;
public class DispositivoOriente extends Dispositivo {

    public DispositivoOriente(String ubicacion) {
        super("Oriente", ubicacion);
    }

    @Override
    public void recolectarDatos() {
        indicadores.clear();
        indicadores.add(28.0); // Temperatura
        indicadores.add(95.0); // Humedad del suelo
        indicadores.add(80.0); // Calidad del aire
    }

    @Override
    public String analizarDatos() {
        double humedadSuelo = indicadores.get(1);
        double calidadAire = indicadores.get(2);

        if (humedadSuelo < 30.0) {
            return "Riesgo de sequía en el área";
        } else if (calidadAire > 100.0) {
            return "Contaminación preocupante en la selva";
        } else {
            return "Condiciones aceptables en el oriente";
        }
    }

    @Override
    public String toString() {
        return "\n--- Reporte Dispositivo Oriente ---\n" + super.toString();
    }
}
