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

    /**
     * Method that ensures the car make is Ford, Honda, or Porsche.
     * @param make
     */
    public void setMake(String make)
    {
        if(make.equals("Ford") || make.equals("Honda") || make.equals("Porsche"))
        {
            this.make=make;
        }
        else
            throw new IllegalArgumentException("Car make must be one of the following: Ford, Honda, Porsche.");
    }

    public void setModel(String model)
    {
        if(make.equals("Ford"))
        {
            if(model.equals("F150") || model.equals("Escort") || model.equals("Explorer"))
            {
                this.model=model;
            }
            else
                throw new IllegalArgumentException("Car model must be one of the following: F150, Escort, Explorer.");
        }
        else if(make.equals("Honda"))
        {
            if(model.equals("Accord") || model.equals("Civic") || model.equals("Pilot"))
            {
                this.model=model;
            }
            else
                throw new IllegalArgumentException("Car model must be one of the following: Accord, Civic, Pilot.");
        }
        else if(make.equals("Porsche"))
        {
            if(model.equals("911") || model.equals("Cayman") || model.equals("718 Boxster"))
            {
                this.model=model;
            }
            else
                throw new IllegalArgumentException("Car model must be one of the following: 911, Cayman, 718 Boxster.");
        }
    }

    public void setMileage(int mileage)
    {
        if(mileage>=0 && mileage<=5000000)
        {
            this.mileage=mileage;
        }
        else
            throw new IllegalArgumentException("Car mileage must be in the range of 0 to 5,000,000.");
    }

    public void setPrice(double price)
    {
        if(price>=0 && price<=2000000)
        {
            this.price=price;
        }
        else
            throw new IllegalArgumentException("Car price must be in the range of 0 to 2,000,000.");
    }

    public String toString()
    {
        return "";
    }
}
