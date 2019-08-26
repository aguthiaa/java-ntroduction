package basics;

public class ForLoop {
    public static void main(String []args){
        //Repeats something a specific number of times
        for (int i=1; i< 10; ++i){
            System.out.println(i+"\t\t");
        }
        //program that prints add numbers btn 10 and 50
        for (int x=10; x<50; x++){
            if (x%2 !=0){
                System.out.println(x);
            }
        }
    }
}
