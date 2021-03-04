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
        ArrayList<Car> fordBrand= new ArrayList<>();
        ArrayList<Car> hondaBrand= new ArrayList<>();
        ArrayList<Car> porscheBrand= new ArrayList<>();
        ArrayList<Car> othersBrand= new ArrayList<>();
        for(Car car:cars)
        {
            if (manufacturer.equals("Ford"))
            {
                fordBrand.add(car);
                return fordBrand;
            }
            else if (manufacturer.equals("Honda"))
            {
                hondaBrand.add(car);
                return hondaBrand;
            }
            else if (manufacturer.equals("Porsche"))
            {
                porscheBrand.add(car);
                return porscheBrand;
            }
        }
        return othersBrand;

    }

    public ArrayList<Car> getCarsByModel(String model)
    {
        ArrayList<Car> fordModel= new ArrayList<>();
        ArrayList<Car> hondaModel= new ArrayList<>();
        ArrayList<Car> porscheModel= new ArrayList<>();
        ArrayList<Car> othersModel= new ArrayList<>();
        for(Car car:cars)
        {
            if (model.equals("Ford"))
            {
                fordModel.add(car);
                return fordModel;
            }
            else if (model.equals("Honda"))
            {
                hondaModel.add(car);
                return hondaModel;
            }
            else if (model.equals("Porsche"))
            {
                porscheModel.add(car);
                return porscheModel;
            }
        }
        return othersModel;
    }

    public ArrayList<Car> getCarsBelowPrice(double maxPrice)
    {
        ArrayList<Car> belowPrice= new ArrayList<>();
        ArrayList<Car> othersPrice= new ArrayList<>();
        for(Car car:cars)
        {
            if (car.getPrice()<=maxPrice)
            {
                belowPrice.add(car);
                return belowPrice;
            }
        }
        return othersPrice;
    }

    public ArrayList<Car> getCarsBelowMileage(double maxkm)
    {
        ArrayList<Car> belowMileage= new ArrayList<>();
        ArrayList<Car> othersMileage= new ArrayList<>();
        for(Car car:cars)
        {
            if (car.getMileage()<=maxkm)
            {
                belowMileage.add(car);
                return belowMileage;
            }
        }
        return othersMileage;
    }

    public int getNumOfCarsUnderPrice(double maxPrice)
    {
        ArrayList<Car> belowPrice= new ArrayList<>();
        ArrayList<Car> othersPrice= new ArrayList<>();
        for(Car car:cars)
        {
            if (car.getPrice()<=maxPrice)
            {
                belowPrice.add(car);
                return belowPrice.size();
            }
        }
        return othersPrice.size();
    }

    public double getAvgPrice()
    {
        double carInventoryValue=0;
        for(Car car:cars)
        {
            carInventoryValue=carInventoryValue + car.getPrice();

        }
        if (cars.size()>0)
            return carInventoryValue/cars.size();
        else
            return 0;
    }

    public int getNumOfCarsInInventory()
    {
        return cars.size();
    }

    public String toString()
    {
        double carInventoryValue=0;
        for(Car car:cars)
        {
            carInventoryValue=carInventoryValue + car.getPrice();

        }
        return String.format("We have %d cars worth $%.2f",cars.size(),carInventoryValue);
    }
}
