package co.uniquindio.poo;

import Model.IngredientesChicago;
import Model.IngredientesFactory;
import Model.IngredientesNY;
import Model.Pizza;

public class Main {
    public static void main(String[] args) {
        IngredientesFactory f = new IngredientesNY();
        Pizza pizza = new Pizza(f);
        IngredientesFactory ingredientes = new IngredientesChicago();
        Pizza pizza2 = new Pizza(ingredientes);
        System.out.print(pizza.descripcion());
    }
}