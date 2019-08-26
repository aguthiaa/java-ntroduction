package Intermediate;

public class Transpoter {
    protected String make, model, colour, bodyType;
    protected int id,passengers, engineCC,speed, topSpeed;
    protected void accelerate(){
        if (speed == topSpeed){
            speed=topSpeed;

        }
        else {
            speed+=5;
            //System.out.println(speed++);
        }
    }
    protected void decelerate(){
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

    protected String getMake() {
        return make;
    }

    protected void setMake(String make) {
        this.make = make;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected String getColour() {
        return colour;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    protected String getBodyType() {
        return bodyType;
    }

    protected void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected int getPassengers() {
        return passengers;
    }

    protected void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    protected int getEngineCC() {
        return engineCC;
    }

    protected void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    protected int getTopSpeed() {
        return topSpeed;
    }

    protected void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
