package org.example.pedidocliente.validators;

import org.example.utils.resourcestring.ResourceString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidaTipoDoPedidoTest {


    @Test
    public void testIsValidPedido() {
        assertTrue(ValidaTipoDoPedido.isValidPedido(ResourceString.getXBurguerConst()));
        assertTrue(ValidaTipoDoPedido.isValidPedido(ResourceString.getCachorroQuenteTraco()));
        assertTrue(ValidaTipoDoPedido.isValidPedido(ResourceString.getCachorroQuenteSeparado()));
        assertTrue(ValidaTipoDoPedido.isValidPedido(ResourceString.getCachorroQuenteJunto()));

        assertFalse(ValidaTipoDoPedido.isValidPedido("InvalidPedido"));
    }

    @Test
    public void testIsCachorroQuente() {
        assertTrue(ValidaTipoDoPedido.isCachorroQuente(ResourceString.getCachorroQuenteSeparado()));
        assertTrue(ValidaTipoDoPedido.isCachorroQuente(ResourceString.getCachorroQuenteJunto()));
        assertTrue(ValidaTipoDoPedido.isCachorroQuente(ResourceString.getCachorroQuenteTraco()));

        assertFalse(ValidaTipoDoPedido.isCachorroQuente(ResourceString.getXBurguerConst()));
        assertFalse(ValidaTipoDoPedido.isCachorroQuente("InvalidPedido"));
    }

}