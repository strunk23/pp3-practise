package shopping;

import java.util.*;

public class ShoppingList {
    public HashMap<String, String> products = new HashMap<String, String>();
    public int amountOfProducts;
    private final ArrayList<String> toBeRemoved = new ArrayList<String>();

    public ShoppingList(int amountOfProducts) {
        this.amountOfProducts = amountOfProducts;
        //this.products = new HashMap<String, String>();
    }

    public void displayProducts() {
        // TODO fix removing elements from ArrayList
        if (this.toBeRemoved.size() > 0) {
            for (int i = 0; i < this.toBeRemoved.size()+1; i++) {
                System.out.println(this.toBeRemoved.get(i));
                products.remove(this.toBeRemoved.get(i) + 1);
            }
        }
        System.out.println(products);

        Iterator<String> itr = products.keySet().iterator();
        for (String key: products.keySet()) {
            System.out.println(key + " = " + products.get(key));
        }
    }

    public void amountOfProductsToBePurchased() {
        int diff = this.amountOfProducts - products.size();
        if ((diff) < 0) {


            System.out.println("Product limit exceeded!");
        }
        System.out.println(diff);
    }

    public void addProduct(String isFresh, String price, String amount, String weight, String eatByDate) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = input.next();
        products.put(name, Arrays.toString(new String[]{isFresh, price, amount, weight, eatByDate}));
    }
}
