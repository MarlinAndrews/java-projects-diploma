package academictester;


import java.time.LocalDate;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marli
 */
public class Academic {

    //instance variables
    public int empID;
    public String firstName;
    public String lastName;
    public LocalDate dOB;
    public LocalDate hireDate;
    public double salary;
    public String skills;

    //method for display
    public void displaySummary(){
        System.out.println("Employee " +empID+ " is " +firstName+ " " +lastName+".");
        
    }
    
    // method for adding skills
    public void addSkills(String skill) {
        this.skills += skill;
    }
    
    public void payRise(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the new Salary: ");
        double  salary = keyboard.nextInt();
        this.salary = salary;
    }
    
}
