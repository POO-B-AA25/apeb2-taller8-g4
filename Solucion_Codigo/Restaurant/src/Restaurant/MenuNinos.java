package Restaurant;

public class MenuNinos extends Menu{
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato,double valorInicial, double helado, double pastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = helado;
        this.valorPastel = pastel;
    }
    
    @Override
    public void calcularValorMenu(){
        valor = valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return "\n"+
                "\nMenu para Niños\n" +
                "-----------------\n"+
               "Plato: " + nombrePlato + "\n" +
               String.format("Valor del menu: %.2f\n", valor) +
               String.format("Valor Inicial: %.2f\n", valorInicial) +
               String.format("Helado: %.2f\n", valorHelado) +
               String.format("Pastel: %.2f\n", valorPastel);
    }
}
