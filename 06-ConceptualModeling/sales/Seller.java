package sales;

import shopping.Product;

import java.util.HashMap;

public class Seller {
    public String companyName;
    public double funds;
    public static HashMap<String, String> products;

    public Seller(String companyName, double funds) {
        products = new HashMap<String, String>();
        this.companyName = companyName;
        this.funds = funds;
    }

    public Seller() {
        this.funds = 500.0;
    }

    public static HashMap<String, String> getProducts() {
        return products;
    }

    public void createProduct(String name, double setPrice) {
        PurchasedProduct product = new PurchasedProduct(name, setPrice);
        products.put(name, String.valueOf(setPrice));
        System.out.println(products);
    }
}
