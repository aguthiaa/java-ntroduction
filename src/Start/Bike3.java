package Start;
//Demonstrating method overriding
class Vehicle1{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike3 extends Vehicle1{
    //Overriding run method
    void run(){
        System.out.println("Bike is now running");
    }
    public static void main(String []args){
        Bike3 b1=new Bike3();
        b1.run();
    }
}