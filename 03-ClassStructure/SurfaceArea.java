public class SurfaceArea {
    byte radius;
    byte x;
    byte y;
    byte a;
    byte h;
    public static void circleArea(byte radius) {
        System.out.println("Area of the circle is: " + (2*Math.PI*Math.pow(radius, 2)));
    }
    public static void rectangleArea(byte x, byte y) {
        System.out.println("Area of the rectangle is: " + (x*y));
    }
    public static void triangleArea(byte a, byte h) {
        System.out.println("Area of triangle is: " + (0.5*a*h));
    }
    public void calculations() {
        circleArea(radius);
        rectangleArea(x, y);
        triangleArea(a, h);
    }
}
