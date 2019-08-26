package Start;
//Demonstrating super keywords
//Supper keyword can be used to refer to immediate parent class variable
class Animal4{
    String color="white";
}
class Dog4 extends Animal4{
    String color="Black";
    void printColor(){
        System.out.println("Dog color is "+color);
        System.out.println("Animal color is "+super.color);
    }
}
class TestSuper1{
    public static void main(String []args){
        Dog4 d1=new Dog4();
        d1.printColor();
    }
}

