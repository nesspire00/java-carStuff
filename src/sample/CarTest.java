/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.InputMismatchException;

import sample.Car;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dasha
 */
public class CarTest {

    Car car;

    public CarTest() {
    }

    @BeforeClass
    public static void setUpClass() {
      
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        car = new Car("Mitsubishi", "Lancer", 2008, 1000, 300000.00, "cool, fast, strong");

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testInvalidCar() {
        System.out.println("Test creation of invalid Car");
        try {
            Car invalidCar = new Car("Chevrolet", "Lachetti", 1558, 1100, 40000.00, "cool, fast, strong");
            fail("the invalid year should throw an exeption");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        String expResult = "Mitsubishi";
        String result = car.getMake();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        String expResult = "Lancer";
        String result = car.getModel();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYear() {
        System.out.println("getYear");
        int expResult = 2008;
        int result = car.getYear();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetMileage() {
        System.out.println("getMileage");
        int expResult = 1000;
        int result = car.getMileage();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 300000.00;
        double result = car.getPrice();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testGetFeatures() {
        System.out.println("getFeatures");
        String expResult = "cool, fast, strong";
        String result = car.getFeatures();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetYearInvalid() {
        System.out.println("setYear");
        int year = 1111;
        try
        {
            car.setYear(year);
            fail("setYear should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             
        }
    }

    @Test
    public void testSetYearBiggerInvalid() {
        System.out.println("setYear");
        int year = 2020;
        try
        {
            car.setYear(year);
            fail("setYear should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {

        }
    }
    
    @Test
    public void testSetMileageInvalid() {
        System.out.println("setMileage");
        int millage = -5;
        try
        {
            car.setMileage(millage);
            fail("setMileage should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             
        }
    }
    
    @Test
    public void testSetPriceInvalid() {
        System.out.println("setPrice");
        double price = 0;
        try
        {
            car.setPrice(price);
            fail("setPrice should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
             
        }
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Mitsubishi Lancer, 2008 year, 1000 miles, 300000.0 usd, cool, fast, strong";
        String result = car.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testUpdateCar() {
        String make = "BMW";
        String model = "x5";
        int year = 2013;
        int mileage = 15;
        double price = 1500000.00;
        String features = "really cool!!!";
        car.updateCar(make, model, year, mileage, price, features);
        assertEquals(car.toString(), "BMW x5, 2013 year, 15 miles, 1500000.0 usd, really cool!!!");
    }
    
    @Test
    public void testSetMake() {
        String make = "BMW";
        car.setMake(make);
        assertEquals(make, car.getMake());
    }
    
    @Test
    public void testSetModel() {
        String model = "x5";
        car.setModel(model);
        assertEquals(model, car.getModel());
    }
    
    @Test
    public void testSetYear() {
        int year = 2013;
        car.setYear(year);
        assertEquals(year, car.getYear());
    }
    @Test
    public void testSetMileage() {
        int mileage = 15;
        car.setMileage(mileage);
        assertEquals(mileage, car.getMileage());
    }
    @Test
    public void testSetPrice() {
        double price = 150000.33;
        car.setPrice(price);
        assertEquals(price, car.getPrice(), 0);
    }
    
    @Test
    public void testSetFeatures() {
        String features = "kool";
        car.setFeatures(features);
        assertEquals(features, car.getFeatures());
    }
}
