/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.time.LocalDate;

/**
 *
 * @author marli
 */
//this class displays details of a finalised booking to the user
public class PrintBookingDetails {
    
    //display details of booking to user
    public PrintBookingDetails(CarBooking carBooking, Customer customer){
        String cName = customer.getCustomerName();
        String cEmail = customer.getCustomerEmail();
        String cAddress = customer.getCustomerAddress();
        
        String cCar = carBooking.getCar().toString();
        LocalDate cStart = carBooking.getStartDate(); // get start date
        LocalDate cEnd = carBooking.getEndDate(); // get end date
        Long cTotalDays = carBooking.getTotalDays(); // get total days
        double cRate = carBooking.getRate(); // get rate per day 
        double cCost = carBooking.getCost(); // get total cost
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Thank you for booking "+ cName);
        System.out.println("Email: "+cEmail);
        System.out.println("Address "+cAddress);
        System.out.println("\n\n\n Booking Confirmed"
                + "\n Here's your booking summary"
                + "\n -------------------------------------------------");
        System.out.println("Car Select: " + cCar); // print car
        System.out.println("Start date: " + cStart); // print start date
        System.out.println("End date:  " + cEnd); // print end date
        System.out.println("Total days: " + cTotalDays); // get total days
        System.out.println("Car Rate per day: " +cRate ); // get rate per day
        System.out.println("Total cost " + cCost); // get total cost
                
    }
}
