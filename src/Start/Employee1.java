package Start;

public class Employee1 {
    float salary=25000;
}
class Programmer extends Employee1{
    int bonus=5000;
    public static void main(String []args){
        Programmer p=new Programmer();
        System.out.println("Programmers salary is "+p.salary);
        System.out.println("Programmers bonus is "+p.bonus);
    }
}
