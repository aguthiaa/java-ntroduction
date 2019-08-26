package Start;
//Demonstrating real world method overriding
//Where-by the central bank regulates the intrest rates of all banks
//Consider equity, kcb, National and barclays banks
class Bank{
    float getRateOfIntrest(){
        return (0);
    }

}
class KCBBAnk extends Bank{
   float getRateOfIntrest(){
        return (7.5f);
    }
}
class EquityBank extends Bank{
    float getRateOfIntrest(){
        return (7.1f);
    }
}class NationalBank extends Bank{
    float getRateOfIntrest(){
        return (8.5f);
    }
}class BarclaysBank extends Bank{
    float getRateOfIntrest(){
        return (8.9f);
    }
}
class CentralBank{
    public static void main(String []args){
        KCBBAnk k1=new KCBBAnk();
        EquityBank e1=new EquityBank();
        NationalBank n1=new NationalBank();
        BarclaysBank b1=new BarclaysBank();
        System.out.println("KCB Inrest Rate is "+k1.getRateOfIntrest());
        System.out.println("Equity Bank Inrest Rate is "+e1.getRateOfIntrest());
        System.out.println("National Bank Inrest Rate is "+n1.getRateOfIntrest());
        System.out.println("Barclays Bank Inrest Rate is "+b1.getRateOfIntrest());
    }
}

