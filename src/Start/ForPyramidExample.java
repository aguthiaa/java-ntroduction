package Start;

public class ForPyramidExample {
    public static void main(String []args){
        //Using for Loop to create a pyramid
        for (int i=1; i<=10; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
