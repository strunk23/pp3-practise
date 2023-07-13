package book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Object> books = new ArrayList<Object>();

    public Library() {}

    public void addBook(Object book) {
        books.add(book);
    }

    public void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
            //TODO fix displaying content of books
        }
    }
}
