package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoComprasList;

    public CarrinhoDeCompras() {
        this.carrinhoComprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome,double preco, int quantidade) {
        carrinhoComprasList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i : carrinhoComprasList) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }

        carrinhoComprasList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double valorFinal = 0;
        for (Item i : carrinhoComprasList) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorFinal += valorItem;
        }

        return valorFinal;
    }

    public String exibirItens() {
        return carrinhoComprasList.toString();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O carrinho contém os seguintes itens " + carrinhoDeCompras.exibirItens());

        carrinhoDeCompras.adicionarItem("ketchup", 5, 2);
        carrinhoDeCompras.adicionarItem("maionese", 4, 1);
        System.out.println("O carrinho contém os seguintes itens " + carrinhoDeCompras.exibirItens());

        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
