package Start;

//Demonstrating a program with no method overriding
//For method overriding to be used there must be
//1. Inheritance btn the two classes
//2. Method name should be the same as in the parent class
//3. Method should have the same parameters as in the parent class
class Vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class Bike2 extends Vehicle{
    public static void main(String []args){
        Bike2 b1=new Bike2();
        b1.run();
    }
}
