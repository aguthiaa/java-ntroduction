package Start;

public class CalcClass {
    public static void main(String []args){
        RecTest r1=new RecTest();
        TriTest t1=new TriTest();
        r1.insertRecord(4,5);
        t1.insertRecord(4,5);

        System.out.println(r1.area()+"\t\t\t"+t1.area());
    }
}
