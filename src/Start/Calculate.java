package Start;

public class Calculate {
    //Static method that performs a normal calculation
    static  int cube(int x){
        return x*x*x;
    }
    public static void main(String[]args){
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}
