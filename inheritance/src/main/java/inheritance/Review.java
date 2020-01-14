package inheritance;

public class Review {
    String body;
    String author;
    int rating;
    public Review(int rating, String author, String body) {
        if (rating < 0 || rating > 5) {
            System.out.println("Please choose a rating between 0 and 5");
        } else {
            this.rating = rating;
            this.author = author;
            this.body = body;
        }
    }
    public String toString() {
        return String.format("\nRating: %d, Author: %s, Body: %s", this.rating, this.author, this.body);
    }
}
