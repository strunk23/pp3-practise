package sales;

import java.util.HashMap;

public class Customer {
    public HashMap<String, Object> boughtProducts;
    public double funds;

    public Customer(double funds) {
        this.boughtProducts = new HashMap<String, Object>();
        this.funds = funds;
    }

    public void buyProduct(String name) {
        Seller s1 = new Seller();
        HashMap<String, String> products = Seller.getProducts();
        boughtProducts.put(name, products.get(name));
        products.remove(name);
        System.out.println(products);
        System.out.println(boughtProducts);
        System.out.println(products);
    }
}
