package Start;


class Students{
    //Demonstrating class outside the main method
    //It is one of the best practices
    int id;
    String name;
}
public class TestStudent1{
    public static void main(String []args){
        Students s1=new Students();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}