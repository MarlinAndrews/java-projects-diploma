package pizzeria;

import java.text.NumberFormat;

/**
 * Pizza class that represents a pizza order.
 * A pizza order consists of the base size of the pizza,
 * the number of toppings, and the quantity of pizzas ordered.
 *
 * @author marli
 */
public class Pizza {
    /**
     * The number of pizzas ordered.
     */
    private static int numPizzas = 0; 

    /**
     * The base prices for different sizes of pizzas.
     */
    private static final double SMALL_BASE_PRICE = 8.0;
    private static final double LARGE_BASE_PRICE = 11.0;
    private static final double FAMILY_BASE_PRICE = 14.0;

    /**
     * The prices for different sizes of pizza toppings.
     */
    private static final double SMALL_TOPPING_PRICE = 1.0;
    private static final double LARGE_TOPPING_PRICE = 1.5;
    private static final double FAMILY_TOPPING_PRICE = 2.0;

    /**
     * The base size of the pizza.
     */
    private String baseSize;

    /**
     * The number of toppings on the pizza.
     */
    private int numToppings;

    /**
     * The quantity of pizzas ordered.
     */
    private int quantity;

    /**
     * Default constructor that initializes the base size to "s", the number of toppings to 3, and the quantity to 1.
     */
    public Pizza() {
        this.baseSize = "s";
        this.numToppings = 3;
        this.quantity = 1;
        numPizzas += this.quantity;
    }

    /**
     * Three-argument constructor that initializes the base size, number of toppings, and quantity to given values.
     * @param baseSize The base size of the pizza.
     * @param numToppings The number of toppings on the pizza.
     * @param quantity The quantity of pizzas ordered.
     */
    public Pizza(String baseSize, int numToppings, int quantity) {
        this.baseSize = baseSize;
        this.numToppings = numToppings;
        this.quantity = quantity;
        numPizzas += this.quantity;
    }

    /**
     * Deep copy constructor.
     * @param another Another Pizza object from which to create a deep copy.
     */
    public Pizza(Pizza another) {
        this.baseSize = another.baseSize;
        this.numToppings = another.numToppings;
        this.quantity = another.quantity;
        numPizzas += this.quantity;
        
    }

    // Accessor methods
    public String getBaseSize() {
        return baseSize;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getNumPizzas() {
        return numPizzas;
    }

    // Mutator methods
    public void setBaseSize(String baseSize) {
        this.baseSize = baseSize;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates and returns the total cost of the pizza order.
     * @return The total cost of the pizza order.
     */
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

        pizzaCost = (baseCost + (numToppings * toppingCost)) * quantity;

        return pizzaCost;
    }

    /**
     * Returns a string representation of the Pizza object.
     * @return A string representation of the Pizza object.
     */
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "Pizza (baseSize = " + baseSize +
            ", numToppings = " + numToppings +
            ", quantity = " + quantity +       
            ") costs " + nf.format(calculateCost()) +
            ".";
    }

    /**
     * Checks if the given Pizza object is equal to this one.
     * @param another Another Pizza object to compare with.
     * @return true if the given Pizza object is equal to this one, false otherwise.
     */
    public boolean equals(Pizza another) {
        return this.baseSize.equals(another.getBaseSize()) &&
            this.numToppings == another.getNumToppings() &&
            this.quantity == another.getQuantity();
    }
}
