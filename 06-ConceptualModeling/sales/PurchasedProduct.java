package sales;

public class PurchasedProduct {
    public String name;
    public double price;

    public PurchasedProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(name + " ," + price);
    }
}
