/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromegame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author marli
 */
public class PalindromeGame {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args)throws FileNotFoundException {
        
       // (1) Print a greeting. (java.lang.System)
        System.out.println("Welcome to the Palindrome Games");
         
        // (2) Check that the file can be opened. (java.io.File)
        File file = new File ("wordlist.txt");
        String fileName = "wordlist.txt";
        Scanner scanner = new Scanner (file);
        
        if (!file.isFile()){
            System.err.println(" Cannot open file: " + fileName);
        }
        else {
            System.out.println("Succesfully opened file: " + fileName);
        }
       
        // (3) Process one line at a time as long as lines remain. (java.util.Scanner)
         //Need a loop to process a line at a time.
         while (scanner.hasNextLine()) {
             String line = scanner.nextLine();
             
             boolean isPalindrome = true;
             for (int i= 0; i < line.length(); i ++) {
                 if (line.charAt(i) != line.charAt(line.length() - 1 - i)){
                     isPalindrome = false;
                     break;
             }
         }
            if (isPalindrome) {
                System.out.println(line + " is a palindrome.");
            } else {
                System.out.println(line +" is not a palindrome");
            }
         }

        
        // (5) Convert the solution into a method
        
        // (6) Split the solution into two classes. Try to:
        //- Build your solution using static approach.
        //- Build your solution using non-static approach.

    }
    
}
