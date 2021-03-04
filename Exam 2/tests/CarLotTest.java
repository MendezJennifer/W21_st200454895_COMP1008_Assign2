import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CarLotTest {
    private Car ford;
    private Car honda;
    private Car porsche;
    private Car porsche2;
    private Car porsche3;
    private Car porsche4;
    private CarLot carLot;

    @BeforeEach
    void setUp() {
        ford = new Car("Ford","F150",7392,76345.21);
        honda = new Car("Honda","Accord",92833,18234.23);
        porsche = new Car("Porsche","911",0,192342.99);
        porsche2 = new Car("Porsche","Cayman",10230,86342.75);
        porsche3 = new Car("Porsche","718 Boxster",1231,92342.94);
        porsche4 = new Car("Porsche","718 Boxster",29231,61342.00);
        carLot = new CarLot();
        carLot.addCar(ford);
        carLot.addCar(honda);
        carLot.addCar(porsche);
        carLot.addCar(porsche2);
        carLot.addCar(porsche3);
        carLot.addCar(porsche4);
    }

    @Test
    void getInventoryValue() {
        assertEquals(526950.12,carLot.getInventoryValue(),0.001);
    }

    @Test
    void getInventoryValueNoCars() {
        CarLot carLot = new CarLot();
        assertEquals(0,carLot.getInventoryValue(),0.001);
    }

    @Test
    void getCarsByBrandFord() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(ford);
        assertEquals(expResult,carLot.getCarsByBrand("Ford"));
    }

    @Test
    void getCarsByBrandHonda() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(honda);
        assertEquals(expResult,carLot.getCarsByBrand("Honda"));
    }

    @Test
    void getCarsByBrandPorsche() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(porsche);
        expResult.add(porsche2);
        expResult.add(porsche3);
        expResult.add(porsche4);
        assertEquals(expResult,carLot.getCarsByBrand("Porsche"));
    }

    @Test
    void getCarsByBrandEmptyList() {
        ArrayList<Car> expResult = new ArrayList<>();
        assertEquals(expResult,carLot.getCarsByBrand("Acura"));
    }

    @Test
    void getCarsByModelFord() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(ford);
        assertEquals(expResult, carLot.getCarsByBrand("Ford"));
    }

    @Test
    void getCarsByModelPorsche() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(porsche);
        expResult.add(porsche2);
        expResult.add(porsche3);
        expResult.add(porsche4);
        assertEquals(expResult, carLot.getCarsByBrand("Porsche"));
    }

    @Test
    void getCarsByModel() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(honda);
        assertEquals(expResult,carLot.getCarsByModel("Accord"));
    }

    @Test
    void getCarsByModelEmpty() {
        ArrayList<Car> expResult = new ArrayList<>();
        assertEquals(expResult,carLot.getCarsByModel("MDX"));
    }

    @Test
    void getCarsBelowPrice() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(honda);
        assertEquals(expResult, carLot.getCarsBelowPrice(50000));
    }

    @Test
    void getCarsBelowPriceEmpty() {
        ArrayList<Car> expResult = new ArrayList<>();
        assertEquals(expResult, carLot.getCarsBelowPrice(10000));
    }

    @Test
    void getCarsBelowPriceMultiple() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(ford);
        expResult.add(honda);
        expResult.add(porsche2);
        expResult.add(porsche3);
        expResult.add(porsche4);
        assertEquals(expResult, carLot.getCarsBelowPrice(100000));
    }

    @Test
    void getCarsBelowMileageEmpty() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(ford);
        expResult.add(porsche);
        expResult.add(porsche3);
        assertEquals(expResult, carLot.getCarsBelowMileage(10000));
    }

    @Test
    void getCarsBelowMileage() {
        ArrayList<Car> expResult = new ArrayList<>();
        expResult.add(porsche);
        expResult.add(porsche3);
        assertEquals(expResult, carLot.getCarsBelowMileage(5000));
    }

    @Test
    void getNumOfCarsUnderPrice() {
        assertEquals(1, carLot.getNumOfCarsUnderPrice(40000));
    }

    @Test
    void getNumOfCarsUnderPrice0() {
        assertEquals(0, carLot.getNumOfCarsUnderPrice(10000));
    }

    @Test
    void getNumOfCarsUnderPriceMultiple() {
        assertEquals(5, carLot.getNumOfCarsUnderPrice(100000));
    }

    @Test
    void getAvgPrice() {
        assertEquals(87825.02,carLot.getAvgPrice());
    }

    @Test
    void getAvgPriceEmpty() {
        CarLot carLot = new CarLot();
        assertEquals(0,carLot.getAvgPrice());
    }

    @Test
    void getNumOfCarsInInventory() {
        assertEquals(6, carLot.getNumOfCarsInInventory());
    }

    @Test
    void getToString() {
        assertEquals("We have 6 cars worth $526950.12", carLot.toString());
    }

    @Test
    void getToStringEmpty() {
        CarLot carLot = new CarLot();
        assertEquals("We have 0 cars worth $0.00", carLot.toString());
    }
}