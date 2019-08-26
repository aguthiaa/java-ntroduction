package Start;

public class ForEachLoop {
    public static void main(String[]args){
        //Java For Each Loop is the same as Enhanced for loop
        //Used to print out elements declared in a variable
        //Example:Printing out Array Elements
        int days[]={1,2,3,4,5,6,7};
        for (int x:days){
            System.out.println(x);
        }
        //Testing out whether it works the same for a string data type
        String names[]={"Monday","Tuesday","Wednesday", "Thursday", "Friday","Sartuday","Sunday"};
        for (String t:names){
            System.out.println(t);
        }
    }
}
