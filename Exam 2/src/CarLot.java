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

    public CarLot(ArrayList<Car> cars)
    {
        cars= new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(new Car(car.getMake(),car.getModel(),car.getMileage(),car.getPrice()));
    }

    public double getInventoryValue()
    {
        return -1;
    }

    public ArrayList<Car> getCarsByBrand(String manufacturer)
    {
        return null;
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
