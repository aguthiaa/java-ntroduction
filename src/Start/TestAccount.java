package Start;

//Java Program to demonstrate the working of a bank account
//Where we deposit and withdraw ammount from our account
//Creating an account class which has deposit and withdraw methods
class Account{
    int acc_no;
    String name;
    float ammount;
    void inserDetails(int a,String n, float amt){
        acc_no=a;
        name=n;
        ammount=amt;
    }
    //deposit method
    void deposit(float amt){
        ammount=ammount+amt;
        System.out.println(amt+" deposited");
    }
    //withdraw method
    void withdraw(float amt){
        if (ammount<amt){
            System.out.println("Insufficient Balance");
        }
        else {
            ammount=ammount-amt;
            System.out.println(amt+" withdrawn");
        }
    }
    //Method to check the balance of the account
    void checkBalance(){
        System.out.println("Balance is "+ammount);
    }
    //Method to display the values of an object
    void display(){
        System.out.println(acc_no+" "+name+" "+ammount);
    }

}
class TestAccount{
    public static void main(String []args){
        Account a1=new Account();
        a1.inserDetails(6235001,"Peter Mwangi",55000);
        a1.display();
        a1.checkBalance();
        a1.deposit(5000);
        a1.checkBalance();
        a1.withdraw(10000);
        a1.checkBalance();
    }
}