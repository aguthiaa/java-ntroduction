package Intermediate;

public class carWrongRunner {
    public  static  void main(String []args){
        CarWrong probox= new CarWrong();
        probox.make="Toyota";
        probox.model="Probox";
        probox.id=101;
        probox.colour="White";
        System.out.println(probox.id+" : "+probox.make+" : "+probox.colour+" : "+probox.model);
    }
}
