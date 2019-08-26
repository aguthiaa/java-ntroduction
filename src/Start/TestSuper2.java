package Start;
//Demonstarting super keyword
//Super can be used to invoke parent class method
//that is if the child class has the same method as the parent class
//this is used iff methods are overriden
class  Animal5{
    void eat(){
        System.out.println("eating...");
    }

}
class Dog5 extends Animal5{
    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...wuuf...wuuf...wuuf");
    }
    void showDogActivity(){
        super.eat();
        bark();
    }
}
class TestSuper2{
    public static void main(String []args){
        Dog5 d1=new Dog5();
        d1.showDogActivity();
    }
}