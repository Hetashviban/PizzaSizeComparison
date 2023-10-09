package com.example.pizzasizecomparison;

public class PizzaSold {
    private String pizzaName;
    private String pizzaType;
    private String pizzaSize;
    private float pizzaPrice;

    /*Constructor used to read a task from the database*/

    public PizzaSold(String pizzaName, String pizzaType, String pizzaSize, float pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.pizzaPrice = pizzaPrice;
    }
}
