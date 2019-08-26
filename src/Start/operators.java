package Start;

public class operators {
    public static  void main(String []args){
        /* Demonstrating the various types of operators in java
        * 1. Unary operator- used to increment or decrement
        * 2. Arithmetic operators- They include +,-,/,*,%
        * 3. Bitwise operators- They include & and |
        * 4. Logical operators- They include && and ||
        * 5. Ternary operator- It include ? :
        * 6. Relational operators- They include <,>,<=,>=,!=,==
        * 7. Shift operator-They include left shift <<(associated with multiplication)
        *    and right shift <<(associated with division
        * 8. Assignment operator- They include =, +=,-=,*=,/=.....   */

        //Example of unary operator
        int x =10;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        //Example of a ternary operator
        int a= 20;
        int b=10;
        int min=(a<b)?a:b;
        System.out.println("This is the min value:"+min);
        int max=(a>b)?a:b;
        System.out.println("This is the max value:"+max);
        //Demonstrating Shift operator
        int c= 20 << 2;
        int d=20 >> 2;
        System.out.println("This is left shift:"+c);
        System.out.println("This is right shift:"+d);


    }
}
