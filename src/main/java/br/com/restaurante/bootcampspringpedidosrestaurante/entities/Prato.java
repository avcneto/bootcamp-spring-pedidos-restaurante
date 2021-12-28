package br.com.restaurante.bootcampspringpedidosrestaurante.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prato {
    private Long id;
    private double preco;
    private String descricao;
    private int quantidade;
}
