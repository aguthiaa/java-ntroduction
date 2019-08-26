package Start;

public class VarNarrowing {
    public static void main(String []args){
        //Variable narrowing can also be called as typecasting
        float a=10.5f;
        int b=(int)a;
        double c=(double)b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
