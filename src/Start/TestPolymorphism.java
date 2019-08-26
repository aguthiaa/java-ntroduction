package Start;
//Testing polymorphism by drawing shapes
//Rectangle, Circle and Triangle
class Shape{
    void draw(){
        System.out.println("drawing...");
    }
}
class Rectangle2 extends Shape{
    void draw(){
        System.out.println("drawing a Rectangle...");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing a Circle...");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("drawing a Triangle");
    }
}
class TestPolymorphism{
    public static void main(String []args){
        Shape s;
        s=new Rectangle2();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}
