package br.com.restaurante.bootcampspringpedidosrestaurante.entities;

public class Caixa {
    private static double valorTotal = 0;

    public static void somarValor(double valor) {
        valorTotal += valor;
    }

    public static double getValorTotal() {
        return valorTotal;
    }
}
