package org.example.pedido.translator;

import org.example.pedido.dto.PedidoDTO;
import org.example.pedido.model.Pedido;

public class PedidoTranslator {

    public static Pedido toPedido(PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido();
        pedido.setId(pedido.getId());
        pedido.setValor(pedido.getValor());
        pedido.setPedido(pedido.getPedido());
        return pedido;
    }

}
