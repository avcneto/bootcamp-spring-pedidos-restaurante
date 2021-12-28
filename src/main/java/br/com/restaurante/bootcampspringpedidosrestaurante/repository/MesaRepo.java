package br.com.restaurante.bootcampspringpedidosrestaurante.repository;

import br.com.restaurante.bootcampspringpedidosrestaurante.entities.Mesa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MesaRepo {
    List<Mesa> mesa = new ArrayList<>();

    public void salvar(Mesa mesa) {
        this.mesa.add(mesa);
    }

    public Mesa getMesa(Long id) {
        int test = mesa.size();

        if (test > 0) {
            return mesa.stream().filter(mesa1 -> mesa1.getId() == id).findFirst().orElse(new Mesa());
        }

        return null;
    }
}
