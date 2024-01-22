/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academictester;

import java.util.Scanner;

/**
 *
 * @author marli
 */

public class OverloadedAcademic {
    private int salary;
    
    public void payRise() { // prompts user to nominate the pay rise amount
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter the pay rise: ");
        int amount = keyboard.nextInt();
        this.salary += amount;
    }
    public void payRise (int amount) { // supplies the pay rist amount in an argument
        this.salary += amount;
  
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
