package Start;

//Using object and class to calculate area of a rectangle
class Rectangle{
    int length;
    int width;
    void insertDimensions(int l, int w){
        length=l;
        width=w;
    }
    void calculateArea(){
        System.out.println(length*width+" Sq cm");//Returns Area
    }
}
class TestRectangle{
    public static void main(String []args){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        Rectangle r3=new Rectangle();
        r1.insertDimensions(4,5);
        r2.insertDimensions(6,5);
        r3.insertDimensions(8,5);
        r1.calculateArea();
        r2.calculateArea();
        r3.calculateArea();
    }
}