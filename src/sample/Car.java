package sample;

import java.time.LocalDate;
import java.util.InputMismatchException;

/**
 * Created by Nikita on 2/23/17.
 */
public class Car {

    private String make, model, features;
    private int mileage;
    private double price;
    private LocalDate year;

    /**
     * Car constructor
     * Order of arguments: make, model, year, mileage, price, features
     */
    public Car(String make, String model, LocalDate year, int mileage, double price, String features){
        this.make = make;
        this.model = model;
        setYear(year);
        setMileage(mileage);
        setPrice(price);
        this.features = features;
    }

    @Override
    public String toString(){
        return make + " " + model + " " + year + " Car milage: " + mileage + "; Price: " + price + "; Features: " + features;
    }

    private void setYear(LocalDate year){
        if(year.getYear() > LocalDate.now().getYear()){
            throw new IllegalArgumentException("The year cannot be bigger than current year");
        } else {
            if(year.getYear() < 1800){
                throw new IllegalArgumentException("This car is too old! Should be made later than year 1800");
            } else {
                this.year = year;
            }
        }
    }

    private void setMileage(int mileage){
        try {
            if (mileage < 0) {
                this.mileage = mileage;
            }
        } catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

    private void setPrice(double price){
        try {
            if (price < 0) {
                this.price = price;
            }
        } catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * GETTERS AND SETTERS
     */

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getYear() {
        return year;
    }
}
