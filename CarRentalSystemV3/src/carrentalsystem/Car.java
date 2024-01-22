/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author marli
 */

//this class holds information related to individual cars that are available for hire

// Car class
public class Car {
    //instance variables
    private double carRate;
    private String carName; 

    // Constructor
    public Car(String carName, double carRate) {
        this.carName = carName;
        this.carRate = carRate;
    }

    // Getters
    public double getCarRate() {
        return this.carRate;
    }

    public String getCarName() {
        return this.carName;
    }
    
@Override
public String toString() {
    return "Car Name: " + this.getCarName();
}
    
}

// PremiumCar class extending Car
 class PremiumCar extends Car {
     
    public final double INSURANCERATE = 0.05;  // Premium car extended +5%

    // Constructor
    public PremiumCar(String carName, double carRate) {
        super(carName, carRate);  // Adding insurance cost to the rate
    }

    // Overriding the getCarRate method to include the insurance cost
    @Override
    public double getCarRate() {
        return super.getCarRate() * (1 + INSURANCERATE); // = 105% of original
    }
    @Override
    public String toString() {
    return "Car Name: " + this.getCarName();
}
    
}
