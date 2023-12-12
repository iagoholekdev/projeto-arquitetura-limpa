package org.example.pedido;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum PedidoEnum {

    CACHORRO_QUENTE("Cachorro quente"),
    XBURGUER("X-burguer");

    private String descricao;

    PedidoEnum(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
