package org.example.pedidocliente.model;

import lombok.*;
import org.example.Cliente.model.Cliente;
import org.example.pedido.model.Pedido;
import org.example.utils.enums.PedidoEnum;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class PedidoCliente {


    private Long id;
    private Cliente cliente;
    private Pedido pedido;

}
