/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dryermethoddraft;

/**
 *
 * @author marli
 */
import java.util.Scanner;
public class DryerMethodDraft {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int dryTime;
        int dryTimeCost;
      
        do{
          System.out.println("Please select the time for your drying\n\n"
               +"       Option 1 - 30 minutes -$1\n"
               +"       Option 2 - 60 minutes - $2\n"
               +"       Option 3 - 90 minutes - $3\n"
               +"       Option 4 - Skip drying\n\n"
               +"Enter your selection for dry time :");  
          dryTime = input.nextInt();
          
          if (dryTime == 1){
            System.out.println("\nYou have selected 30 minutes drying - $1\n");
            dryTimeCost = 1;
        } else if (dryTime == 2){
            System.out.println("\nYou have selected 60 minutues drying - $2\n");
           dryTimeCost = 2; 
        } else if (dryTime == 3){
            System.out.println("\nYou have selected 90 minutes drying - $3\n");
            dryTimeCost = 3;
        } else if (dryTime == 4) {
            System.out.println("\nYou have skipped drying \n"); 
    } 
       }while(dryTime!=1 && dryTime!=2 && dryTime!=3 && dryTime!=4); 
        
}
}
