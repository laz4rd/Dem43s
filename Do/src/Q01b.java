// Design a class Movie with fields title, genre, and rating (double).
// Include constructors, getters/setters, and a method to compute a viewer
// score using a simple formula. Display details for an array of movies. (10
// Marks)

class Movie {
    String title;
    String Genre;
    double rating;

    public Movie(String title, String Genre, double rating) {
        this.title = title;
        this.Genre = Genre;
        this.rating = rating;
    }

    public String getGenre() {
        return Genre;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getScore() {
        return rating * 100;
    }
}

public class Q01b {
    public static void main(String[] args) {
        Movie m1 = new Movie(null, null, 0);
        m1.setGenre("Action");
        m1.setRating(100.0);
        m1.setTitle("Man of Steel");
        System.out.println(m1.getScore());
    }
}