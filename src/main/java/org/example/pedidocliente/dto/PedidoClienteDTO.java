package org.example.pedidocliente.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.Cliente.dto.ClienteDTO;
import org.example.pedido.dto.PedidoDTO;

@Getter
@Setter
public class PedidoClienteDTO {

    private Long id;
    private ClienteDTO cliente;
    private PedidoDTO pedido;


}
