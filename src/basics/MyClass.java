package basics;

public class MyClass {
    public static void main(String []args){
        Students mark=new Students();
        mark.id=1;
        mark.name="Mark";
                mark.age=18;
                Students tom=new Students();
                tom.id=2;
                tom.name="Tom";
                tom.age=26;
                Students ken=new Students();
                ken.id=3;
                ken.name="Kenneth";
                ken.age=22;
                System.out.println(mark.id+". "+mark.name+" is "+mark.age);
                System.out.println(tom.id+". "+tom.name+" is "+tom.age);
                System.out.println(ken.id+". "+ken.name+" is "+ken.age);

    }
}
