package Start;

//Demonstrating method overloading by using different data types
class Adder{
    static int add(int a, int b){
        return (a +b );
    }
    static double add(double a, double b){
        return (a + b);
    }
}
class TestPOverLoad1{
    public static void main(String []args){
        System.out.println(Adder.add(10,20)+"\t\t\t"+Adder.add(10.5, 20.65));
    }
}