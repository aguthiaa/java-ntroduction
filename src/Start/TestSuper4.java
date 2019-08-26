package Start;

//Note Default constructor is always provided automatically by the
// compiler if there is no a constructor.
//It comes with super() as the first statement
//Demonstration
class Animal7{
    Animal7(){
        //super(); super takes this position
        System.out.println("Animal is now created");
    }
}
class Dog7 extends Animal7{
    Dog7(){
        //super(); Note super is already assigned by the compiler and will take this position
        System.out.println("Dog is now created");
    }

}
class TestSuper4{
    public static void main(String []args){
        Dog7 d1=new Dog7();
    }
}
