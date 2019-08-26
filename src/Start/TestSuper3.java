package Start;

//Super is used to invoke parent class constructor
class Animal6{
    Animal6(){
        System.out.println("Animal has been created");
    }
}
class Dog6 extends Animal6{
    Dog6(){
        super();
        System.out.println("Dog is now created");
    }
}
class TestSuper3{
    public static void main(String []args){
        Dog6 d1=new Dog6();
    }
}