package prototypeexample2;

public class Customer {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.setName("Rokimari");
        shop.loadBooks();

        BookShop shop1 = shop.clone();
        shop1.setName("Guri");
        shop.getBooks().remove(1);

        System.out.println(shop);
        System.out.println(shop1);
    }
}
