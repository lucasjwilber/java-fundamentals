package inheritance;

import java.util.ArrayList;

public class Theater extends Reviewable {

    ArrayList<String> movies = new ArrayList<>();

    public Theater (String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }
    public void removeMovie(String movie) {
        this.movies.remove(movies.indexOf(movie));
    }

    public void addReview(int rating, String author, String body, String movie) {
        if (rating > 5 || rating < 0) {
            System.out.println("Please enter a rating from 0 to 5.");
        } else {
            Review review = new MovieReview(rating, movie, author, body);
            this.reviews.add(review);
            this.totalReviews++;
            this.ratingSum += rating;
            this.rating = (float) ratingSum / totalReviews;
        }
    }
}