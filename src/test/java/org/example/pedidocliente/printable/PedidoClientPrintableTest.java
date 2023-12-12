package org.example.pedidocliente.printable;

import org.example.Cliente.dto.ClienteDTO;
import org.example.Cliente.model.Cliente;
import org.example.pedido.dto.PedidoDTO;
import org.example.pedidocliente.dto.PedidoClienteDTO;
import org.example.utils.enums.PedidoEnum;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class PedidoClientPrintableTest {

        @Test
        public void testPrint() {
            // Redirect System.out to capture printed output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Create a PedidoClienteDTO for testing
            PedidoClienteDTO pedidoClienteDTO = new PedidoClienteDTO();

            ClienteDTO clienteDTO = new ClienteDTO();
            PedidoDTO pedidoDTO = new PedidoDTO();

            pedidoClienteDTO.setCliente(clienteDTO);
            pedidoClienteDTO.setPedido(pedidoDTO);

            pedidoClienteDTO.getCliente().setNome("John Doe");
            pedidoClienteDTO.getPedido().setValor(10.0);
            pedidoClienteDTO.getPedido().setTipoPedido(PedidoEnum.XBURGUER);

            PedidoClientPrintable pedidoClientPrintable = new PedidoClientPrintable();

            pedidoClientPrintable.print(pedidoClienteDTO);

            System.setOut(System.out);

            String expectedOutput = "\nDados do pedido\n" +
                    "*******************\n" +
                    "Nome do cliente: John Doe\n" +
                    "Valor do pedido: 10.0\n" +
                    "Lanche escolhido: X-Burguer\n" +
                    "*******************\n";

            String actualOutput = outputStream.toString().trim().toLowerCase();
            expectedOutput = expectedOutput.trim().toLowerCase();

            assertEquals(expectedOutput, actualOutput);
        }
    }
