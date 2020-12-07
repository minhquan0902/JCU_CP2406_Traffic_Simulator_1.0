import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest extends Car {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    TrafficLight light = new TrafficLight("0", road);
    @Test
    void testGetId() {
        assertEquals("0", light.getId());
    }

    @Test
    void getState() {
        assertEquals("RED", light.getState());
    }

    @Test
    void testGetPosition() {
        int[] expected = {5,0};
        assertArrayEquals(expected, light.getPosition());
    }

    @Test
    void getRoadBelongTo() {
        assertEquals(road, light.getRoadBelongTo());
    }

    @Test
    void operate() {
        light.operate();
        assertEquals("RED", light.getState());
    }
}