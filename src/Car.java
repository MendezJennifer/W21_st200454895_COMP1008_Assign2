/** Class Car blueprint: for Car objects, contains: make,model,mileage,price
 * Exam 2
 * Author: Jennifer Mendez, Student Number: 200454895
 *Date: 04/March/2021
 *Time: 10:00 am
 */

import java.util.Arrays;
import java.util.List;

public class Car {
    private String make, model;
    private int mileage;
    private double price;

    public Car(String make, String model, int mileage, double price)
    {
        setMake(make);
        setModel(model);
        setMileage(mileage);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
    }

    public void setModel(String model) {
    }

    public void setMileage(int mileage) {
    }

    public void setPrice(double price) {
    }

    public String toString()
    {
        return "";
    }
}
