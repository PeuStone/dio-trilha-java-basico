package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(new Numeros(numero));
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numerosList.isEmpty()) {
            for (Numeros n : numerosList) {
                soma += n.getNumeros();
            }
            return soma;
        } else {
            throw new RuntimeException("A lista de números esta vazia!");
        }
    }

    public int encontrarMaiorNumero() {
        int num = 0;
        if (!numerosList.isEmpty()) {
            for (Numeros n : numerosList) {
                if (num <= n.getNumeros()) {
                    num = n.getNumeros();
                }
            }
            return num;
        } else {
            throw new RuntimeException("A lista de números esta vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int num = 0;
        if (!numerosList.isEmpty()) {
            for (Numeros n : numerosList) {
                num = numerosList.get(0).getNumeros();
                if (num >= n.getNumeros()) {
                    num = n.getNumeros();
                }
            }
            return num;
        } else {
            throw new RuntimeException("A lista de números esta vazia!");
        }
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.exibirNumeros();

        somaNumeros.adicionarNumero(158);
        somaNumeros.adicionarNumero(297);
        somaNumeros.adicionarNumero(3);
        somaNumeros.exibirNumeros();

        System.out.println("A soma dos números da lista é: " + somaNumeros.calcularSoma());

        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());
    }
}
