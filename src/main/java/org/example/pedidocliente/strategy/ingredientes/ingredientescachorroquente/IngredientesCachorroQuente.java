package org.example.pedidocliente.strategy.ingredientes.ingredientescachorroquente;

import org.example.pedidocliente.interfaces.ImprimirIngredientesStrategy;

public class IngredientesCachorroQuente implements ImprimirIngredientesStrategy {

    @Override
    public void imprimirIngredientes() {
        System.out.println("Ingredientes do Cachorro Quente:");
        System.out.println("- Salsicha");
        System.out.println("- Pão");
        System.out.println("- Milho");
        System.out.println("- Vinagrete");
    }

}
