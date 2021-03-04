/** Class CarLot blueprint: for CarLot objects, contains: Car ArrayList
 * Exam 2
 * Author: Jennifer Mendez, Student Number: 200454895
 *Date: 04/March/2021
 *Time: 10:00 am
 */


import java.util.ArrayList;

public class CarLot
{
    private ArrayList<Car> cars;

    public CarLot()
    {
        cars= new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(new Car(car.getMake(),car.getModel(),car.getMileage(),car.getPrice()));
    }

    public double getInventoryValue()
    {
        double carInventoryValue=0;
        for(Car car:cars)
        {
            carInventoryValue=carInventoryValue + car.getPrice();

        }
        return carInventoryValue;
    }

    public ArrayList<Car> getCarsByBrand(String manufacturer)
    {
        ArrayList<Car> ford= new ArrayList<>();
        ArrayList<Car> honda= new ArrayList<>();
        ArrayList<Car> porsche= new ArrayList<>();
        ArrayList<Car> others= new ArrayList<>();
        for(Car car:cars)
        {
            if (manufacturer.equals("Ford"))
            {
                ford.add(car);
                return ford;
            }
            else if (manufacturer.equals("Honda"))
            {
                honda.add(car);
                return honda;
            }
            else if (manufacturer.equals("Porsche"))
            {
                porsche.add(car);
                return porsche;
            }
        }
        return others;

    }

    public ArrayList<Car> getCarsByModel(String model)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowPrice(double maxPrice)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowMileage(double maxkm)
    {
        return null;
    }

    public int getNumOfCarsUnderPrice(double maxPrice)
    {
        return -1;
    }

    public double getAvgPrice()
    {
        return -1;
    }

    public int getNumOfCarsInInventory()
    {
        return -1;
    }

    public String toString()
    {
        return "";
    }
}
