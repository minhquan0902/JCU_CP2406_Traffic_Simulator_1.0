import java.util.Random;
public class TrafficSign {
    // Attribute
    private static final String STOP = "STOP SIGN";
    private static final String GO = "GO SIGN";
    private final double RANDOM_SIGN = 50;
    private String id;
    private String state;
    private int[] position;
    private Road roadBelongTo;

   // Get set Method

   public String getID(){
       return id;
   }
   public void setId(String id){
      this.id = id;
   }
   public String getState(){
       return state;
   }
    public void setState(String state){
       this.state = state;
    }
    public int[] getPosition(){
       return position;
    }
    public void setPosition(int[] position){
       this.position = position;
    }


    public Road getRoadBelongTo(){
       return roadBelongTo;
    }
    public void setRoadBelongTo( Road roadBelongTo){
       this.roadBelongTo = roadBelongTo;
    }

    // Constructor
    public TrafficSign(String id, Road roadBelongTo){
       this.id = id;
       this.roadBelongTo = roadBelongTo;
       state = STOP;
       this.roadBelongTo.getSignsOnRoad().add(this);
       position = new int[]{this.roadBelongTo.getLength(), 0};
    }
    public void showSignInfo(){
        System.out.printf("Sign %s on road %s is : %s at position %s%n",
                this.id, this.roadBelongTo.getId(), this.state, (this.position[0] + "," + this.position[1]));
    }
    public void stateOfSign(){
       Random random = new Random();
       int possibility = random.nextInt(100);
       if (possibility > RANDOM_SIGN){
           this.state = "GO SIGN";

       }else{
           this.state = "STOP SIGN";
       }
    }
}
