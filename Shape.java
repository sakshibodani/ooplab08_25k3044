// 25k-3044 task 3 lab 08
public interface Shape {
    void calculateArea();
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
     @Override
    public void calculateArea(){
        double area= Math.PI*radius*radius;
        System.out.println("Area of circle is: " + area);
     }
}
class Rectangle implements Shape{
    private double length;
    private double width;
        public Rectangle(double length, double width){
            this.length=length;
            this.width=width;

    }
    @Override
    public void calculateArea(){
            double area=length*width;
        System.out.println("Area of rectangle is: " + area);
    }
}
 class GraphicsApp {
    public static void main(String[] args) {
        Shape s1=new Circle(6.0);
        s1.calculateArea();
        Shape s2=new Rectangle(10.0, 4.0);
        s2.calculateArea();
    }
}

