package Start;
//Demonstrating polymorphism using method overriding and inheritance
class Bank1{
    private int id;
    private float ammount,intrest;
    private String name;
    void inserData(int i, float amt,float it, String n){
        id=i;
        ammount=amt;
        intrest=it;
        name=n;
    }
    //Create a deposit method
    void deposit(float amt){
        ammount=ammount+amt;
        System.out.println(amt+" deposited");
    }
    //Creating withdrawal method
    void withdraw(float amt){
        ammount=ammount-amt;
        System.out.println(amt+" withdrawn");
    }
    //Creating show bankers details method
    void showBankerDetails(){
        System.out.println("Banker's Information --> id "+id+" Name "+name+" Current Ammount "+ammount+"\n");
    }
    //Creating show balance method
    void showBalance(){
        //System.out.println(id+" "+name);
        System.out.println(ammount+" is the new Balance");
    }
    //creating method to show bank intrest rate
    void intrestRate(float it){
        System.out.println("\nNote : "+it+"% is the current Intrest Rate");
    }
}
class Equity extends Bank1{

}
class KCB extends Bank1{

}
class National extends Bank1{

}
class Barclays extends Bank1{

}
class CentralBank1{
    public static void main(String []args){
        Equity e1=new Equity();
        KCB c1=new KCB();
        National a1=new National();
        Barclays b1=new Barclays();
        e1.inserData(1010, 25000,7.2f, "Peter");
        e1.showBankerDetails();
        e1.deposit(5000);
        e1.showBalance();
        e1.withdraw(10000);
        e1.showBalance();
        e1.intrestRate(7.2f);


    }
}

