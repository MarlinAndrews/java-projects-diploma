/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalsystem;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author marli
 */
public class CarRentalTester {
   public static String customerName;
   public static  String customerEmail;
   public static String customerAddress;
    
    public static void main(String[] args) {
        
        MenuDisplay menu = new MenuDisplay(); //instance created
        int numCars = menu.displayCarList(); // get number of cars available and store in numCars
        menu.getSelection(); // get selection

        CarAndBookingDates carAndBookingDates = new CarAndBookingDates(); // instance created
       int carId = carAndBookingDates.carSelection(numCars); // get carSelection and pass numCars as argument
        
        LocalDate startDate = carAndBookingDates.getCarBookingDateStart(); // get booking start date (year, month, day) and store in bookingDate
        LocalDate endDate =carAndBookingDates.getCarBookingDateEnd();  // get booking end date (year, month, day) and store in bookingDate
        
        CarBooking carBooking = new CarBooking(startDate, endDate,carId); // create carBooking 

        carBooking.makeBooking(); // calculate booking
       
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner (System.in);
        customerName = scanner.nextLine();
        System.out.println("Enter your Email: ");
        customerEmail = scanner.nextLine();
        System.out.println("Enter your residential address: ");
        customerAddress = scanner.nextLine();
        Customer customer = new Customer(customerName, customerEmail,customerAddress); //create customer 
        PrintBookingDetails print = new PrintBookingDetails(carBooking, customer);  // print details
        
        
    }
}
