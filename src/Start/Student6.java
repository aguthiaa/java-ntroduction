package Start;

public class Student6 {
    //Demonstrating java parameterized constructor
    //Provides different values to distinct objects
    int id;
    String name;
    Student6(int i, String n){
        id=i;
        name=n;
    }
    void displayDetails(){
        System.out.println(id+"\t\t"+name);
    }
    public static void main(String[]args){
        Student6 s1=new Student6(101,"Peter");
        Student6 s2=new Student6(202,"Mwangi");
        s1.displayDetails();
        s2.displayDetails();
    }
}
