package Problema6;
public class Problema6_Nacion {
    public static void main(String[] args) {
        Simulador simulador = new Simulador();

        NacionDesarrollada usa = new NacionDesarrollada("EE.UU.", 330000000, 2000000, 90, true);
        NacionDesarrollada alemania = new NacionDesarrollada("Alemania", 83000000, 1500000, 80, true);
        NacionEnDesarrollo india = new NacionEnDesarrollo("India", 1400000000, 500000, 60);
        NacionEnDesarrollo nigeria = new NacionEnDesarrollo("Nigeria", 200000000, 300000, 50);

        usa.agregarAliado(alemania);
        india.agregarAliado(nigeria);

        simulador.agregarNacion(usa);
        simulador.agregarNacion(alemania);
        simulador.agregarNacion(india);
        simulador.agregarNacion(nigeria);

        simulador.simularConflictos(3); // simula 3 conflictos aleatorios
        simulador.reporteFinal();
    }
}
