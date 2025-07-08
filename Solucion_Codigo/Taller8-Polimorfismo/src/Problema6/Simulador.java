package Problema6;
import java.util.*;

public class Simulador {
    private ArrayList<Nacion> naciones;
    private int conflictosSimulados;
    private Random random;

    public Simulador() {
        this.naciones = new ArrayList<>();
        this.conflictosSimulados = 0;
        this.random = new Random();
    }

    public void agregarNacion(Nacion n) {
        naciones.add(n);
    }

    public void simularConflictos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if (naciones.size() < 2) break;
            Nacion a = naciones.get(random.nextInt(naciones.size()));
            Nacion b;
            do {
                b = naciones.get(random.nextInt(naciones.size()));
            } while (a == b);

            simularConflicto(a, b);
        }
    }

    private void simularConflicto(Nacion a, Nacion b) {
        System.out.println("\nConflicto entre " + a.getNombre() + " y " + b.getNombre());

        a.setEnConflicto(true);
        b.setEnConflicto(true);

        int impactoA = a.calcularImpacto();
        int impactoB = b.calcularImpacto();

        if (impactoA > impactoB) {
            int diferencia = impactoA - impactoB;
            b.reducirPoblacion(diferencia * 5);
            b.reducirRecursos(10);
            System.out.println(a.getNombre() + " gana el conflicto.");
        } else if (impactoB > impactoA) {
            int diferencia = impactoB - impactoA;
            a.reducirPoblacion(diferencia * 5);
            a.reducirRecursos(10);
            System.out.println(b.getNombre() + " gana el conflicto.");
        } else {
            a.reducirRecursos(5);
            b.reducirRecursos(5);
            System.out.println("Conflicto empatado. Ambas naciones pierden recursos.");
        }

        a.setEnConflicto(false);
        b.setEnConflicto(false);
        conflictosSimulados++;
    }

    public void reporteFinal() {
        System.out.println("\n===== REPORTE FINAL =====");
        for (Nacion n : naciones) {
            n.mostrarEstado();
        }
        System.out.println("Total de conflictos simulados: " + conflictosSimulados);
    }
}
