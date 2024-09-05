package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> numeroAscendente = new ArrayList<>(numeroList);
        if (!numeroList.isEmpty()) {
            Collections.sort(numeroAscendente);
        }
        return numeroAscendente;
    }

    public List<Numero> ordenarDescendente() {
        List<Numero> numeroDescendente = new ArrayList<>(numeroList);
        if (!numeroList.isEmpty()) {
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(numeroList);
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(4);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(8);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
