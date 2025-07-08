package Problema5;
public class EmprendimientoAgricola extends Emprendimiento {

  public EmprendimientoAgricola(String nombre, String mision, String contacto) {
      super(nombre, mision, contacto);
  }

  @Override
  public void diversificar() {
      productos.add(new Producto("Cultivos orgánicos", "Producción sostenible de frutas y verduras"));
  }

  @Override
  public String participarEnFeria(Feria feria) {
      return feria.organizarPresentacion(nombre, "exposición agrícola");
  }
}
