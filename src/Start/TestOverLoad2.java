package Start;

//Demonstrating method overloading by changing number of parsed parameters
class Adder1{
    static int add(int a, int b){
        return (a + b);
    }
    static int add(int a, int b, int c){
        return (a + b + c);
    }
}
class TestOverLoad2{
    public static void main(String []args){
        System.out.println(Adder1.add(10,20));
        System.out.println(Adder1.add(10,20,30));
    }
}