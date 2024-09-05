package Pesquisa;

public class Numeros {
    private int numeros;

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public Numeros(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "Numeros { " + numeros +
                " }";
    }
}
