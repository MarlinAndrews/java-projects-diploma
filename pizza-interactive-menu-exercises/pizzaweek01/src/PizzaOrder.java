/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marli
 */
public class PizzaOrder {

   // declaring Base Prices - Class Variables
    public static final double SMALL_BASE_PRICE = 8.0;
    public static final double LARGE_BASE_PRICE = 11.0;
    public static final double FAMILY_BASE_PRICE = 14.0;
    
    //declaring Topping Prices - class Variables
    
    public static final double SMALL_TOPPING_PRICE = 1.0;
    public static final double LARGE_TOPPING_PRICE = 1.5;
    public static final double FAMILY_TOPPING_PRICE = 2.0;
    
    public static void main(String[] args) {
        
   
        int numSmallPizzas = 2;
        int numLargePizzas = 2;
        int numFamilyPizzas = 1;
        int numSmallToppings = 3;
        int numLargeToppings = 4;
        int numFamilyToppings = 6;
        
        double smallCost;
        double largeCost;
        double familyCost;
        double totalCost = 0.0;
                
        // Calculate 2 small pizzas with 3 toppings each
        System.out.print("Order for small pizzas : $");
        
        smallCost = (SMALL_BASE_PRICE + (SMALL_TOPPING_PRICE * numSmallToppings)) * numSmallPizzas;
        System.out.println(smallCost);
        // Add small pizza cost to total cost
        totalCost = totalCost + smallCost;

        //Calculate large cost = 2 large pizzas with 4 toppings each
        System.out.print("Order for Large Pizzas : $");
        largeCost =  (LARGE_BASE_PRICE + ( LARGE_TOPPING_PRICE * numLargeToppings)) * numLargePizzas;
        System.out.println(largeCost);
        //Add large pizza cost to total cost
        totalCost += largeCost;
        
        System.out.print("Order for Family Pizzas : $");
        // Calculate Family pizza Cost = 1 family pizza with 6 toppings
       familyCost = FAMILY_BASE_PRICE + ((FAMILY_TOPPING_PRICE * numFamilyToppings)) * numFamilyPizzas;       
       //Add large pizza cost to total cost
       System.out.println(familyCost);
        totalCost += familyCost;
    }
}