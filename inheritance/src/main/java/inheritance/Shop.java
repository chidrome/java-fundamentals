package inheritance;

public class Shop {
    private String name;
    private String description;
    private String price;

    // shop constructor
    public Shop(String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // toString method
    public String toString() {
        return String.format("This shop %s has a description %s and a %s pricing.", this.getName(), this.getDescription(), this.getPrice());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
}
