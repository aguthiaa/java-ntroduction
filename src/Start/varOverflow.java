package Start;

public class varOverflow {
    public static void main(String[]args){
        //Demonstrating java variable overflow
        //This is by changing an integer to a byte
        int a=130;
        byte b=(byte)a;
        System.out.println(a);
        System.out.println(b);
    }
}
