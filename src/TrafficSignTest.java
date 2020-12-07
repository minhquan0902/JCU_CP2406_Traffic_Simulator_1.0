import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TrafficSignTest extends  Car{
    Road road = new Road("1", 1 , 5, new int[]{0,0});
    TrafficSign trafficSign = new TrafficSign("1", road);

    @Test
    void testGetID(){
        assertEquals("1", trafficSign.getID());
    }
    @Test
    void testGetState(){
        assertEquals("STOP SIGN", trafficSign.getState());
    }
    @Test
    void testGetPosition(){
        int[] expect = {5,0};
        assertArrayEquals(expect, trafficSign.getPosition());

    }
    @Test
    void testGetRoadBelongTo(){
        assertEquals(road, trafficSign.getRoadBelongTo());
    }

    @Test
    void testStateOfSign(){
        trafficSign.stateOfSign();
        assertEquals("STOP SIGN", trafficSign.getState());
    }
}
