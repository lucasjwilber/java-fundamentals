package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int price;
    float rating;
    int ratingSum = 0;
    int totalReviews = 0;
    ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant (String name, int price) {
        this.name = name;
        this.price = price;
        this.rating = 1f;
    }
    public void addReview(int rating, String author, String body) {
        Review review = new Review(rating, author, body);
        this.reviews.add(review);
        this.totalReviews++;
        this.ratingSum += rating;
        this.rating = (float) ratingSum / totalReviews;
    }
    public String toString() {
        return String.format("Name: %s, Rating: %f, Price: %d", this.name, this.rating, this.price);
    }
}
