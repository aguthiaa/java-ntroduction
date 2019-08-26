package Start;

public class Student9 {
    //Copying data with a constructor
    int id;
    int age;
    String name;
    Student9(int i, String n){
        id=i;
        name=n;
    }
    Student9(Student9 s, int a){
        id=s.id;
        name=s.name;
        age=a;
    }
    void displayDetails(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String []args){
        Student9 s1=new Student9(1010,"Alfonse"), s2=new Student9(s1,25);
        s1.displayDetails();
        s2.displayDetails();
    }
}
