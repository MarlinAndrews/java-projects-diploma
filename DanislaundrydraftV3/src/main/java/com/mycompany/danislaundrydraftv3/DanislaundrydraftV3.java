/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danislaundrydraftv3;



/**
 *
 * @author marli
 */
import java.util.Scanner; // Scanner imported
public class DanislaundrydraftV3 {
    // Static initialization allows the variables to be used across methods
static int addWashingCapsule = 0;
static int addSoftener = 0;
static int washTotal = 0;
static int dryTime;
static int dryTimeCost;
static String dryLength;
static int totalCost;
        

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("********Welcome to Dani's Laundry********\n"
               + "       - Services and Costs below -\n"        
               + "------------------------------------------\n"
               + "      Wash for 30 minutues   - $1\n"
               + "      Washing Capsules       - $1\n"
               + "      Softener Capsules      - $1\n"
               + "      Dryer:     30 minutues - $1\n"
               + "                 60 minutues - $1\n"
               + "                 90 minutues - $1\n"
               + "------------------------------------------\n"
               +"Please select from the options below to start\n"
               +"       Option 1 - Wash only\n"
               +"       Option 2 - Wash & Dry\n"
               +"       Option 3 - Dry only\n"
               +"       Option 4 - Exit\n");
       
       System.out.println("Enter your selection number 1-4");
       int userNum = input.nextInt(); // user input 
      
          if (userNum == 1){  // if option 1    Call washingMethod & displaySummaryMethod
            washMethod();
            displaySummaryMethod();
            
            
        } else if (userNum == 2){// else if option 2    Call washingMethod & dryerMethod &displaySummaryMethod
            washMethod();
            dryerMethod();
            displaySummaryMethod();
            
        } else if (userNum == 3){ // else if option 3    Call dryerMethod & displaySummaryMethod
            dryerMethod();
            displaySummaryMethod();
        } else if (userNum == 4) { // else if option 4 exit
             System.out.println("You have chosen to exit. Goodbye.");
    } 
    }    
    static void washMethod(){
        
        Scanner input = new Scanner(System.in); // initialize input
        washTotal = washTotal +1; // adds cost of washing
        
        //initialise user input and create condtion veriable for boolean
        String answer1; 
        String answer2;
        boolean yn; 
        
        while(true){
            
            System.out.println("Would you like to add a Washing Capsule? Y/N?"); //Q1
            answer1 = input.nextLine().trim().toLowerCase(); // converts input Y/N to meet the lowercase condition
            if(answer1.equals("y")) {
                addWashingCapsule = addWashingCapsule +1; // adds capsule cost
                yn=true;
                break; // will repeat question regardless of answer without break
            } else if (answer1.equals("n")) {
                yn = false;
                break; 
            } else {
                System.out.println("Invalid input. Please answer Y/N");
            }
        }
        while(true){           
            System.out.println("Would you like to add a Softener?"); //Q2
            answer2 = input.nextLine().trim().toLowerCase(); // converts input Y/N to meet the lowercase condition
            if(answer2.equals("y")) {
                addSoftener = addSoftener +1; // adds Softener cost
                yn=true;
                break;
            } else if (answer2.equals("n")) {
                yn = false;
                break; // will repeat question regardless of answer without break
            } else {
                System.out.println("Invalid input. Please answer Y/N"); 
            }
            
        }
        
    }
    static void dryerMethod() {
        Scanner input = new Scanner (System.in); // initialize input
   
        do{
          System.out.println("Please select the time for your drying\n\n" // start of loop
               +"       Option 1 - 30 minutes -$1\n"
               +"       Option 2 - 60 minutes - $2\n"
               +"       Option 3 - 90 minutes - $3\n"
               +"       Option 4 - Skip drying\n\n"
               +"Enter your selection for dry time :");  
          dryTime = input.nextInt(); // user input
          
          if (dryTime == 1){ // Option 1
            System.out.println("\nYou have selected 30 minutes drying - $1\n");
            dryTimeCost = 1; 
            dryLength = "30 minutues";
        } else if (dryTime == 2){ // Option 2
            System.out.println("\nYou have selected 60 minutues drying - $2\n");
           dryTimeCost = 2;
           dryLength = "60 minutues";
        } else if (dryTime == 3){ // Option 3 
            System.out.println("\nYou have selected 90 minutes drying - $3\n");
            dryTimeCost = 3;
            dryLength = "90 minutues"; 
        } else if (dryTime == 4) {// Option 4
            System.out.println("\nYou have skipped drying \n"); 
    } 
       }while(dryTime!=1 && dryTime!=2 && dryTime!=3 && dryTime!=4); // Whils an answer 1-4 is not given repeat loop
    }
    static void displaySummaryMethod(){
        System.out.println("Thanks for using Dani's Laundry Services: \n");
        System.out.println("Cost for services selected: \n");
        System.out.println("Wash $" + washTotal + "\n"); // + washTotal 
        System.out.println("Washing Capsule $" + addWashingCapsule +"\n" ); // +washingCapsuleC
        System.out.println ("Softener $" + addSoftener + "\n"); // + addSoftenerCost
        System.out.println("Drying time " + dryLength + " $" + dryTimeCost + "\n");// = dryTimeCost
        totalCost = dryTimeCost + washTotal + addSoftener + addWashingCapsule;
        System.out.println ("Total cost: $" + totalCost); // + totalCost 
        
    }
    
       
    
}