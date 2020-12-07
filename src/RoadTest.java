import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoadTest extends Car {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    @Test
    void testGetId() {
        assertEquals("0", road.getId());
    }

    @Test
    void getSpeedLimit() {
        assertEquals(1, road.getSpeedLimit());
    }

    @Test
    void testGetLength() {
        assertEquals(5, road.getLength());
    }

    @Test
    void getStartLocation() {
        int[] expected = {0,0};
        assertArrayEquals(expected, road.getStartLocation());
    }

    @Test
    void getEndLocation() {
        int[] expected = {5,0};
        assertArrayEquals(expected, road.getEndLocation());
    }

    @Test
    void getConnectedRoads() {
        ArrayList<Road> expected = new ArrayList<>();
        assertEquals(expected, road.getConnectedRoads());
    }

    @Test
    void getCarsOnRoad() {
        ArrayList<Car> expected = new ArrayList<>();
        assertEquals(expected, road.getCarsOnRoad());
    }

    @Test
    void getLigthsOnRoad() {
        ArrayList<TrafficLight> expected = new ArrayList<>();
        assertEquals(expected, road.getLigthsOnRoad());
    }
}
