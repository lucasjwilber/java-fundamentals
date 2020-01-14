package inheritance;

public class Restaurant {
    String name;
    int rating;
    int price;
    public Restaurant (String name, int price) {
        this.name = name;
        this.price = price;
        this.rating = 1;
    }
    public String toString() {
        return String.format("Name: %s, Rating: %d, Price: %d", this.name, this.rating, this.price);
    }
}
