package pizzeria;

import java.text.NumberFormat;
import java.util.Scanner; // import library for input

/**
 * PizzaOrder class is the main class to interact with user for pizza orders.
 * This class prompts the user for details about the pizza order,
 * such as size, number of toppings, and quantity.
 * It also calculates and displays the total cost of all pizzas ordered.
 * 
 * @author marli
 */
public class PizzaOrder {
    
    /**
     * Main method which runs the pizza ordering system. This is the entry point for the application.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        
        // Formatter for currency output.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        // Input scanner.
        Scanner keyboard = new Scanner(System.in);
        
        // Variables for one type of pizza in the order.
        String baseSize = "";
        int numToppings = 0;
        int quantity = 0;
         
        // Variables for the whole order.
        double totalCost = 0.0;
        String orderMore = "";
        final int MAX_PIZZAS = 10;
        Pizza[] pizzas = new Pizza[MAX_PIZZAS];
        int pizzaIndex = 0;
        int expensivePizzaIndex = 0;

         
        do {
            // Get pizza details.
            System.out.println("Please place the order for your pizza.");
            System.out.print("Size (s = small, l = large, f = family): ");
            baseSize = keyboard.nextLine();
            System.out.print("Number of toppings: ");
            numToppings = keyboard.nextInt();
            System.out.print("Quantity: ");
            quantity = keyboard.nextInt();
            
            keyboard.nextLine();
            
            // Print pizza details including cost.
            Pizza pizza = new Pizza(baseSize, numToppings, quantity);
            System.out.println(pizza);
            
            // Store the pizza
            pizzas[pizzaIndex] = pizza;
            pizzaIndex++;

 
            // Maintain total cost.
            totalCost += pizza.calculateCost();
 
            // Determine if order is finished.
            System.out.print("Order more? (y/n): ");
            orderMore = keyboard.nextLine();
            System.out.println();
 
        } while (orderMore.equals("y") && pizzaIndex < MAX_PIZZAS);

        // Display total cost.
        System.out.println("Number of pizzas ordered: " + Pizza.getNumPizzas());
        System.out.print("Total cost is: " );
        System.out.println(nf.format(totalCost));
        System.out.println("Thank you for your order!");
        
        // Most expensive pizza determination and result.
        for (int i = 1; i < pizzaIndex; i++) {
        if (pizzas[i].calculateCost() >
        pizzas[expensivePizzaIndex].calculateCost()) {
        expensivePizzaIndex = i;
        }  
        }
        System.out.println("This was the most expensive pizza:");
        System.out.println(pizzas[expensivePizzaIndex]);
    }
}
