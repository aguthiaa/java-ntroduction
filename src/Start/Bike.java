package Start;

//Demonstrating Java class constructor( Default i.e No parameters)
public class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    public static void main(String []args){
        Bike b1=new Bike(),b2=new Bike(), b3=new Bike();
    }
}