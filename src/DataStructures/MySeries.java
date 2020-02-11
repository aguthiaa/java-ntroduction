package DataStructures;

import java.util.Scanner;

public class MySeries
{
    static Scanner scan = new Scanner(System.in);
    static int q = scan.nextInt();
    static int a = scan.nextInt();
    static int b = scan.nextInt();
    static int n = scan.nextInt();
//    static int c = scan.nextInt();
//    static int d = scan.nextInt();
//    static int m = scan.nextInt();

    static int sum =0;

    public static  void main(String []args)
    {
        if (q  > 0)
        {
            executeSeries(q);
        }
        if (n>0)
        {
            executeSeries(q);
        }
        scan.close();

    }



    private static void executeSeries(int q) {
        sum += a + Math.pow(2,0) * b;

        System.out.print(sum+" ");

        for (int j =1; j<n;j++)
        {
            sum = (int) (sum +(b * Math.pow(2,j)));

            System.out.print(sum+"  ");


        }

        System.out.println();
    }


}
