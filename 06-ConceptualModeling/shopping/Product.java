package shopping;

public class Product extends ShoppingList {
    public boolean isFresh;
    public double price;
    public int amount;
    public double weight;
    public String eatByDate;

    public Product(int amountOfProducts, boolean isFresh, double price, int amount, double weight, String eatByDate) {
        super(amountOfProducts);

        this.isFresh = isFresh;
        this.price = price;
        this.amount = amount;
        this.weight = weight;
        this.eatByDate = eatByDate;
    }


}
