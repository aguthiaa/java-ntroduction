package basics;

public class DoWhileLoop {
    public static void main(String []args){
        int x=1;
        do {
            if (x == 5){
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        }while (x <= 10);
    }
}
