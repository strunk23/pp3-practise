public class Books {
    String title;
    String author;
    short pages;
    boolean isOpen;
    float price;

    void displayInfo() {
        System.out.println(title + " " + author + " " + pages + " " + isOpen + " " + price);
    }
    void open() {
        if (isOpen) {
            System.out.println("Book already opened!");
        } else {
            isOpen = true;
        }
    }
    void close() {
        if (isOpen) {
            isOpen = false;
        } else {
            System.out.println("Book already closed!");
        }
    }
}
