package pizzeria;

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
    

    public static void main(String[] args) {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Scanner keyboard = new Scanner (System.in);
        //variables for one type of pizza in the order
         String baseSize = "";
         int numToppings = 0;
         int quantity = 0;
         
         //variables for whole order
         double totalCost = 0.0;
         String orderMore = "";
         
         do {
             //get pizza detials
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
 
            // Maintain total cost.
            totalCost += pizza.calculateCost();
 
            // Determine if order is finished.
            System.out.print("Order more? (y/n): ");
            orderMore = keyboard.nextLine();
            System.out.println();
 
            } while (orderMore.equals("y"));

            // Display total cost.
            System.out.print("Total cost is: ");
            System.out.println(nf.format(totalCost));
            System.out.println("Thank you for your order!");
 }  
         }
         

         

         

         
        

        

        
      
