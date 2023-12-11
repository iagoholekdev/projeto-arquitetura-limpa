package org.example.pedidocliente.dao;

import org.example.Cliente.model.Cliente;
import org.example.Cliente.translator.ClienteTranslator;
import org.example.pedido.model.Pedido;
import org.example.pedido.translator.PedidoTranslator;
import org.example.pedidocliente.dto.PedidoClienteDTO;
import org.example.pedidocliente.model.PedidoCliente;
import org.example.utils.enums.interfaces.Crudable;

public class PedidoClienteDao implements Crudable<PedidoClienteDTO, PedidoCliente> {

    @Override
    public PedidoCliente create(PedidoClienteDTO obj) {
        Cliente cliente = ClienteTranslator.toClient(obj.getCliente());
        Pedido pedido = PedidoTranslator.toPedido(obj.getPedido());

        return PedidoCliente
                .builder()
                .cliente(cliente)
                .pedido(pedido)
                .build();
    }

}
