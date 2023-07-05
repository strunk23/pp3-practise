public class Main {
    public static void main(String[] args) {
        //license();
        //product();
    }
    public static void license() {
        DrivingLicense d1 = new DrivingLicense();

        d1.setName("josh");
        d1.setSurname("Baker");
        d1.setAddress("City");
        d1.setCity("New York");
        d1.setPostalCode("12-345");
        d1.setLicenseNumber(123456);
        d1.setYearOfIssue(2022);
        d1.setLicenseCategory("B");

        System.out.println(d1.displayLicenseInfo());
    }
    public static void product() {
        Product p1 = new Product();

        p1.setProductName("Apple");
        p1.setIsVegetarian(true);

        p1.displayProductInfo();
    }
}
