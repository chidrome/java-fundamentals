package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

    // review constructor
    public Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    // toString method
    public String toString() {
        return String.format("This restaurant is rated %d stars with the review %s from %s.", this.getStars(), this.getBody(), this.getAuthor());
    }

    // getters
    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }
}
