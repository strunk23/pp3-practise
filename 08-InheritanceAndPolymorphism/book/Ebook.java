package book;

public class Ebook extends Book {

    private final String filename;

    public Ebook(String title, String author, String filename, String name, String city, int yearOfPublication) {
        super(title, author, name, city, yearOfPublication);

        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void display() {
        System.out.println("Title: " + title + ", author: " + author + ", filename: " + filename);
    }
}
