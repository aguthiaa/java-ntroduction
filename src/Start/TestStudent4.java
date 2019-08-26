package Start;

//Initializing an object by method
class Student3{
    int rollNo;
    String name;
    void insertRecord(int r, String n){
        rollNo=r;
        name=n;
    }
    void displayRecord(){
        System.out.println(rollNo+" "+name);
    }
}
class TestStudent4{
    public static void main(String []args){
        Student3 s1=new Student3();
        Student3 s2=new Student3();
        Student3 s3=new Student3();
        s1.insertRecord(111,"Peter");
        s2.insertRecord(222,"Irungu");
        s3.insertRecord(333,"Mwangi");
        s1.displayRecord();
        s2.displayRecord();
        s3.displayRecord();
    }
}