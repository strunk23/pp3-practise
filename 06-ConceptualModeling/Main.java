import account.PersonalAccount;
import file.FileInstance;
import sales.Customer;
import sales.PurchasedProduct;
import sales.Seller;
import shopping.Product;
import shopping.ShoppingList;

public class Main {
    public static void main(String[] args) {
        //file();
        //account();
        //shopping();
        sales();
    }

    public static void file() {
        FileInstance f1 = new FileInstance("file", 38.9F, ".txt", "C/desktop/folder", false);

        f1.displayInfo();
    }
    public static void account() {
        PersonalAccount p1 = new PersonalAccount(500.0, "41 0000 0000", "ING", "James", true);

        p1.deposit(500.);
        p1.displayBalance("41 0000 0000");
        p1.deposit(200.0);
        p1.displayBalance("41 0000 0000");
        p1.withdraw(600.0);
        p1.displayBalance("41 0000 0000");
    }
    public static void shopping() {
        ShoppingList s1 = new ShoppingList(3);

        s1.displayProducts();
        s1.addProduct("Yes", "5.68zł", "2", "1.5kg", "2023-09-02");
        s1.addProduct("Yes", "4.21zł", "1", "0.6kg", "2023-06-04");
        s1.addProduct("Yes", "2.89zł", "3", "1.3kg", "2023-05-21");
        s1.displayProducts();
        s1.amountOfProductsToBePurchased();
        s1.addProduct("Yes", "2.78zł", "1", "1.87kg", "2023-10-11");
        s1.displayProducts();
        s1.amountOfProductsToBePurchased();
        s1.displayProducts();
    }
    public static void sales() {
        Seller s1 = new Seller("Google", 500.0);
        Customer c1 = new Customer(100.0);
        PurchasedProduct p1 = new PurchasedProduct("Wood", 10.0);

        s1.createProduct("Wood", 10.0);
        c1.buyProduct("Wood");
        p1.displayInfo();
    }
}
