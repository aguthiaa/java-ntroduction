package Intermediate;

public class Train {
    //Defining a train
    //make, model,colour,speed,topSpeed,wagons,engineCC,type(passenger/cargo),passengers
  private String make,model,colour,type;
    private int speed, topSpeed,wagons,engineCC,passenger,distance;
    //Acceleration i s equal to change in velocity/time

    public Train(String make,String model,String colour,String type,
               int speed, int topSpeed,int wagons,int engineCC,int passenger, int distance) {
        super();
        this.make=make;
        this.model=model;
        this.colour=colour;
        this.type=type;
        this.speed=speed;
        this.distance=distance;
        this.topSpeed=topSpeed;
        this.wagons=wagons;
        this.engineCC=engineCC;
        this.passenger=passenger;

    }
    public Train(){}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getSpeed() {
        return speed;
    }

//    public void setSpeed(int speed) {
//       this.speed = speed;
//    }
   public void accelerate(){
        if (speed == topSpeed){
            speed=topSpeed;

        }
        else {
            speed+=5;
            //System.out.println(speed++);
        }
    }
    public void decelerate(){
        if (speed == 0){
            speed=0;
            System.out.println("Minimum speed reached");
            System.exit(0);
        }
        else {
            speed--;
            //System.out.println(speed--);
        }
    }
    public int getDistance(int distance){
        return distance;
    }
    public void setDistance(){
        this.distance=distance;
    }
}
