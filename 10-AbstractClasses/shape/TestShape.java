package shape;

public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(5, 4, 3, 2);

        c.area();
        c.perimeter();

        r.area();
        r.perimeter();

        t.area();
        t.perimeter();
    }
}
