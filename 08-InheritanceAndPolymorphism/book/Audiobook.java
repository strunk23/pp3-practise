package book;

public class Audiobook extends Book {

    private final int minutes;
    private final int seconds;
    public Audiobook(String title, String author, int minutes, int seconds, String name, String city, int yearOfPublication) {
        super(title, author, name, city, yearOfPublication);

        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void display() {
        System.out.println("Title: " + title + ", author: " + author + ", minutes: " + minutes + ", seconds: " + seconds);
    }
}
