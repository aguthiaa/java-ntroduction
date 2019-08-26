package Start;

//Testsing single inheritance
class Animal{
    void eat(){
        System.out.println("eating..");
    }
        }
        //Dog is an animal
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
        }
        class TestInheritance{
    public static void main(String []args){
        Dog d1=new Dog();
        d1.bark();
        d1.eat();
    }
        }

