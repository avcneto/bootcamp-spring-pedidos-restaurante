package br.com.restaurante.bootcampspringpedidosrestaurante.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mesa {
    private Long id;
    private List<Pedido> pedidos;
    private double valorTotal;

    public double getValorTotal() {
        pedidos.forEach(pedido -> this.valorTotal += pedido.getValorTotal());
        return valorTotal;
    }

    public void limpaPedidos(Mesa mesa) {
        mesa.pedidos.clear();
        mesa.valorTotal = 0;
    }
}
