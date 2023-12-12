package org.example.pedidocliente.printable;

import org.example.pedido.PedidoEnum;
import org.example.pedidocliente.dto.PedidoClienteDTO;
import org.example.pedidocliente.interfaces.ImprimirIngredientesStrategy;
import org.example.pedidocliente.strategy.ingredientes.ingredientescachorroquente.IngredientesCachorroQuente;
import org.example.pedidocliente.strategy.ingredientes.ingredienteshamburguer.IngredientesHamburguer;
import org.example.pedidocliente.strategy.ingredientes.ImprimirIngredientesContext;
import org.example.utils.aleatorios.ThreadForPrint;
import org.example.utils.interfaces.Printable;

public class PedidoClientPrintable implements Printable<PedidoClienteDTO> {

    public void print(PedidoClienteDTO obj) {

        System.out.println("\n");
        System.out.println("\nDados do pedido");
        System.out.println("*******************");
        System.out.println("Nome do cliente: " + obj.getCliente().getNome());
        System.out.println("Valor do pedido: " + obj.getPedido().getValor());
        System.out.println("Lanche escolhido: " + obj.getPedido().getTipoPedido().getDescricao());
        this.imprimirIngredientesEspecificos(obj.getPedido().getTipoPedido());
        System.out.println("*******************\n");


        ThreadForPrint.printDynamicDotsFirstLog("Obrigado e volte sempre!", 3);
        ThreadForPrint.clean();
    }

    private void imprimirIngredientesEspecificos(PedidoEnum tipoPedido) {
        ImprimirIngredientesStrategy strategy;

        switch (tipoPedido) {
            case CACHORRO_QUENTE:
                strategy = new IngredientesCachorroQuente();
                break;
            case XBURGUER:
                strategy = new IngredientesHamburguer();
                break;
            default:
                throw new IllegalArgumentException("Estratégia de ingredientes não encontrada para o tipo de pedido: " + tipoPedido);
        }

        ImprimirIngredientesContext context = new ImprimirIngredientesContext(strategy);
        context.imprimirIngredientes();
    }

}
