package org.example.pedido.dao;

import org.example.pedido.dto.PedidoDTO;
import org.example.pedido.model.Pedido;
import org.example.utils.interfaces.Crudable;

public class PedidoDao implements Crudable<PedidoDTO, Pedido> {

    @Override
    public Pedido create(PedidoDTO obj) {
        Pedido pedido = new Pedido();
        pedido.setId(pedido.getId());
        pedido.setValor(pedido.getValor());
        pedido.setPedido(pedido.getPedido());
        return pedido;
    }
}
