package Start;

public class addingLowerTypes {
    public static void main(String []args){
        //Adding Lower types
        //Adding two byte values to get an integer
        byte a=10;
        byte b=10;
        //byte c=a + b;--> This brings an error since a+b=20 which is an integer value
        //hence we need to type cast our result i.e
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
