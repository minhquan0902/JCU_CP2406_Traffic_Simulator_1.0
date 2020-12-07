import java.util.ArrayList;

public class Road {
    //Attributes
    private String id;
    private int speedLimit;
    private int length;
    private int[] startLocation;
    private int[] endLocation;
    private ArrayList<Road> connectedRoads = new ArrayList<>();
    private ArrayList<Car> carsOnRoad = new ArrayList<>();
    private ArrayList<TrafficLight> ligthsOnRoad = new ArrayList<>();
    private ArrayList<TrafficSign> signsOnRoad = new ArrayList<>();
    private ArrayList<GasStation> gasStationList = new ArrayList<>();

    //Constructors
    public Road(String id, int speedLimit, int length, int[] startLocation) {
        this.id = id;
        this.speedLimit = speedLimit;
        this.length = length;
        this.startLocation = startLocation;
        this.endLocation = new int[]{this.startLocation[0] + this.length, 0};
    }

    public Road() {

    }

    //Get set methods

    public ArrayList<GasStation> getGasStationList() {
        return gasStationList;
    }
    public ArrayList<TrafficSign> getSignsOnRoad(){
        return signsOnRoad;
    }
    public void setSignsOnRoad(ArrayList<TrafficSign> signsOnRoad){
        this.signsOnRoad = signsOnRoad;
    }

    public void setGasStationList(ArrayList<GasStation> gasStationList) {
        this.gasStationList = gasStationList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(int[] startLocation) {
        this.startLocation = startLocation;
    }

    public int[] getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(int[] endLocation) {
        this.endLocation = endLocation;
    }

    public ArrayList<Road> getConnectedRoads() {
        return connectedRoads;
    }

    public void setConnectedRoads(ArrayList<Road> connectedRoads) {
        this.connectedRoads = connectedRoads;
    }

    public ArrayList<Car> getCarsOnRoad() {
        return carsOnRoad;
    }

    public void setCarsOnRoad(ArrayList<Car> carsOnRoad) {
        this.carsOnRoad = carsOnRoad;
    }

    public ArrayList<TrafficLight> getLigthsOnRoad() {
        return ligthsOnRoad;
    }

    public void setLigthsOnRoad(ArrayList<TrafficLight> ligthsOnRoad) {
        this.ligthsOnRoad = ligthsOnRoad;
    }

    //Input output methods
    public void showStartLocation() {
        System.out.println("Start Location is: " + startLocation[0] + "," + startLocation[1]);
    }

    public void showEndLocation() {
        System.out.println("End Location is: " + endLocation[0] + "," + endLocation[1]);
    }

    public void showRoadInfo() {
        System.out.printf("Road ID: %s - Speed limit: %dm/s - Length: %d%n"
                , this.id, this.speedLimit, this.length);
        showStartLocation();
        showEndLocation();
    }
    //Business methods

}