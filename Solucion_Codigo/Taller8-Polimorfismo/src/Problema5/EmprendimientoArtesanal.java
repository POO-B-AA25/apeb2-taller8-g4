package Problema5;
public class EmprendimientoArtesanal extends Emprendimiento {

    public EmprendimientoArtesanal(String nombre, String mision, String contacto) {
        super(nombre, mision, contacto);
    }

    @Override
    public void diversificar() {
        productos.add(new Producto("Cerámica decorativa", "Piezas pintadas a mano"));
    }

    @Override
    public String participarEnFeria(Feria feria) {
        return feria.organizarPresentacion(nombre, "exposición de artesanías");
    }
}
