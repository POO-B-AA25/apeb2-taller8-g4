package Problema5;
public class EmprendimientoGastronomico extends Emprendimiento {

    public EmprendimientoGastronomico(String nombre, String mision, String contacto) {
        super(nombre, mision, contacto);
    }

    @Override
    public void diversificar() {
        productos.add(new Producto("Platos típicos", "Comida tradicional elaborada con recetas ancestrales"));
    }

    @Override
    public String participarEnFeria(Feria feria) {
        return feria.organizarPresentacion(nombre, "demostración culinaria");
    }
}
