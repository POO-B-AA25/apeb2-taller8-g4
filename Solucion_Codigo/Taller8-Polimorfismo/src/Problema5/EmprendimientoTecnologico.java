package Problema5;
public class EmprendimientoTecnologico extends Emprendimiento {

    public EmprendimientoTecnologico(String nombre, String mision, String contacto) {
        super(nombre, mision, contacto);
    }

    @Override
    public void diversificar() {
        productos.add(new Producto("App móvil", "Desarrollo de soluciones móviles"));
    }

    @Override
    public String participarEnFeria(Feria feria) {
        return feria.organizarPresentacion(nombre, "demo de software");
    }
}
