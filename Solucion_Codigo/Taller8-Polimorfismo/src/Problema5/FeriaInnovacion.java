package Problema5;
public class FeriaInnovacion extends Feria {

    public FeriaInnovacion() {
        super("Feria de Innovación");
    }

    @Override
    public String organizarPresentacion(String nombreEmp, String tipoParticipacion) {
        return nombreEmp + " presentará una " + tipoParticipacion + " en la " + nombre;
    }
}
