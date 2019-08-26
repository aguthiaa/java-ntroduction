package Intermediate;

public class CarEnc{
   private String make, model, colour, bodyType;
    private int id,passengers, engineCC,speed, topSpeed;
    public CarEnc(String ma,String mo,String co,String bo,int i,int pa,int en,int to){
        make=ma;
        model=mo;
        colour=co;
        bodyType=bo;
        id=i;
        passengers=pa;
        engineCC=en;
        topSpeed=to;
        speed=0;
    }
    void setMake(){
        System.out.println("Vitz");
    }
    void accelerate(){
        if (speed==topSpeed){
            speed=topSpeed;

        }
        else {

            //System.out.println(speed++);
        }
    }
    void decelerate(){
        if (speed==0){
            speed=0;
        }
        else {
            speed--;
            //System.out.println(speed--);
        }
    }

    }
