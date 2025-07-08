package Problema6;
public class NacionEnDesarrollo extends Nacion {

    public NacionEnDesarrollo(String nombre, int poblacion, double recursos, int poderMilitar) {
        super(nombre, poblacion, recursos, poderMilitar);
    }

    @Override
    public int calcularImpacto() {
        double factor = recursos / (poblacion / 1000.0); // recursos por cada mil habitantes
        int impacto = (int)(poderMilitar * (factor / 10.0));
        if (tieneAliados()) impacto += 5;
        return Math.min(100, impacto);
    }
}
