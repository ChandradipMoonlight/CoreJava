package oppsfeatures;

/*
this is an example of abstract class it has two abstract method
we can not create object of abstract class
we can create parameterized constructor or default constructor in abstract class
 */
abstract class Shape {
    String color;

    abstract double area();                 // abstract method
    public abstract String toString();

    public Shape(String color) {            // parameterized constructor
        this.color = color;
        System.out.println("Shape constructor is called");
    }
    public String getColor() {
        return color;
    }
}

/**
 * this is child class of the base class Shape
 */
class Circle extends Shape {
    double radius;
    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor is called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return ("Circle color is " + super.color + " and area is : " + area());
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor is called");
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
    @Override
    public String toString() {
        return ("Rectangle color is : " + super.color +
                " and Area of Rectangle is : " + area());
    }
}
public class JavaAbstraction {
    public static void main(String[] args) {
        /*
    we can not crate object of the abstract class  but we can create reference of the abstract class
         */
        Shape circle = new Circle("Red", 2.2);
        Shape rectangle = new Rectangle("Yellow", 2, 4);
        String result1 =  circle.toString();
        String result2 = rectangle.toString();
        System.out.println(result1);
        System.out.println(result2);
    }
}
