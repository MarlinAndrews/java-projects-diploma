package wordgames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The WordGames class provides functionality for word-related games.
 */
public class WordGames {

    public static final String DICTIONARY = "dictionary.txt";
    static int menuSelection;

    public static void main(String[] args) throws FileNotFoundException {
        // Display the menu and handle user input
        do {
            menuSelection = getSelection();
            switch (menuSelection) {
                case 1:
                    // Call the appropriate method for option 1
                    substringProblem();
                    break;
                case 2:
                    // Call the appropriate method for option 2
                    pointsProblem();
                    break;
                case 3:
                    // Do what is necessary for option 3
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (menuSelection != 3); // Continue until option 3 (Exit) is chosen
    }

    
    public static int getSelection() {
        // Display the menu options and get user input
        System.out.println("Welcome to the Word Games program menu");
        System.out.println("Select from one of the following options.\n"
                + "1. Substring problem.\n"
                + "2. Points problem.\n"
                + "3. Exit");
        Scanner keyboard = new Scanner(System.in);// initialize scanner class object
        int menuSelection = 0; 
        boolean validInput = false;

        while (!validInput) { //prompts user for valid input
            System.out.print("Enter your selection: ");
            try {
                menuSelection = keyboard.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid option. Try again.");
                keyboard.nextLine(); // clear input buffer to avoid leak
            }
        }

        return menuSelection;
    }

    
    public static void substringProblem() throws FileNotFoundException {
        // Prompt the user for input
        System.out.println("Substring problem");
        System.out.println("Enter a substring: ");
        Scanner subKeyboard = new Scanner(System.in);
        String subSelection = subKeyboard.next().toLowerCase(); 
        // Stores the user's substring input and ensures lowercase
        

        // Read dictionary.txt 
        FileInputStream fStream = new FileInputStream(DICTIONARY); //opens file
        Scanner fileIn = new Scanner(fStream); //reads file

        // Iterate over each word in the dictionary
        while (fileIn.hasNextLine()) {
            String word = fileIn.nextLine();

            // Check if the substring is a prefix, infix, and suffix of the word
            boolean isPrefix = word.startsWith(subSelection);
            boolean isInfix = word.contains(subSelection) && !isPrefix; // check variation
            boolean isSuffix = word.endsWith(subSelection) && !isInfix; // check variation

            // Print the result for the word based on the substring positions
            if (isPrefix && isInfix && isSuffix) {
                System.out.println(word + " - prefix - infix - suffix");
            } else if (isPrefix && isInfix) {
                System.out.println(word + " - prefix - infix");
            } else if (isInfix && isSuffix) {
                System.out.println(word + " - infix - suffix");
            } else if (isPrefix) {
                System.out.println(word + " - prefix");
            } else if (isInfix) {
                System.out.println(word + " - infix");
            } else if (isSuffix) {
                System.out.println(word + " - suffix");
            } else {
                System.out.println(word + " - not found");
            }
        }

        fileIn.close();
    }

    public static void pointsProblem() throws FileNotFoundException {
        // Print the heading for the points problem
        System.out.println("Points Problem");

        // Read the dictionary file
        FileInputStream fStream = new FileInputStream(DICTIONARY);
        Scanner fileIn = new Scanner(fStream);

        // Iterate over each word in the dictionary
        while (fileIn.hasNextLine()) {
            String word = fileIn.nextLine();
            int points = 0;
            word = word.toLowerCase(); // Convert the word to lowercase for case-insensitive matching

            // Calculate the number of points for each word based on the letters
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);

                switch (letter) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'l':
                    case 'n':
                    case 'o':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                        points += 1;
                        break;
                    case 'd':
                    case 'g':
                        points += 2;
                        break;
                    case 'b':
                    case 'c':
                    case 'm':
                    case 'p':
                        points += 3;
                        break;
                    case 'f':
                    case 'h':
                    case 'v':
                    case 'w':
                    case 'y':
                        points += 4;
                        break;
                    case 'k':
                        points += 5;
                        break;
                    case 'j':
                    case 'x':
                        points += 8;
                        break;
                    case 'q':
                    case 'z':
                        points += 10;
                        break;
                }
            }

            System.out.println(word + " is worth " + points + " points.");
        }

        fileIn.close();
    }
}
