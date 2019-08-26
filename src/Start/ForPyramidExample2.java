package Start;

public class ForPyramidExample2 {
    public static void main(String []args){
        //Demonstrating type 2 pyramid.
        int term=5;
        for (int i=1; i<=term; i++){
            for (int j=term; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
