package Problema5;
public class FeriaGastronomica extends Feria {

    public FeriaGastronomica() {
        super("Feria Gastronómica");
    }

    @Override
    public String organizarPresentacion(String nombreEmp, String tipoParticipacion) {
        return nombreEmp + " participará con una " + tipoParticipacion + " en la " + nombre;
    }
}
