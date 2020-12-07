import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorbikeTest extends Car {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Motorbike bike = new Motorbike("0", road);

    @Test
    void testGetLength() {
        assertEquals(0.5, bike.getLength());
    }

    @Test
    void testGetId() {
        assertEquals("0", bike.getId());
    }

    @Test
    void testGetSpeed() {
        assertEquals(0, bike.getSpeed());
    }

    @Test
    void testGetPosition() {
        assertEquals(0, bike.getPosition());
    }
}