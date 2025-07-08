package Problema5;
public class Mentor {
    private String nombre;
    private String especialidad;

    public Mentor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
}
