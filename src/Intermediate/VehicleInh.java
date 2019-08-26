package Intermediate;

public class VehicleInh extends Transpoter{
    private int tyres;
    private String vehicleType;

    protected String make,model,colour,type;
    protected int speed, topSpeed,wagons,engineCC,passenger,distance;
    //Acceleration i s equal to change in velocity/time

    public VehicleInh(String vehicleType,String make,String model,String colour,String type,
                 int speed,int tyres, int topSpeed,int wagons,int engineCC,int passenger, int distance) {
        super();
        this.tyres=tyres;
        this.vehicleType=vehicleType;
        super.make=make;
        super.model=model;
        super.colour=colour;
        super.bodyType=bodyType;
        super.speed=speed;
        super.topSpeed=topSpeed;
        super.engineCC=engineCC;
        super.passengers=passenger;

    }
public VehicleInh(){}


}
