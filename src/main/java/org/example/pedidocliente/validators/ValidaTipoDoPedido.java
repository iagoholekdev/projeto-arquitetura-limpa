package org.example.pedidocliente.validators;

import org.example.utils.resourcestring.ResourceString;

public class ValidaTipoDoPedido {

    public static boolean isValidPedido(String pedido) {
        return ResourceString.getXBurguerConst().equalsIgnoreCase(pedido) ||
                ResourceString.getCachorroQuenteTraco().equalsIgnoreCase(pedido) ||
                ResourceString.getCachorroQuenteSeparado().equalsIgnoreCase(pedido) ||
                ResourceString.getCachorroQuenteJunto().equalsIgnoreCase(pedido);
    }

}
