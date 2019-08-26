package Start;

//Creating multiple objects from one type
class TestRectangle1{
    int length;
    int width;
    void insertRecord(int l, int w){
        length=l;
        width=w;
    }
    void calculateArea(){
        System.out.println("Area is "+length * width);
    }
}
class Rectangle1{
    public static void main(String []args){
        TestRectangle1 r1=new TestRectangle1(), r2=new TestRectangle1(),r3=new TestRectangle1();
        r1.insertRecord(10,5);
        r2.insertRecord(12,5);
        r3.insertRecord(10,7);
        r1.calculateArea();
        r2.calculateArea();
        r3.calculateArea();
    }
}
