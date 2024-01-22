/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;


import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author marli
 */

public class CarAndBookingDates {
    // Instance variables
    private int year;
    private int month;
    private int day;

    // Constructor
    public CarAndBookingDates() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    // Method to prompt user for a car ID
    public int carSelection(int carsAvailable) {
        Scanner scanner = new Scanner(System.in);
        int carId; //stores user input

        while (true) {
            System.out.println("Enter a car ID to make a booking:");
            carId = scanner.nextInt();

            if (carId > 0 && carId <= carsAvailable) {
                System.out.println("Car ID selected: " + carId);
                return carId;
            } else {
                System.out.println("Invalid car ID. Please enter a valid ID.");
            }
            return carId;
        }
        
    }

    // Method to get startDate
    public LocalDate getCarBookingDateStart() {
        System.out.println("\nEnter booking start date.");
        this.year = promptForYear();
        this.month = promptForMonth();
        this.day = promptForDay();

        return LocalDate.of(year, month, day);
        
    }
    // method to get endDate
    public LocalDate getCarBookingDateEnd() {
        System.out.println("\nEnter booking end date.");
        this.year = promptForYear();
        this.month = promptForMonth();
        this.day = promptForDay();

        return LocalDate.of(year, month, day);
        
    }

    // Method to prompt user for the year and validates input format
   public int promptForYear() {
        Scanner scanner = new Scanner(System.in);
        String year;

        while (true) {
            System.out.println("Enter the year of booking:");
            year = scanner.next();

            if (validateYearString(year)) {
                return Integer.parseInt(year);
            } else {
                System.out.println("Invalid year. Please enter a valid year.");
            }
        }
    }
   // promot for month and validates input format
    public int promptForMonth() {
        Scanner scanner = new Scanner(System.in);
        String month;

        while (true) {
            System.out.println("Enter the month of booking:");
            month = scanner.next();

            if (validateMonthString(month)) {
                return Integer.parseInt(month);
            } else {
                System.out.println("Invalid month. Please enter a valid month.");
            }
        }
    }

    public int promptForDay() { //prompt for day validates input format
        Scanner scanner = new Scanner(System.in);
        String day;

        while (true) {
            System.out.println("Enter the day of booking:");
            day = scanner.next();

            if (validateDayString(day)) {
                return Integer.parseInt(day);
            } else {
                System.out.println("Invalid day. Please enter a valid day.");
            }
        }
    }

    public boolean validateYearString(String year) { // prevents years previous 
        try {
            int yearInt = Integer.parseInt(year);
            return yearInt >= LocalDate.now().getYear();
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validateMonthString(String month) { // months 1-12 accepted
        try {
            int monthInt = Integer.parseInt(month);
            return monthInt >= 1 && monthInt <= 12;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validateDayString(String day) { // no month has longer than 31 days
        try {
            int dayInt = Integer.parseInt(day);
            return dayInt >= 1 && dayInt <= 31;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}



