class Motorbike extends Car {
    //Attributes
    //Get set methods
    //Constructors
    public Motorbike(String id, Road currentRoad) {
        super(id, currentRoad);
        length = super.getLength() * 0.5f;
    }

    public Motorbike() {
        length = super.getLength() * 0.5f;
    }
    //Input output methods

    @Override
    public void showOutPut() {
        System.out.println("Car " + this.id + " going: " + this.speed + "dm/s on "
                +this.currentRoad.getId() + " at position "+ this.position);
    }
    //Business methods
}