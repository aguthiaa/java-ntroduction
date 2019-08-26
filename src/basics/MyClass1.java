package basics;

public class MyClass1 {
    int id;
    String name;
    int age;
    MyClass1(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }
    void displayDetails(){
        System.out.println(id+". "+name+" is "+age);
    }
    public static void main(String[]args){
        MyClass1 c1=new MyClass1(1, "Tom", 15),
                c2=new MyClass1(2, "Alfonse", 19),
                c3=new MyClass1(3, "Kenneth", 26);
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
