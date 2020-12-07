import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest extends Car {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Road nextRoad = new Road("0", 1, 5, new int[]{6, 0});
    TrafficLight light = new TrafficLight("0", road);
    GasStation gas = new GasStation("0", road);
    Car car = new Car("0", road);

    @Test
    void testGetId() {
        assertEquals("0", gas.getId());
    }

    @Test
    void testGetPosition() {
        int[] expected = {5, 0};
        assertArrayEquals(expected, gas.getPosition());
    }

    @Test
    void getRoadLocatedOn() {
        assertEquals(road, gas.getRoadLocatedOn());
    }

    @Test
    void reFillGas() {
        car.getCurrentRoad().getGasStationList().add(gas);
        car.setGasLevel(0);
        int gasLevel = car.getCurrentRoad().getGasStationList().get(0).reFillGas(0, nextRoad);
        assertEquals(5, gasLevel);
    }
}