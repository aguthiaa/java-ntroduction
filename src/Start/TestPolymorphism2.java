package Start;
//Testing runtime polymorphism using Animal
class Animal8{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog8 extends Animal8{
    void eat(){
        System.out.println("eating bread...");
    }
}
class Cat8 extends Animal8{
    void eat(){
        System.out.println("eating rat...");
    }
}
class Lion8 extends Animal8{
    void eat(){
        System.out.println("eating meat...");
    }
}
class TestPolymorphism2{
    public static void main(String []args){
        Animal8 a;
        a=new Dog8();
        a.eat();
        a=new Cat8();
        a.eat();
        a=new Lion8();
        a.eat();
    }
}
