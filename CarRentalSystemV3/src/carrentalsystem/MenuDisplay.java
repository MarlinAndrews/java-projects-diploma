package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author marli
 */

public class MenuDisplay {
    private String[][] cars; // stores car details
    private int numCars; //stores number of cars

    public MenuDisplay() {
        readCarsFromFile();
    }

    private void readCarsFromFile() { // read car data from CSV file
        String csvFile = "C:\\Users\\marli\\OneDrive\\Documents\\NetBeansProjects\\CarRentalSystem_3\\src\\carrentalsystem\\CarList.csv";
        String line; // store each line
        String cvsSplitBy = ","; // delimiter 
        numCars = 0; 

        try {
            //get number of cars
            Scanner scanner = new Scanner(new File(csvFile));
            while (scanner.hasNextLine()) { // loop whilst there are lines in file
                scanner.nextLine(); //reads next line
                numCars++; // increment car 
            }
            scanner.close();

            // Initialize cars array
            cars = new String[numCars][5];  // rows and columns index 4 x 5

            // store cars into array
            scanner = new Scanner(new File(csvFile));
            int i = 0;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine(); // stores line
                cars[i] = line.split(cvsSplitBy); // splits line into array of strings
                i++;
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to read file");
        }
    }

    public int displayCarList() {
        System.out.println("**********************************************************************");
        System.out.println("\t\tWelcome to the Carrington Car Rental");
        System.out.println("**********************************************************************\n");
        System.out.println("Cars available for booking:");
        System.out.printf("%-3s %-15s %-10s %-15s %-10s %s \n", "No", "Car Name", "Seats", "Transmission", "Type", "Rate/Day($)");

        for (int i = 0; i < numCars; i++) {
            System.out.printf("%-3s %-15s %-10s %-15s %-10s %s \n", (i + 1) + ". ", cars[i][1], cars[i][2], cars[i][3], cars[i][4], cars[i][5]); // prints each line and respective array
        }
        System.out.println("\nTotal "+ numCars + " cars available.");
        System.out.println("\n** For Premium cars an additional 5% insurance fee is applied to the car rate**");
        System.out.println("\n**********************************************************************");
        return numCars; // to be passed
    }

    public int getSelection() {
        int userSelect;
        Scanner scanner = new Scanner(System.in);

        while (true) { //  loop until a valid option is selected
            System.out.println("Select from one of the following options");
            System.out.println("1. To make a booking");
            System.out.println("2. To exit the system");

            userSelect = scanner.nextInt();

            switch(userSelect) {
                case 1:
                    System.out.println("You have chosen to make a booking");
                    return userSelect;
                case 2:
                    System.out.println("You have chosen to exit the system");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
