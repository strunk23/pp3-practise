import book.Audiobook;
import book.Book;
import book.Ebook;
import book.Library;

public class Main {
    public static void main(String[] args) {
        book();
    }

    public static void book() {
        // TODO fix inheritance

        Book b1 = new Book("Dune", "Herbert", "Publisher", "City", 2020);
        Ebook b2 = new Ebook("Dune 2", "Herbert", "Book1.txt", "Publisher", "City", 2020);
        Audiobook b3 = new Audiobook("Dune 3", "Herbert", 132, 52, "Publisher", "City", 2020);
        Library l1 = new Library();

        b1.display();
        b2.display();
        b3.display();

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        l1.displayBooks();
    }
}
