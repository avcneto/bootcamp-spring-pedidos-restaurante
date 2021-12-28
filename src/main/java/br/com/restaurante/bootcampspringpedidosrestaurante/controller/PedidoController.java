package br.com.restaurante.bootcampspringpedidosrestaurante.controller;

import br.com.restaurante.bootcampspringpedidosrestaurante.dto.fecharPedidoDTO;
import br.com.restaurante.bootcampspringpedidosrestaurante.entities.Mesa;
import br.com.restaurante.bootcampspringpedidosrestaurante.repository.MesaRepo;
import br.com.restaurante.bootcampspringpedidosrestaurante.service.CaixaService;
import br.com.restaurante.bootcampspringpedidosrestaurante.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PedidoController {
    @Autowired
    private MesaRepo mesaRepo;
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private CaixaService caixaService;

    @PostMapping("/salvamesa")
    public Mesa salvaMesa(@RequestBody Mesa mesa) {
        mesaRepo.salvar(mesa);
        return mesaRepo.getMesa(mesa.getId());
    }

    @PutMapping("/fecharpedido")
    public ResponseEntity<Mesa> fechaMesa(@RequestBody fecharPedidoDTO fechaPedido) {

        Mesa mesa = mesaRepo.getMesa(fechaPedido.getId());
        if (mesa != null) {
            pedidoService.fechamentoPedidos(fechaPedido.getId());
            return ResponseEntity.ok(mesa);
        }

        return ResponseEntity.status(404).build();
    }

    @GetMapping("/consultapedido/{id}")
    public ResponseEntity<Mesa> consultaPedido(@PathVariable Long id) {

        Mesa mesa = mesaRepo.getMesa(id);
        if (mesa != null) {
            return ResponseEntity.ok(mesa);
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("consultacaixa")
    public double consultaCaixa() {
        return caixaService.getValorCaixa();
    }
}
