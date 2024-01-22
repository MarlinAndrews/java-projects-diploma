/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marli
 */
import java.text.NumberFormat;
import java.util.Scanner; // import library for input

public class PizzaOrder {

   // declaring Base Prices
    public static final double SMALL_BASE_PRICE = 8.0;
    public static final double LARGE_BASE_PRICE = 11.0;
    public static final double FAMILY_BASE_PRICE = 14.0;
    
    //declaring Topping Prices
    
    public static final double SMALL_TOPPING_PRICE = 1.0;
    public static final double LARGE_TOPPING_PRICE = 1.5;
    public static final double FAMILY_TOPPING_PRICE = 2.0;
    
    public static void main(String[] args) {
        
  
        Scanner keyboard = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(); // Creating a currency formatter
        
       
        double totalCost = 0.0;
        String orderMore;

        do {
            System.out.print("Place an order\ns = small, l = large, f = family: ");
            String userOrder = keyboard.nextLine();
            double cost = 0.0;

            switch (userOrder) {
                case "s":
                    cost += SMALL_BASE_PRICE; // Set base cost for s
                    System.out.print("Place an order for toppings 0-10: ");
                    int userToppings = keyboard.nextInt(); // Get toppings input
                    cost += (SMALL_TOPPING_PRICE * userToppings); // Adds topping cost
                    System.out.print("Place an order for quantity 1-10: ");
                    int userQuant = keyboard.nextInt(); // Get pizza quantity
                    cost *= userQuant;
                    System.out.println("Pizza cost is: " + formatter.format(cost));
                    totalCost += cost;
                    break;

                case "l":
                    cost += LARGE_BASE_PRICE; // Set base cost
                    System.out.print("Place an order for toppings 0-10: ");
                    userToppings = keyboard.nextInt(); // Get toppings input
                    cost += (LARGE_TOPPING_PRICE * userToppings); // Adds topping cost
                    System.out.print("Place an order for quantity 1-10: ");
                    userQuant = keyboard.nextInt(); // Get pizza quantity
                    cost *= userQuant;
                    System.out.println("Pizza cost is: " + formatter.format(cost));
                    totalCost += cost;
                    break;

                case "f":
                    cost += FAMILY_BASE_PRICE; // Set base cost
                    System.out.print("Place an order for toppings 0-10: ");
                    userToppings = keyboard.nextInt(); // Get toppings input
                    cost += (FAMILY_TOPPING_PRICE * userToppings); // Adds topping cost
                    System.out.print("Place an order for quantity 1-10: ");
                    userQuant = keyboard.nextInt(); // Get pizza quantity
                    cost *= userQuant;
                    System.out.println("Pizza cost is: " + formatter.format(cost));
                    totalCost += cost;
                    break;

                default:
                    System.out.println("Invalid order!");
                    break;
            }

            keyboard.nextLine(); // Consume the remaining newline character after nextInt()

            System.out.print(" Order more? (y/n): ");
            orderMore = keyboard.nextLine();
        } while (orderMore.equals("y"));
        
        System.out.println("Total cost of your pizza is: " + formatter.format(totalCost));
        keyboard.close();
    }
}