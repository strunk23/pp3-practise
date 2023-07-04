public class Statistics {
    int x;
    int y;

    public Statistics(int X, int Y) {
        x = X;
        y = Y;
    }

    public int itemsWithinRange() {
        int count = 0;
        for (x = 0; x < y; x++) {
            count += 1;
        }
        return count;
    }

    public int sumWithinRange() {
        int sum = 0;
        for (x = 0; x < y; x++) {
            sum += x;
        }
        return sum;
    }

    public int meanWithinRange() {
        return sumWithinRange()/itemsWithinRange();
    }
}
