package basics;

public class Switch {
    public static void main(String[]args){
        int y=70;
        String name="Peter";
        switch (y){
            case 70:
            case 71:
            case 72:
            case 73:
                System.out.println("This is the defined value");
                break;
            case 50:
                System.out.println("This is medium");
                break;
            case 30:
                System.out.println("This is low");
                default:
                    System.out.println("404 Error");
        }
    }
}
