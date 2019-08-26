package Start;

public class Calculation {
    //Using an anonymous object to find the factorial of a number
   //Find the factorial of 5 Using an anonymous object
    void fact(int n){
        int fact=1;
        for (int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
    public static void main(String []args){
        new Calculation().fact(5);
    }

}
