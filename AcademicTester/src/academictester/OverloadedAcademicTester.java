/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academictester;

/**
 *
 * @author marli
 */
public class OverloadedAcademicTester {

    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        OverloadedAcademic johnSmith = new OverloadedAcademic();
        johnSmith.setSalary(85000);
        
        johnSmith.payRise();// nominate pay rise
        System.out.print("The new salary is: " );
        System.out.println(johnSmith.getSalary());
        
        johnSmith.payRise(5000); // supplied in argument
        System.out.print ("The new salary is: ");
        System.out.println(johnSmith.getSalary());
        
    }
    
}
