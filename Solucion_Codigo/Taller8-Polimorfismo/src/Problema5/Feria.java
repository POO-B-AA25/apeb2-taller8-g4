package Problema5;
public abstract class Feria {
    protected String nombre;

    public Feria(String nombre) {
        this.nombre = nombre;
    }

    public abstract String organizarPresentacion(String nombreEmp, String tipoParticipacion);
}
