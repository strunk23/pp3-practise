public class Main {
    public static void main(String[] args) {
        student();
        book();
        lamp();
        rectangle();
        counter();
    }
    public static void student() {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "John";
        s1.age = 25;
        s1.id = 123123;
        s1.isIdValid = false;
        s1.semester = 3;
        s1.average = 4.3F;

        s2.name = "Steve";
        s2.age = 24;
        s2.id = 224563;
        s2.isIdValid = true;
        s2.semester = 4;
        s2.average = 3.3F;

        s3.name = "Mike";
        s3.age = 20;

        s1.sayHello();
        s2.sayHello();
        s3.sayHello();

        System.out.println(s1.displayName());
        System.out.println(s2.displayName());
        System.out.println(s3.displayName());

        System.out.println(s1.displayAge());
        System.out.println(s2.displayAge());
        System.out.println(s3.displayAge());

        s1.idInfo();
        s2.idInfo();

        s1.displayInfo();
        s2.displayInfo();

        s1.changeIdStatus(true);
        s1.idInfo();
    }
    public static void book() {
        Books b1 = new Books();
        Books b2 = new Books();

        b1.title = "Dune I";
        b2.title = "Dune II";

        b1.author = b2.author = "Frank Herbert";

        b1.pages = 200;
        b2.pages = 320;

        b1.isOpen = false;
        b2.isOpen = true;

        b1.price = 43.5F;
        b2.price = 38.9F;

        b1.displayInfo();
        b2.displayInfo();

        b1.open();
        b1.displayInfo();
    }
    public static void lamp() {
        Lamps l1 = new Lamps();
        Lamps l2 = new Lamps();

        l1.isOn = false;
        l2.isOn = true;

        l1.turnOff();
        l1.turnOn();
        l1.displayStatus();

        l2.turnOn();
        l2.displayStatus();
        l2.turnOff();
        l2.displayStatus();
    }
    public static void rectangle() {
        Rectangles r1 = new Rectangles();
        Rectangles r2 = new Rectangles();

        r1.x = 3;
        r1.y = 4;

        r2.x = 2;
        r2.y = 7;

        r1.displayDimensions();
        r1.displayPerimeter();
        r1.displayArea();

        r2.displayDimensions();
        r2.displayPerimeter();
        r2.displayArea();
    }
    public static void counter() {
        Counters c1 = new Counters();
        Counters c2 = new Counters();

        c1.changeByTen("+");
        c1.changeByTen("+");
        c1.changeByOne("+");
        c1.changeByOne("+");
        c1.changeByOne("+");
        c1.displayCounter();

        c2.changeByTen("-");
        c2.changeByTen("-");
        c2.changeByTen("-");
        c2.changeByTen("-");
        c2.changeByTen("-");
        c2.changeByOne("+");
        c2.changeByOne("+");
        c2.changeByOne("+");
        c2.displayCounter();
    }
}
