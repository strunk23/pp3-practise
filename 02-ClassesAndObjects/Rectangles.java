public class Rectangles {
    byte x;
    byte y;

    void displayDimensions() {
        System.out.println("Dimensions are: " + x + "x" + y);
    }
    void displayPerimeter() {
        System.out.println("Perimeter is: " + (x*2+y*2));
    }
    void displayArea() {
        System.out.println("Area is: " + x*y);
    }
}
