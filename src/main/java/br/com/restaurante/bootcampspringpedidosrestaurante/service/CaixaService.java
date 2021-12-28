package br.com.restaurante.bootcampspringpedidosrestaurante.service;

import br.com.restaurante.bootcampspringpedidosrestaurante.entities.Caixa;
import org.springframework.stereotype.Service;

@Service
public class CaixaService {
    public double getValorCaixa() {
        return Caixa.getValorTotal();
    }
}
