/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marli
 */
// import library for input
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner; 


public class PizzaOrder {
    
   //declaring constants
   // declaring  Base Prices
    public static final double SMALL_BASE_PRICE = 8.0;
    public static final double LARGE_BASE_PRICE = 11.0;
    public static final double FAMILY_BASE_PRICE = 14.0;
    
    //declaring Topping Prices
    
    public static final double SMALL_TOPPING_PRICE = 1.0;
    public static final double LARGE_TOPPING_PRICE = 1.5;
    public static final double FAMILY_TOPPING_PRICE = 2.0;
    
    public static void main(String[] args) throws FileNotFoundException {
        
  
      // object set up and initialization
        FileInputStream fStream = new FileInputStream("order.txt");
        FileInputStream fStreamMenu = new FileInputStream ("menu.txt");
        Scanner fileIn = new Scanner(fStream);
        Scanner fileMenu = new Scanner(fStreamMenu);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Random random = new Random();

        //declaring variables

        double totalCost;
        double smallCost;
        double largeCost;
        double familyCost;
        int randomSmallToppings;
        int randomLargeToppings;
        int randomFamilyToppings;
        
        //new menu variables
        String pizzaName = "";
        int noChickenPizza = 0;
        String newPizzaName = "";
        
        

        // Small order
        System.out.print("Processing small pizzas: ");
        
        randomSmallToppings = random.nextInt(7);
        System.out.println("Number of toppings: " + randomSmallToppings);

        int smallQuantity = fileIn.nextInt();
        smallCost = SMALL_BASE_PRICE + (randomSmallToppings * SMALL_TOPPING_PRICE);
        smallCost *=   smallQuantity;
        System.out.println("Quantity: " + smallQuantity);
        System.out.println("Pizza cost is: " + formatter.format(smallCost));

        // Large order
        System.out.print("Processing large pizzas: ");
        
        randomLargeToppings = random.nextInt(7);
        System.out.println("Number of toppings: " + randomLargeToppings);

        int largeQuantity = fileIn.nextInt();
        largeCost = LARGE_BASE_PRICE + (randomLargeToppings * LARGE_TOPPING_PRICE);
        largeCost *= largeQuantity;
        System.out.println("Quantity: " + largeQuantity);
        System.out.println("Pizza cost is: " + formatter.format(largeCost));

        // Family Order
        System.out.print("Processing family-sized pizzas: ");
        
        randomFamilyToppings = random.nextInt(7);
        System.out.println("Number of toppings: " + randomFamilyToppings);

        int familyQuantity = fileIn.nextInt(); 
        familyCost = FAMILY_BASE_PRICE + (randomFamilyToppings * FAMILY_TOPPING_PRICE);
        familyCost *= familyQuantity;
        System.out.println("Quantity: " + familyQuantity);
        System.out.println("Pizza cost is: " + formatter.format(familyCost)+"\n");
        
        // Calculate total cost and print
        totalCost = smallCost + largeCost + familyCost;
        System.out.println("Total cost is: " + formatter.format(totalCost));
        System.out.println("Thank you for your order!");

        fileIn.close();
        
        // new menu
        System.out.println("\n \n \n" + "Our New Menu: ");
        
        for (int line =1; line <=7; line ++){
            pizzaName = fileMenu.nextLine();
            
            
            if (pizzaName.contains("CHICKEN")){
                noChickenPizza ++;
                pizzaName = "HOT " + pizzaName;
            }
            System.out.println(pizzaName);
            
        }
        System.out.println("We have " + noChickenPizza + " new chicken pizzas.");
        
            
            
            
        
    }
}