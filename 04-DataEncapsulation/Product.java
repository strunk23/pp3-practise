public class Product {
    private String productName;
    private boolean isVegetarian;

    public String getProductName() {
        return productName;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public void displayProductInfo() {
        System.out.println(productName + " " + isVegetarian);
    }
}
