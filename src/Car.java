import java.util.Scanner;

/**
 * Created by fhani on 7/17/2017.
 */
public class Car {
    Scanner scnr = new Scanner(System.in);
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(){
    }
    //blank constructor

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    } //constructor with 4 arguments

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car: " + "make= " + make + '\'' + " model= " +
                model + '\'' + " year= " + year + " price= " + price;
    }

}
