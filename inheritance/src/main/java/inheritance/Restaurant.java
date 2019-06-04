package inheritance;


public class Restaurant {
    private String name;
    private int rating;
    private String price;

    // restaurant constructor
    public Restaurant(String name, int rating, String price){
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    // toString method
    
    public String toString() {
        return String.format("This restaurant %s has a %d star rating and %s pricing.", this.getName(), this.getRating(), this.getPrice());
    }

    // getters
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }


}
