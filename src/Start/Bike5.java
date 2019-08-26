package Start;

public class Bike5 {
    //Demonstrating which one is invoked first
    //1. Intance initializer block or a constuctor
    //2. Note there are three places where you can perform operations
    //...1. Method
    //...2. Constructor
    //...3. Block
    Bike5(){
        System.out.println("Constructor has been invoked");
    }
    //Instance Initializer Block
    {System.out.println("Instance Initializer Block has been Invoked");}
    public static void main(String []args){
        Bike5 b1=new Bike5();
    }
}
