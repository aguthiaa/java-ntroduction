package Start;

class Student2{
    //Creating multiple objects through reference of variable
    int id;
    String name;
}
class TestStudent3{
    public static void main(String []args){
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        Student2 s3=new Student2();
        s1.id=101;
        s1.name="Peter";
        s2.id=102;
        s2.name="Irungu";
        s3.id=103;
        s3.name="Mwangi";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
        System.out.println(s3.id+" "+s3.name);
    }
}