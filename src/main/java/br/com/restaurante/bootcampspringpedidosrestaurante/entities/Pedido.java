package br.com.restaurante.bootcampspringpedidosrestaurante.entities;


import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Long id;
    private Long idMesa;
    private List<Prato> pratos;
    @Setter(AccessLevel.NONE)
    private double valorTotal;

    public double getValorTotal() {
        return pratos.stream().map(prato -> prato.getPreco() * prato.getQuantidade()).reduce(0.0, Double::sum);
    }
}
