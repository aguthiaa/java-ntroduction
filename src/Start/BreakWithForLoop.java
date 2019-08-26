package Start;

public class BreakWithForLoop {
    public static void main(String []args){
        //Java break statement with for loop
        for (int i=1; i<=5; i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }
        //java break statement with while loop
        int x=5;
        while (x<=10){
            if (x==7){
                break;
            }
            System.out.println(x);
            x++;
        }
        //Java break with do-while loop
        int y=10;
        do {
            if (y==13){
                break;
            }
            System.out.println(y);
            y++;
        }while (y<=15);
    }
}
