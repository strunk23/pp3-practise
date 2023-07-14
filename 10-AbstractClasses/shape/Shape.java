package shape;

public abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape {
    int a;
    int b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void area() {
        System.out.println(a * b);
    }
    void perimeter() {
        System.out.println((2 * a) + (2 * b));
    }
}

class Triangle extends Shape {
    int a;
    int b;
    int c;
    int h;
    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    void area() {
        System.out.println(a * h / 2);
    }
    void perimeter() {
        System.out.println(a + b + c);
    }
}

class Circle extends Shape {
    int r;
    public Circle(int r) {
        this.r = r;
    }
    void area() {
        System.out.println(Math.pow(r, 2) * Math.PI);
    }
    void perimeter() {
        System.out.println(2 * r * Math.PI);
    }
}
