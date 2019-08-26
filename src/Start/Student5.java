package Start;

public class Student5 {
    //Demonstrating Default class constructor
    int id;
    String name;
    void displayDetails(){
        System.out.println(id+" "+name);
    }
    public static void main(String[]args){
        Student5 s1=new Student5(), s2=new Student5();
        s1.displayDetails();
        s2.displayDetails();
    }
}
