package inheritance;

public class Theater {
    private String movieName;

    // movie constructor
    public Theater(String name){
        this.movieName = name;
    }

    // toString method
    public String toString() {
        return String.format("This theater has the movie %s.", this.getMovieName());
    }

    public String getMovieName() {
        return movieName;
    }
}
