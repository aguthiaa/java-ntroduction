package Start;
//We are going to create a Person class and Employee class
//Here Employee will inherit all the attributes of a person and
//have his/her own personal attribute such as salary
class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
}
class Employie extends Person{
    float salary;
    Employie(int id , String name, float salary){
        super(id, name);
        this.salary=salary;
    }
    void displayInfo(){
        System.out.println("Id "+id+" Name is "+name+" Current Salary "+salary);
    }
}
class TestSuper5{
    public static void main(String []args){
        Employie e1=new Employie(4040,"Ptolemy",19800.59f);
        e1.displayInfo();
    }
}