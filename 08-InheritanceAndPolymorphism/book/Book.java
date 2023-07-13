package book;

public class Book extends Publisher {
    public String title;
    public String author;
    private int yearOfPublication;

    public Book(String title, String author, String name, String city, int yearOfPublication) {
        super(name ,city);
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int newYear) {
        this.yearOfPublication = newYear;
    }

    public void display() {
        System.out.println("Title: " + title + ", author: " + author);
    }
}
