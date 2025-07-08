package Problema4;
public class DispositivoCosta extends Dispositivo {

    public DispositivoCosta(String ubicacion) {
        super("Costa", ubicacion);
    }

    @Override
    public void recolectarDatos() {
        indicadores.clear();
        indicadores.add(38.0); // Temperatura
        indicadores.add(10.0); // Precipitación
        indicadores.add(150.0); // Calidad del aire
    }

    @Override
    public String analizarDatos() {
        double temperatura = indicadores.get(0);
        double calidadAire = indicadores.get(2);

        if (temperatura > 35.0) {
            return "Riesgo de sequía elevado";
        } else if (calidadAire > 100.0) {
            return "Alerta por contaminación del aire";
        } else {
            return "Condiciones climáticas estables";
        }
    }

    @Override
    public String toString() {
        return "\n--- Reporte Dispositivo Costa ---\n" + super.toString();
    }
}
