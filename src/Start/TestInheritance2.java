package Start;
 //Demonstrating multi-level inheritance
class Animal2{
    void eat(){
        System.out.println("eating...");
    }
 }
 class Dog2 extends Animal2{
    void bark(){
        System.out.println("barking...");
    }
 }
 class Puppy extends Dog2{
    void weep(){
        System.out.println("weeping...");
    }
 }
 public class TestInheritance2{
    public static void main(String []args){
        Puppy p1=new Puppy();
        p1.weep();
        p1.bark();
        p1.eat();
    }
 }

