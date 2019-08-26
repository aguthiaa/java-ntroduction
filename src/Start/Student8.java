package Start;

public class Student8 {
    //Demonstrating constructor Overloading in java
    int id;
    String name;
    int age;
    Student8(int i, String n){
        id=i;
        name=n;
    }
    Student8(int i, String n,int a ){
        id=i;
        name=n;
        age=a;
    }
    void displayRecord(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String []args){
        Student8 s1=new Student8(101,"Peter"),
                 s2=new Student8(1020,"Thari",30);
        s1.displayRecord();
        s2.displayRecord();
    }
}
