package prototypeexample2;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String name;
    private List<Book> books = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {
        for (int i = 0; i<10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("Book" + i);
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book book: getBooks()) {
            shop.getBooks().add(book);
        }
        return shop;
    }
}
