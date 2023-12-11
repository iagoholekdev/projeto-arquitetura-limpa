package org.example.pedidocliente.controller;

import org.example.pedidocliente.dao.PedidoClienteDao;
import org.example.pedidocliente.dto.PedidoClienteDTO;
import org.example.pedidocliente.printable.PedidoClientPrintable;
import org.example.utils.aleatorios.ThreadForPrint;


public class PedidoClienteController {

    public void criarPedido(PedidoClienteDTO obj) {
        ThreadForPrint.printDynamicDotsFirstLog("Criando pedido",3);
        PedidoClienteDao pedidoClienteDao = new PedidoClienteDao();
        pedidoClienteDao.create(obj);
        ThreadForPrint.clean();
        System.out.print("\nPedido criado!");
        ThreadForPrint.printDynamicDotsFirstLog("\nImprimindo comprovante",3);
        ThreadForPrint.clean();
        PedidoClientPrintable pedidoClientPrintable = new PedidoClientPrintable();
        pedidoClientPrintable.print(obj);
        System.out.println();
    }


}
