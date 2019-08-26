package Start;

//Initialization of an object through a constructor
class Employee{
    int id;
    String  name;
    float salary;
    void insertRecord(int i, String n, float s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
class TestEmployee{
    public static void main(String []args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.insertRecord(001,"Peter Mwangi",45000);
        e2.insertRecord(002,"Sharon Njuki",5100);
        e3.insertRecord(003,"James Muthui",105000);

        e1.display();
        e2.display();
        e3.display();

    }
}