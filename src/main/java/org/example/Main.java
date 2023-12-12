package org.example;

import org.example.Cliente.dto.ClienteDTO;
import org.example.pedido.dto.PedidoDTO;
import org.example.pedidocliente.controller.PedidoClienteController;
import org.example.pedidocliente.dto.PedidoClienteDTO;
import org.example.pedidocliente.validators.ValidaTipoDoPedido;
import org.example.utils.aleatorios.RandomValues;
import org.example.utils.enums.PedidoEnum;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        PedidoClienteDTO pedidoClienteDTO = new PedidoClienteDTO();

        ClienteDTO clienteDTO = createCliente(myScanner);

        PedidoDTO pedidoDTO = createPedido(myScanner);

        double randomValue = RandomValues.generateRandomValue();
        pedidoDTO.setValor(randomValue);

        pedidoClienteDTO.setCliente(clienteDTO);
        pedidoClienteDTO.setPedido(pedidoDTO);

        PedidoClienteController controller = new PedidoClienteController();
        controller.criarPedido(pedidoClienteDTO);
    }

    private static ClienteDTO createCliente(Scanner myScanner) {
        ClienteDTO clienteDTO = new ClienteDTO();

        String nome = myScanner.nextLine();

        clienteDTO.setId(1L);
        clienteDTO.setNome(nome);

        return clienteDTO;
    }

    private static PedidoDTO createPedido(Scanner myScanner) {
        PedidoDTO pedidoDTO = new PedidoDTO();

        String pedido;

        do {
            System.out.println("Qual é o seu pedido? Temos cachorro-quente e x-burguer.");
            pedido = myScanner.nextLine();

            if ("x-burguer".equalsIgnoreCase(pedido)) {
                pedidoDTO.setTipoPedido(PedidoEnum.XBURGUER);
            } else if ("cachorro-quente".equals(pedido) || "cachorroquente".equalsIgnoreCase(pedido) || "cachorro quente".equalsIgnoreCase(pedido)) {
                pedidoDTO.setTipoPedido(PedidoEnum.CACHORRO_QUENTE);
            } else {
                System.out.println("Pedido inválido. Tente novamente.");
            }

        } while (!ValidaTipoDoPedido.isValidPedido(pedido));

        return pedidoDTO;
    }


}