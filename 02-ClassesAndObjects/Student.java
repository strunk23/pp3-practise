public class Student {
    String name;
    byte age;
    int id;
    boolean isIdValid;
    byte semester;
    float average;

    void sayHello() {
        System.out.println("Hello!");
    }

    public byte displayAge() {
        return age;
    }

    public String displayName() {
        return name;
    }

    void displayInfo() {
        System.out.println(name + " " + age + " " + id + " " + isIdValid + " " + semester + " " + average);
    }
    void changeIdStatus(boolean status) {
        if (status) {
            isIdValid = true;
        } else {
            isIdValid = false;
        }
    }
    void idInfo() {
        if (isIdValid) {
            System.out.println(name + " " + id + " valid");
        } else {
            System.out.println(name + " " + id + " invalid");
        }
    }
}