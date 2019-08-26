package basics;
import java.util.Scanner;
public class Student {
    //Grading system
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Marks");
        try {
            int marks=sc.nextInt();
            if (marks>100 || marks < 0){
                System.out.println("Enter valid marks");
            }
            else if (marks >= 70 && marks <=100){
                System.out.println(marks+" is A");
            }
            else if (marks >=60 && marks < 70){
                System.out.println(marks+" is B");
            }
            else if (marks >=50 && marks < 60){
                System.out.println(marks +" is C");
            }
            else if (marks >=40 && marks < 50){
                System.out.println(marks+" is D");
            }

            else {
                System.out.println(marks+ " is FAIL");
            }
        }
        catch (Exception exc){
            System.out.println("Marks must be inform of numbers "+exc);
        }
    }

}
