package Problema5;
import java.util.ArrayList;

public class Problema5_Emprendimiento {
    public static void main(String[] args) {
        ArrayList<Emprendimiento> lista = new ArrayList<>();

        EmprendimientoTecnologico e1 = new EmprendimientoTecnologico("TechLoja", "Innovar con software", "contacto@techloja.com");
        e1.agregarProducto(new Producto("Sistema ERP", "Automatización de procesos empresariales"));
        e1.agregarMentor(new Mentor("Ana Torres", "Desarrollo de Software"));
        e1.expandir("Zamora");
        e1.diversificar();

        EmprendimientoArtesanal e2 = new EmprendimientoArtesanal("Manos Creativas", "Arte local para el mundo", "arte@creativo.ec");
        e2.agregarProducto(new Producto("Joyería Andina", "Accesorios de plata con simbología ancestral"));
        e2.agregarMentor(new Mentor("Luis Pineda", "Marketing artesanal"));
        e2.diversificar();

        EmprendimientoGastronomico e3 = new EmprendimientoGastronomico("Sabor Local", "Promover la gastronomía tradicional", "contacto@saborlocal.com");
        e3.agregarProducto(new Producto("Ceviche", "Delicioso ceviche con ingredientes frescos"));
        e3.agregarMentor(new Mentor("Carlos Mejía", "Chef especializado en comida local"));
        e3.diversificar();

        EmprendimientoAgricola e4 = new EmprendimientoAgricola("EcoFarms", "Agricultura ecológica y sustentable", "info@ecofarms.ec");
        e4.agregarProducto(new Producto("Tomates orgánicos", "Tomates cultivados sin pesticidas"));
        e4.agregarMentor(new Mentor("Marta Ruiz", "Experta en agricultura orgánica"));
        e4.diversificar();

        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);

        Feria feria1 = new FeriaInnovacion();
        Feria feria2 = new FeriaGastronomica();

        for (Emprendimiento e : lista) {
            System.out.println("\n--- Emprendimiento ---");
            System.out.println(e.toString());
            // Para decidir qué feria usar: Tecnológico y Agrícola -> Innovación, Artesanal y Gastronómico -> Gastronómica
            Feria feria = (e instanceof EmprendimientoTecnologico || e instanceof EmprendimientoAgricola) ? feria1 : feria2;
            System.out.println("Participación: " + e.participarEnFeria(feria));
            System.out.println("----------------------");
        }
    }
}
