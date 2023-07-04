public class CinemaTicket {
    String cinema;
    String title;
    int rowNumber;
    int seatNumber;
    float price;
    public CinemaTicket(String cinameName, String filmTitle, int row, int seat) {
        cinema = cinameName;
        title = filmTitle;
        rowNumber = row;
        seatNumber = seat;

        if (rowNumber > 0 & rowNumber <= 2) {
            price = 10;
        } else {
            price = 25;
        }

    }
    private String cinameName = "Helios";

    void ticketData() {
        System.out.println(cinameName + " " + title + " " + " " + rowNumber + " " + seatNumber + " " + price);
    }
}
