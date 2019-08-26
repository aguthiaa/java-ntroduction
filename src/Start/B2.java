package Start;

//Demonstrating an instance initializer Block invoked after super
class A1{
    A1(){
        System.out.println("Parent constructor is invoked");
    }
}
class B2 extends A1{
    B2(){
        super();
        System.out.println("Child constructor is now invoked");
    }
    {System.out.println("Instance initializer Block is now invoked");}
    public static void main(String []args){
        B2 b =new B2();
    }
}