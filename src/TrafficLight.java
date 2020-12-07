import java.util.Random;

public class TrafficLight {
    //Attributes
    private static final String GREEN = "GREEN";
    private static final String RED = "RED";
    private final double CHANGE_GREEN_RATE = 50;
    private String id;
    private String state;
    private int[] position;
    private Road roadBelongTo;

    //Get set methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public Road getRoadBelongTo() {
        return roadBelongTo;
    }

    public void setRoadBelongTo(Road roadBelongTo) {
        this.roadBelongTo = roadBelongTo;
    }

    //Constructors
    public TrafficLight(String id, Road roadBelongTo) {
        this.id = id;
        this.roadBelongTo = roadBelongTo;
        state = RED;
        this.roadBelongTo.getLigthsOnRoad().add(this);
        position = new int[]{this.roadBelongTo.getLength(), 0};
    }

    public TrafficLight() {

    }

    //Input output methods
    public void showLightInfo() {
        System.out.printf("Light %s on road %s is : %s at position %s%n",
                this.id, this.roadBelongTo.getId(), this.state, (this.position[0] + "," + this.position[1]));
    }

    //Business methods
    public void operate() {
        Random rd = new Random();
        int possibility = rd.nextInt(100);
        if (possibility > CHANGE_GREEN_RATE) {
            this.state = "GREEN";
        } else {
            this.state = "RED";
        }
    }
}