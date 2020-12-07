public class GasStation {
    //Attributes
    private String id;
    private int[] position;
    private Road roadLocatedOn;

    //Constructors
    public GasStation(String id, Road roadBelongTo) {
        this.roadLocatedOn = roadBelongTo;
        position = new int[]{this.roadLocatedOn.getLength(), 0}; //place gas station at the end of the road
        this.id = id;
        this.roadLocatedOn.getGasStationList().add(this);
    }


    //Get set methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public Road getRoadLocatedOn() {
        return roadLocatedOn;
    }

    public void setRoadLocatedOn(Road roadLocatedOn) {
        this.roadLocatedOn = roadLocatedOn;
    }

    //Input output methods
    public void showInfo() {
        System.out.printf("Gas station %s on road  %s at position %s%n",
                this.id, this.roadLocatedOn.getId(), (this.position[0] + "," + this.position[1]));
    }

    //Business method
    public int reFillGas(int gasLevel, Road nextRoad) {
        System.out.println("---CAR IS REFILLING...---");
        return gasLevel = nextRoad.getLength();
    }


}
