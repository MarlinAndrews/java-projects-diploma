package pizzeria;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marli
 */
import java.text.NumberFormat;

public class Pizza {
    
     
     // declaring Base Prices
    private static final double SMALL_BASE_PRICE = 8.0;
    private static final double LARGE_BASE_PRICE = 11.0;
    private static final double FAMILY_BASE_PRICE = 14.0;
    //declaring Topping Prices
    private static final double SMALL_TOPPING_PRICE = 1.0;
    private static final double LARGE_TOPPING_PRICE = 1.5;
    private static final double FAMILY_TOPPING_PRICE = 2.0;

    // instance variables
     public String baseSize;
     public int numToppings;
     public int quantity;
     
     public Pizza() { // default constructor
         this.baseSize = "s";
         this.numToppings = 3;
         this.quantity = 1;
        }
     public Pizza(String baseSize, int numToppings, int quantity) { // 3 argument constructor
         this.baseSize = baseSize;
         this.numToppings = numToppings;
         this.quantity = quantity;
        }
            // Accessor and mutator methods.
    public String getBaseSize() {
    return baseSize;
    }
    public int getNumToppings() {
    return numToppings;
    }
    public int getQuantity() {
    return quantity;
    }
    public void setBaseSize(String baseSize) {
    this.baseSize = baseSize;
    }
    public void setNumToppings(int numToppings) {
    this.numToppings = numToppings;
    }
    public void setQuantity(int quantity) {
    this.quantity = quantity;
    }

    // Calculate and return the cost of the pizza.
    public double calculateCost() {
    double baseCost = 0.0;
    double toppingCost = 0.0;
    double pizzaCost = 0.0;

    switch (baseSize) {
    case "s":
    baseCost = SMALL_BASE_PRICE;
    toppingCost = SMALL_TOPPING_PRICE;
    break;
    case "f":
        baseCost = FAMILY_BASE_PRICE;
    toppingCost = FAMILY_TOPPING_PRICE;
    break;
    case "l":
    default: // Assume "large" is default.
    baseCost = LARGE_BASE_PRICE;
    toppingCost = LARGE_TOPPING_PRICE;
    break;
    }
    pizzaCost = (baseCost + (numToppings *
    toppingCost)) * quantity;

    return pizzaCost;
    }

    // Prints the details and cost of the pizza.
    public String toString() {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return "Pizza (baseSize = " + baseSize +
    ", numToppings = " + numToppings +
    ", quantity = " + quantity +
    ") costs " + nf.format(calculateCost()) +
    ".";
    }

    // Determines if the pizza has the same instance variables.
    public boolean equals(Pizza another) {
    return this.baseSize.equals(another.getBaseSize()) &&
    this.numToppings == another.getNumToppings() &&
    this.quantity == another.getQuantity();
    }
   }







