package Problema5;
import java.util.ArrayList;

public abstract class Emprendimiento {
    protected String nombre;
    protected String mision;
    protected String contacto;
    protected ArrayList<Producto> productos;
    protected ArrayList<Mentor> mentores;
    protected ArrayList<String> sedes;

    public Emprendimiento(String nombre, String mision, String contacto) {
        this.nombre = nombre;
        this.mision = mision;
        this.contacto = contacto;
        this.productos = new ArrayList<>();
        this.mentores = new ArrayList<>();
        this.sedes = new ArrayList<>();
        this.sedes.add("Loja");
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void agregarMentor(Mentor m) {
        mentores.add(m);
    }

    public void expandir(String nuevaSede) {
        sedes.add(nuevaSede);
    }

    public abstract void diversificar();

    public abstract String participarEnFeria(Feria feria);

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nMisión: " + mision +
               "\nContacto: " + contacto +
               "\nProductos: " + productos +
               "\nMentores: " + mentores +
               "\nSedes: " + sedes;
    }
}
