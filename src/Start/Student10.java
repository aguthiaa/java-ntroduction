package Start;

public class Student10 {
    int rollNo;
    String name;
    static  String college="TechCamp";
    Student10(int r, String n){
        rollNo=r;
        name=n;
    }
    void displayDetails(){
        System.out.println(rollNo+ " "+name+" "+college);
    }
    public static void main(String []args){
        Student10 s1=new Student10(1010,"Kipsang"),
                s2=new Student10(1020,"Eliud"),
                s3=new Student10(1030,"Alex");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
