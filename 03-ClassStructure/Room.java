public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    public Room(int number) {
        this.number = number;
        this.beds = 2;
    }

    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    void checkIn(String guestName) {
        this.guestName = guestName;
    }

    void checkOut() {
        this.guestName = null;
    }

    void isOccupied() {
        if (occupied) {
            System.out.println("Room is occupied");
        } else {
            System.out.println("Room is unoccupied");
        }
    }
}
