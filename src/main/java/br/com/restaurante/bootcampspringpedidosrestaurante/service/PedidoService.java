package br.com.restaurante.bootcampspringpedidosrestaurante.service;

import br.com.restaurante.bootcampspringpedidosrestaurante.entities.Mesa;
import br.com.restaurante.bootcampspringpedidosrestaurante.repository.MesaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.restaurante.bootcampspringpedidosrestaurante.entities.Caixa.somarValor;

@Service
public class PedidoService {
    @Autowired
    private MesaRepo mesaRepo;

    public void fechamentoPedidos(Long id) {
        Mesa mesa = mesaRepo.getMesa(id);
        somarValor(mesa.getValorTotal());
        mesa.limpaPedidos(mesa);
    }
}
