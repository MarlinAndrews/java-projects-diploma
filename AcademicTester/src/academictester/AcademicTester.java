/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academictester;

/**
 *
 * @author marli
 */
public class AcademicTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Academic johnSmith = new Academic();
        johnSmith.firstName = "John";
        johnSmith.lastName = "Smith";
        johnSmith.empID = 1;
        johnSmith.skills = "Java, Excel ";
        
        Academic ianRegon = new Academic();
        ianRegon.firstName = "Ian";
        ianRegon.lastName = "Regon";
        ianRegon.empID = 2;
        
        System.out.println("My first Employee information");
        johnSmith.displaySummary();
        johnSmith.addSkills (", Web Devlopment ");
        System.out.println("Skills : " +johnSmith.skills);
        johnSmith.salary = 85000;
        johnSmith.payRise();
        System.out.println("New salary " +johnSmith.salary);
        
        
        System.out.println("My second Employee information");
        ianRegon.displaySummary();
        
        
        
    }
    
}
