public class Lamps {
    boolean isOn;

    void turnOn() {
        if (!isOn) {
            isOn = true;
        } else {
            System.out.println("The lamp is already on!");
        }
    }
    void turnOff() {
        if (isOn) {
            isOn = false;
        } else {
            System.out.println("The lamp is already off!");
        }
    }
    void displayStatus() {
        if (isOn) {
            System.out.println("The lamp is on!");
        } else if (!isOn) {
            System.out.println("The lamp is off!");
        }
    }
}
