public class Counters {
    byte initialValue = 0;

    void changeByOne(String sign) {
        if (sign == "+") {
            initialValue += 1;
        } else if (sign == "-") {
            initialValue -= 1;
        }
    }
    void changeByTen(String sign) {
        if (sign == "+") {
            initialValue += 10;
        } else if (sign == "-") {
            initialValue -= 10;
        }
    }
    void displayCounter() {
        System.out.println(initialValue);
    }
    void resetCounter() {
        initialValue = 0;
    }
}
