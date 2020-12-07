
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Car car = new Car("0", road);

    @Test
    void getLength() {
        assertEquals(1, car.getLength());
    }

    @Test
    void getBreadth() {
        assertEquals(0.5, car.getBreadth());
    }

    @Test
    void getId() {
        assertEquals("0", car.getId());
    }

    //
    @Test
    void getSpeed() {
        assertEquals(0, car.getSpeed());
    }

    //
    @Test
    void getPosition() {
        assertEquals(0, car.getPosition());
    }

    //
    @Test
    void getCurrentRoad() {
        assertEquals(road, car.getCurrentRoad());
    }

    //
    @Test
    void move() {
        car.move();
        assertEquals(1, car.getPosition());
    }
}