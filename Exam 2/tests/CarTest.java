import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car ford;
    private Car honda;
    private Car porsche;

    @BeforeEach
    void setUp() {
        ford = new Car("Ford","F150",7392,76345.21);
        honda = new Car("Honda","Accord",92833,18234.23);
        porsche = new Car("Porsche","911",0,192342.99);
    }

    @Test
    void setMakeConstructor() {
        assertEquals("Ford", ford.getMake());
    }

    @Test
    void setMakeFord() {
        ford.setMake("Ford");
        assertEquals("Ford", ford.getMake());
    }

    @Test
    void setMakeHonda() {
        ford.setMake("Honda");
        assertEquals("Honda", ford.getMake());
    }

    @Test
    void setMakePorsche() {
        ford.setMake("Porsche");
        assertEquals("Porsche", ford.getMake());
    }

    @Test
    void setMakeInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                ford.setMake("Jaguar"));
    }

    @Test
    void setMakeInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, ()->
                new Car("Jaguar","XKT",10000,76234.23));
    }

    @Test
    void setModelFord() {
        List<String> fordModels = Arrays.asList("F150","Escort","Explorer");
        for (String model : fordModels)
            ford.setModel(model);
        assertEquals("Explorer", ford.getModel());
    }

    @Test
    void setModelConstructor() {
        assertEquals("F150", ford.getModel());
    }

    @Test
    void setModelHonda() {
        List<String> hondaModels = Arrays.asList("Accord","Civic","Pilot");
        for (String model : hondaModels)
            honda.setModel(model);
        assertEquals("Pilot", honda.getModel());
    }

    @Test
    void setModelPorsche() {
        List<String> porscheModels = Arrays.asList("911","Cayman","718 Boxster");
        for (String model : porscheModels)
            porsche.setModel(model);
        assertEquals("718 Boxster", porsche.getModel());
    }

    @Test
    void setModelInvalidFord() {
        assertThrows(IllegalArgumentException.class, ()->
                ford.setModel("Accord"));
    }

    @Test
    void setModelInvalidHonda() {
        assertThrows(IllegalArgumentException.class, ()->
                honda.setModel("F150"));
    }

    @Test
    void setModelInvalidPorsche() {
        assertThrows(IllegalArgumentException.class, ()->
                porsche.setModel("MDX"));
    }



    @Test
    void setMileage() {
        ford.setMileage(924);
        assertEquals(924, ford.getMileage());
    }

    @Test
    void setMileageConstructor() {
        assertEquals(7392, ford.getMileage());
    }

    @Test
    void setMileageInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                porsche.setMileage(-1));
    }

    @Test
    void setMileageInvalidHigh() {
        assertThrows(IllegalArgumentException.class, ()->
                porsche.setMileage(5000001));
    }

    @Test
    void setPrice() {
        ford.setPrice(87233.99);
        assertEquals(87233.99,ford.getPrice());
    }

    @Test
    void setPriceInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                porsche.setPrice(-0.01));
    }

    @Test
    void setPriceInvalidHigh() {
        assertThrows(IllegalArgumentException.class, ()->
                porsche.setPrice(2000001));
    }

    @Test
    void testToString() {
        assertEquals("Ford F150, with 7392 km - asking $76345.21",ford.toString());
    }
}