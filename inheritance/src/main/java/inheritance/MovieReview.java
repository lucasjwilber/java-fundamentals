package inheritance;

public class MovieReview extends Review {
    String movie;
    public MovieReview(int rating, String movie, String author, String body) {
        if (rating < 0 || rating > 5) {
            System.out.println("Please choose a rating between 0 and 5");
        } else {
            this.rating = rating;
            this.movie = movie;
            this.author = author;
            this.body = body;
        }
    }
    public String toString() {
        return String.format("\nRating: %d, Movie: %s, Author: %s, Body: %s", this.rating, this.movie, this.author, this.body);
    }
}
