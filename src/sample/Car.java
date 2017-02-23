package sample;

import java.time.LocalDate;
import java.util.InputMismatchException;

/**
 * Created by Nikita on 2/23/17.
 */
public class Car {

    private String make, model, features;
    private int mileage, year;
    private double price;

    /**
     * Car constructor Order of arguments: make, model, year, mileage, price,
     * features
     */
    public Car(String make, String model, int year, int mileage, double price, String features) {
        this.make = make;
        this.model = model;
        setYear(year);
        setMileage(mileage);
        setPrice(price);
        this.features = features;
    }

    @Override
    public String toString() {
        return make + " " + model + ", " + year + " year, " + mileage + " miles, " + price + " usd, " + features;
    }

    protected void setYear(int year) {
        if (year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year cannot be higher than current year");
        } else if (year < 1800) {
            throw new IllegalArgumentException("Year cannot be less than 1800 (cars did not exist back then)");
        } else {
            this.year = year;
        }
    }

    protected void setMileage(int mileage) {
        if (mileage > 0) {
            this.mileage = mileage;
        } else {
            throw new IllegalArgumentException("Price should be greater than 0");
        }
    }

    protected void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price should be greater than 0");
        }
    }

    public void updateCar(String make, String model, int year, int mileage, double price, String features) {
        this.make = make;
        this.model = model;
        setYear(year);
        setMileage(mileage);
        setPrice(price);
        this.features = features;
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

    public int getYear() {
        return year;
    }
}
