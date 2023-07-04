public class Main {
    public static void main(String[] args) {
        //cinema();
        //area();
        //person();
        //statistic();
        //device();
        //student();
        //clock();
        room();
    }
    public static void cinema() {
        CinemaTicket c1 = new CinemaTicket("Morning Star Cinema", "Gladiator", 2, 10);
        CinemaTicket c2 = new CinemaTicket("Morning Star Cinema", "Gladiator", 7, 8);

        c1.ticketData();
        c2.ticketData();
    }
    public static void area() {
        SurfaceArea s1 = new SurfaceArea();

        s1.radius = 3;
        s1.x = 4;
        s1.y = 5;
        s1.a = 3;
        s1.h = 4;

        s1.calculations();
    }
    public static void person() {
        Person p1 = new Person("Jack");
        Person p2 = new Person("James", 60.9F, 176.5F);
        Person p3 = new Person("Aron", 50.5F, 130);
        p1.setWeightAndHeight(87, 180);

        p1.calculateBMI();
        p2.calculateBMI();
        p3.calculateBMI();

        System.out.println(p1.displayRecord());
        System.out.println(p2.displayRecord());
        System.out.println(p3.displayRecord());
    }
    public static void statistic() {
        Statistics s1 = new Statistics(5, 10);
        System.out.println(s1.itemsWithinRange());
        System.out.println(s1.sumWithinRange());
        System.out.println(s1.meanWithinRange());
    }
    public static void device() {
        InternetDevice i1 = new InternetDevice("Iphone10", true);
        InternetDevice i2 = new InternetDevice("Iphone11", true);
        InternetDevice i3 = new InternetDevice("Iphone12", false);
        InternetDevice i4 = new InternetDevice("Iphone13", true);
        InternetDevice i5 = new InternetDevice("Samsung", false);

        i1.displayStatus();
        i2.displayStatus();
        i3.displayStatus();
        i4.displayStatus();
        i5.displayStatus();

        System.out.println(InternetDevice.connectedDevices);
    }
    public static void student() {
        StudentGrades s1 = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades s2 = new StudentGrades("James", 5);
        StudentGrades s3 = new StudentGrades("Max");

        System.out.println(s1.displayRecord());
        System.out.println(s2.displayRecord());
        System.out.println(s3.displayRecord());
    }
    public static void clock() {
        Clock c1 = new Clock();

        c1.setAlarm(15, 0);

        System.out.println(c1.displayTime());

        c1.setClock(14, 59);
        c1.addOneMinute();
        System.out.println(c1.displayTime());
    }
    public static void room() {
        Room[] rooms = new Room[6];
        // TODO
    }
}
