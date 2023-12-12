package org.example.pedido.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.pedido.PedidoEnum;

@Getter
@Setter
public class PedidoDTO {

    private Long id;
    private PedidoEnum tipoPedido;
    private Double valor;

}
