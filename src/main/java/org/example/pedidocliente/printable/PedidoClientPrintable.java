package org.example.pedidocliente.printable;

import org.example.pedidocliente.dto.PedidoClienteDTO;
import org.example.utils.enums.interfaces.Printable;

public class PedidoClientPrintable implements Printable<PedidoClienteDTO> {

    public void print(PedidoClienteDTO obj) {
        System.out.println("\nDados do pedido");
        System.out.println("*******************");
        System.out.println("Nome do cliente: " + obj.getCliente().getNome());
        System.out.println("Valor do pedido: " + obj.getPedido().getValor());
        System.out.println("Lanche escolhido: " + obj.getPedido().getTipoPedido().getDescricao());
        System.out.println("*******************");
    }

}
