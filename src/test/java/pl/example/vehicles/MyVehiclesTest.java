package pl.example.vehicles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyVehiclesTest {

    @Test
    public void testCar() {
        Car car = new Car("Sedan", 5);
        assertEquals(200, car.getMaxSpeed(), "Maksymalna prędkość powinna wynosić 200");
        assertEquals(5, car.getDoors(), "Liczba drzwi powinna wynosić 5");
        assertEquals("Sedan", car.getName(), "Nazwa powinna być 'Sedan'");
    }

    @Test
    public void testBike() {
        Bike bike = new Bike("Mountain Bike");
        assertEquals(50, bike.getMaxSpeed(), "Maksymalna prędkość Bike powinna wynosić 50");
        assertEquals("Mountain Bike", bike.getName(), "Nazwa powinna być 'Mountain Bike'");
    }
}
