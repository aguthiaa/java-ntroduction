package Start;

//Demonstrating polymorphism
class Bank2{
    //Defining a method that gets the intrest rate
    float getIntrestRate(){
        return (0);
    }
}
//Defining individual bank accounts
//Equity, Kcb and National Banks
class Equity2 extends Bank2{
    float getIntrestRate(){
        return (7.5f);
    }
}
class Kcb2 extends Bank2{
    float getIntrestRate(){
        return (8.2f);
    }
}
class National2 extends Bank2{
    float getIntrestRate(){
        return (8.9f);
    }
}
class CentralBank2{
    public static void main(String []args){
        Bank2 b;
        b=new Equity2();
        System.out.println("Equity Intrest Rate "+b.getIntrestRate());
        b=new Kcb2();
        System.out.println("KCB Intrest Rate "+b.getIntrestRate());
        b=new National2();
        System.out.println("National Bank Intrest Rate is "+b.getIntrestRate());
    }
}