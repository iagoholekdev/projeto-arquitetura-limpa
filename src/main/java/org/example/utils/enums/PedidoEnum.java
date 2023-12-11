package org.example.utils.enums;

import lombok.Getter;

@Getter
public enum PedidoEnum {

    CACHORRO_QUENTE("Cachorro quente"),
    XBURGUER("X-burguer");

    private final String descricao;

    PedidoEnum(String descricao) {
        this.descricao = descricao;
    }

}
