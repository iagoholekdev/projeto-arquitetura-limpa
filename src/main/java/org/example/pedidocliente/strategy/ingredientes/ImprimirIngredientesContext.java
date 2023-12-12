package org.example.pedidocliente.strategy.ingredientes;

import org.example.pedidocliente.interfaces.ImprimirIngredientesStrategy;

public class ImprimirIngredientesContext {
    private ImprimirIngredientesStrategy strategy;

    public ImprimirIngredientesContext(ImprimirIngredientesStrategy strategy) {
        this.strategy = strategy;
    }

    public void imprimirIngredientes() {
        strategy.imprimirIngredientes();
    }
}