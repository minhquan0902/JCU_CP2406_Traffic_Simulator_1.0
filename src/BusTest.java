import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest extends Car {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Bus bus = new Bus("0", road);

    @Test
    void testGetLength() {
        assertEquals(3, bus.getLength());
    }

    @Test
    void testGetId() {
        assertEquals("0", bus.getId());
    }

    @Test
    void testGetSpeed() {
        assertEquals(0, bus.getSpeed());
    }

    @Test
    void testInheritance() {
        assertEquals(0, bus.getSpeed());
        assertEquals(0, bus.getPosition());
    }
}