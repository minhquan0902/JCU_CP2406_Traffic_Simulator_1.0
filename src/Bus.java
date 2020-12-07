public class Bus extends Car {
    //Attributes
    //Get set methods
    //Constructors
    public Bus(String id, Road currentRoad) {
        super(id, currentRoad);
        length = super.getLength() * 3;
    }

    public Bus() {
        length = super.getLength() * 3;
    }

    //Input output methods
    @Override
    public void showOutPut() {
        System.out.println("Bus " + this.id + " going: " + this.speed + "dm/s on "
                + this.currentRoad.getId() + " at position " + this.position);
    }
    //Business methods
}