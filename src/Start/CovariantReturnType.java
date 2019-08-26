package Start;

//Demonstrating covariant return type
//It allows method overrriding by just changing the return type
//Note this is not possible in method overloading
class A {
    A get() {
        return this;
    }
}
class CovariantReturnType extends A {
    CovariantReturnType get(){
             return this;
         }

    void message(){
        System.out.println("Welcome to covariant return type");
    }
    public static void main(String []args){
        new CovariantReturnType().get().message();
    }
}
