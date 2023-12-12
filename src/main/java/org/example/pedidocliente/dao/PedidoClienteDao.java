package org.example.pedidocliente.dao;

import org.example.Cliente.dao.ClienteDAO.ClienteDao;
import org.example.Cliente.model.Cliente;
import org.example.Cliente.translator.ClienteTranslator;
import org.example.pedido.dao.PedidoDao;
import org.example.pedido.model.Pedido;
import org.example.pedido.translator.PedidoTranslator;
import org.example.pedidocliente.dto.PedidoClienteDTO;
import org.example.pedidocliente.model.PedidoCliente;
import org.example.utils.interfaces.Crudable;

public class PedidoClienteDao implements Crudable<PedidoClienteDTO, PedidoCliente> {

    @Override
    public PedidoCliente create(PedidoClienteDTO obj) {
        Cliente cliente = new ClienteDao().create(obj.getCliente());
        Pedido pedido   = new PedidoDao().create(obj.getPedido());

        return PedidoCliente
                .builder()
                .cliente(cliente)
                .pedido(pedido)
                .build();
    }

}
