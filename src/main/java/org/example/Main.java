package org.example;

import org.example.Cliente.dto.ClienteDTO;
import org.example.pedido.dto.PedidoDTO;
import org.example.pedidocliente.controller.PedidoClienteController;
import org.example.pedidocliente.dto.PedidoClienteDTO;
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

        double randomValue = generateRandomValue();
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

        } while (!isValidPedido(pedido));


        return pedidoDTO;
    }

    private static double generateRandomValue() {
        double randomValue = 5.0 + (15.0 - 5.0) * Math.random();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedRandomValue = decimalFormat.format(randomValue);
        System.out.println("O valor do seu lanche é: " + formattedRandomValue);
        return Double.parseDouble(formattedRandomValue);
    }

    private static boolean isValidPedido(String pedido) {
        return "x-burguer".equalsIgnoreCase(pedido) ||
                "cachorro-quente".equalsIgnoreCase(pedido) ||
                "cachorroquente".equalsIgnoreCase(pedido) ||
                "cachorro quente".equalsIgnoreCase(pedido);
    }

}