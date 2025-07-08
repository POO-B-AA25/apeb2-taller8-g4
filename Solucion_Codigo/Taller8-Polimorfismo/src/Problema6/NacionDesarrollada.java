package Problema6;
public class NacionDesarrollada extends Nacion {
    private boolean tieneTecnologiaAvanzada;

    public NacionDesarrollada(String nombre, int poblacion, double recursos, int poderMilitar, boolean tecnologia) {
        super(nombre, poblacion, recursos, poderMilitar);
        this.tieneTecnologiaAvanzada = tecnologia;
    }

    @Override
    public int calcularImpacto() {
        int bono = tieneTecnologiaAvanzada ? 20 : 10;
        int impacto = poderMilitar + bono;
        if (tieneAliados()) impacto += 10;
        return Math.min(100, impacto);
    }
}
