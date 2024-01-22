/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/**
 *
 * @author marli
 */

public class CarBooking {
    // Instance variables
    private LocalDate startDate;
    private LocalDate endDate;
    private int carNumber; // ID number of car
    private long totalDays;
    private double newRate; //daily rate of booking
    private double cost; //total cost
    private Car car;

    // Constructor
    public CarBooking(LocalDate startDate, LocalDate endDate, int carNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.carNumber = carNumber;
       
       
    }
    
    public void makeBooking() {
        String csvFile = "C:\\Users\\marli\\OneDrive\\Documents\\NetBeansProjects\\CarRentalSystem_3\\src\\carrentalsystem\\CarList.csv"; //read file
        String cvsSplitBy = ","; // split file "." 
        
        try {
            Scanner scanner = new Scanner(new File(csvFile));
            while (scanner.hasNextLine()) {
                String[] carDetails = scanner.nextLine().split(cvsSplitBy); 
                if (Integer.parseInt(carDetails[0]) == carNumber) { // check carNumber matches coloumn 1
            if(carDetails[4].equals("Premium")) { // Check if the car is premium
                car = new PremiumCar(carDetails[1], Double.parseDouble(carDetails[5])); //premium car created
            } else {
                car = new Car(carDetails[1], Double.parseDouble(carDetails[5])); // car created
            }
            newRate = car.getCarRate(); // 
            break;
        }
    }
    scanner.close();
} catch (FileNotFoundException e) {
    System.out.println("File not found");
}

        calculateTotalDays(); //helper used
        calculateCost(newRate, totalDays); // helper used
    }

    // Method to calculate the difference in days between the start date and the end date of the booking
    public void calculateTotalDays() {
        this.totalDays = ChronoUnit.DAYS.between(startDate, endDate);
    }

    // Method to calculate cost of the booking based on the rate by the number of days
    public void calculateCost(double newRate, long totalDays) {
        this.cost = newRate * totalDays;
    }

    // Getters
    public LocalDate getStartDate() { return this.startDate; }
    public LocalDate getEndDate() { return this.endDate; }
    public long getTotalDays() { return this.totalDays; }
    public int getCarNumber() { return this.carNumber; }
    public double getRate() { return this.newRate; }
    public double getCost() { return this.cost; }
    public Car getCar() { return this.car; }
} 
