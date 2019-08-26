package Start;

//Demonstrating how a static method can change the value of a static variable
class Student11{
    int rollNo;
    String name;
    static String college="TechCamp";
    //Declaring a static method that will change the value of the static variable
    static void change(){
        college="Taita Taveta Uni";
    }
    Student11(int r, String n){
        rollNo=r;
        name=n;
    }

    void displayDetails(){
        System.out.println(rollNo+" : "+name+" "+college);
    }
}
public class TestStaticMethod{
    public static void main(String []args){
        //We need to call the change method
        Student11.change();
        Student11 s1=new Student11(4040, "Tom"),
                  s2=new Student11(4444, "Melick"),
                  s3=new Student11(5050,"Kamutu");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}