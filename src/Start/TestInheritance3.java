package Start;

//Demonstrating multi-level inheritance
class Animal3{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog3 extends Animal3{
    void bark(){
        System.out.println("barking...wuuf..wuuf...wuuf");
    }
}
class Cat extends Animal3{
    void meow(){
        System.out.println("meow...meow...meow");
    }
}
public class TestInheritance3{
    public static void main(String []args){
        Cat c1=new Cat();
        c1.meow();
        c1.eat();
        Dog3 d1=new Dog3();
        d1.bark();
        d1.eat();
    }
}
