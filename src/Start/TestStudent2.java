package Start;

class Student1{
    //There are 3 ways to initialize variables
    //1. By reference of variable
    //2. By method
    //3. By Constructor
    //Demonstrating by reference of variable
    int id;
    String name;
}
class TestStudent2{
    public static void main(String []args){
        Student1 s1=new Student1();
        s1.id=101;
        s1.name="Mwangi";
        System.out.println(s1.id+" "+s1.name);
    }
}
