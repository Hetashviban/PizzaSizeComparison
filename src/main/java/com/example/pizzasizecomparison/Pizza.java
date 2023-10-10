package com.example.pizzasizecomparison;

public class Pizza {
    private String pizzaName, pizzaType, pizzaSize;
    private float pizzaPrice;

    /*Constructor used to read a task from the database*/

    public Pizza(String pizzaName, String pizzaType, String pizzaSize, float pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.pizzaPrice = pizzaPrice;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public float getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(float pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}
