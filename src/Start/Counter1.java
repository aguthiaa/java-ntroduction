package Start;

public class Counter1 {
    //Demonstarting count with a static variable
    static int count=0;
    Counter1(){
        count++;
        System.out.println(count);
    }
    public static void main(String []args){
        Counter1 c1=new Counter1();
        Counter1 c2=new Counter1();
        Counter1 c3=new Counter1();
        Counter1 c4=new Counter1();
    }
}
