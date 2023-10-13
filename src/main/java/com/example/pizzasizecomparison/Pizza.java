package com.example.pizzasizecomparison;

public class Pizza {
    private String pizzaName, pizzaType, pizzaSize;
    private float pizzaPrice;

    // Constructor to create a Pizza object with validation
    public Pizza(String pizzaName, String pizzaType, String pizzaSize, float pizzaPrice) {
        setPizzaName(pizzaName);
        setPizzaType(pizzaType);
        setPizzaSize(pizzaSize);
        setPizzaPrice(pizzaPrice);
    }

    // Get the name of the pizza
    public String getPizzaName() {
        return pizzaName;
    }

    // Set the name of the pizza with validation
    public void setPizzaName(String pizzaName) {
        if (validateString(pizzaName, 200)) {
            this.pizzaName = pizzaName;
        } else {
            throw new IllegalArgumentException("Pizza name should be less than 200 characters!");
        }
    }

    // Get the type of the pizza
    public String getPizzaType() {
        return pizzaType;
    }

    // Set the type of the pizza with validation
    public void setPizzaType(String pizzaType) {
        if (validateString(pizzaType, 100)) {
            this.pizzaType = pizzaType;
        } else {
            throw new IllegalArgumentException("Pizza type should be less than 100 characters!");
        }
    }

    // Get the size of the pizza
    public String getPizzaSize() {
        return pizzaSize;
    }

    // Set the size of the pizza with validation
    public void setPizzaSize(String pizzaSize) {
        if (validateString(pizzaSize, 10)) {
            this.pizzaSize = pizzaSize;
        } else {
            throw new IllegalArgumentException("Pizza size should be less than 10 characters!");
        }
    }

    // Get the price of the pizza
    public float getPizzaPrice() {
        return pizzaPrice;
    }

    // Set the price of the pizza with validation
    public void setPizzaPrice(float pizzaPrice) {
        if (pizzaPrice >= 0) {
            this.pizzaPrice = pizzaPrice;
        } else {
            throw new IllegalArgumentException("Pizza price should be a non-negative value!");
        }
    }

    // Validating the string against a maximum length
    public boolean validateString(String stringToTest, int maxLength) {
        stringToTest = stringToTest.trim();
        return stringToTest.length() >= 2 && stringToTest.length() <= maxLength;
    }
}
