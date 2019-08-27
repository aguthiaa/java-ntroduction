package Start;

class fact{
    void calc(int n){
        int facts=1;
        for (int i=1; i<=n; i++){
            facts=facts*i;

        }
        System.out.println(n+" factorial is "+facts);
    }
}
class FactorialRecap{
    public static void main(String []args){
        fact f1=new fact();
        f1.calc(5);
    }
}