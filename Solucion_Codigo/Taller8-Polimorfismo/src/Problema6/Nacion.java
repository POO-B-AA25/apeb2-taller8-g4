package Problema6;
import java.util.ArrayList;

public abstract class Nacion {
    protected String nombre;
    protected int poblacion;
    protected double recursos;
    protected int poderMilitar; // entre 1 y 100
    protected boolean enConflicto;
    protected ArrayList<Nacion> aliados;

    public Nacion(String nombre, int poblacion, double recursos, int poderMilitar) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.recursos = recursos;
        this.poderMilitar = Math.min(100, Math.max(1, poderMilitar));
        this.enConflicto = false;
        this.aliados = new ArrayList<>();
    }

    public void agregarAliado(Nacion aliado) {
        if (!aliados.contains(aliado)) {
            aliados.add(aliado);
        }
    }

    public boolean tieneAliados() {
        return !aliados.isEmpty();
    }

    public abstract int calcularImpacto();

    public void setEnConflicto(boolean estado) {
        this.enConflicto = estado;
    }

    public void reducirPoblacion(double porcentaje) {
        this.poblacion -= this.poblacion * porcentaje / 100.0;
    }

    public void reducirRecursos(double porcentaje) {
        this.recursos -= this.recursos * porcentaje / 100.0;
    }

    public void mostrarEstado() {
        System.out.println("Nación: " + nombre);
        System.out.println("Población: " + poblacion);
        System.out.println("Recursos: $" + recursos);
        System.out.println("Poder Militar: " + poderMilitar);
        System.out.println("Estado de Conflicto: " + (enConflicto ? "Sí" : "No"));
        System.out.println("Aliados: " + aliados.size());
        System.out.println("----------------------------");
    }

    public int getPoderMilitar() {
        return poderMilitar;
    }

    public String getNombre() {
        return nombre;
    }
}
