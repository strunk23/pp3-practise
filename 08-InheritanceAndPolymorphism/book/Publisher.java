package book;

public class Publisher {
    private String name;
    private String city;

    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }
    public String getCity() {
        return this.city;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCity(String newCity) {
        this.name = newCity;
    }
}
