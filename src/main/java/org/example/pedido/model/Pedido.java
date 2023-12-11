package org.example.pedido.model;

import lombok.Getter;
import lombok.Setter;
import org.example.utils.enums.PedidoEnum;

@Getter
@Setter
public class Pedido {

    private Long id;

    private PedidoEnum pedido;

    private Double valor;

}
