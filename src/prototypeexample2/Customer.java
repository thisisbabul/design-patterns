package prototypeexample2;

public class Customer {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.loadBooks();

        BookShop shop1 = shop.clone();
        shop.getBooks().remove(1);

        System.out.println(shop);
        System.out.println(shop1);
    }
}
