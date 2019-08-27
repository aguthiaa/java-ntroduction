package Advanced;
abstract class CBKABS{
    abstract double captialReserve();
     double LoanIntrestRate(){
         return 12;
     }
    abstract double minimumDeposit();
}
interface BankINT{}

interface CBKINT{
    double captialReserve();
    double LoanIntrestRate();
    double minimumDeposit();
}
interface EquityINT{
    int id();
    String name();
    float ammount();
}
class Equity extends CBKABS implements EquityINT{
    @Override
    double captialReserve() {
        return 5000.55;
    }

    @Override
    double LoanIntrestRate() {
        return 11;
    }

    @Override
    double minimumDeposit() {
        return 0;
    }


    @Override
    public int id() {
        return 0;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public float ammount() {
        return 0;
    }
}
class BankABS{
    public static void main(String []args){
        CBKABS b;
        b=new Equity();
        System.out.println(b.LoanIntrestRate());
    }
}
