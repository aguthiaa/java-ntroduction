package Start;

public class Bike4 {
    //Demonstrating Instance intializer block
    int speed;
    Bike4(){
        System.out.println("Speed is "+speed);
    }
    //Initializing our speed through an instance initializer block
    {speed = 100;}
    public static void main(String []args){
        Bike4 b1=new Bike4(), b2=new Bike4();
    }
}
