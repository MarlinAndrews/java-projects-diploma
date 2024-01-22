/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academictester;

/**
 *
 * @author marli
 */
public class EncapsulatedAcademic {
    private String firstName;
    private String lastName;
    public String getFirstName(){
        return firstName; // return for retrieving information
    }
    // Mutator Method to store String in Private firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName; // "this." prepares firstName in this instance for the incoming perameter
    }
    //Accessor method retrieving data from private lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
// public class EncapsulateAcademicTester {
        // public static void main (String[] args) {
//         EncapsulatedAcademic johnSmith = new EncapsulatedAcademic();
//         johnSmith.setFirstName ("John"); // stores data with method instead of field (mutator method)
