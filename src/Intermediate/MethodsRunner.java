package Intermediate;

public class MethodsRunner {
    public static void main(String []args){
        Methods m1=new Methods();
        //m1.calc(10,20);
        int result=m1.calc(17,17);
        System.out.println(result);


         m1=new Methods();
        float results=m1.calc(11.1f,11);
        System.out.println(results);


         m1=new Methods();
        double result3=m1.calc(2.5, 2, 0.02);
            System.out.println(result3);
        }
    }
