package DataStructures;

public class IMarks {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int n = 10;
        int sum = 0;
        sum += a + (pow(2, 0) * b);
        System.out.print(sum + " ");
        for (int j = 1; j < n; j++) {
            sum = sum + (b * pow(2, j));
            System.out.print(sum + " ");
        }
        System.out.println();
        sum = 0;



}

    static int pow(int a,int b)
    {
        if(b>0)
        {
            return(a*pow(a,b-1));
        }
        else
        {
            return 1;
        }

    }
}
