package org.example.pedidocliente.strategy.ingredientes.ingredienteshamburguer;

import org.example.pedidocliente.interfaces.ImprimirIngredientesStrategy;

public class IngredientesHamburguer implements ImprimirIngredientesStrategy {

    @Override
    public void imprimirIngredientes() {
        System.out.println("Ingredientes do X-Burguer:");
        System.out.println("- Hambúrguer");
        System.out.println("- Pão");
        System.out.println("- Salada");
        System.out.println("- Molho de alho");
    }

}
