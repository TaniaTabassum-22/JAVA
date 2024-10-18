public class Movie {
    
    String title;
    String director;
    String genre;
    int releaseYear;

    // Default constructor
    public Movie() {
        System.out.println("No parameterized constructor");
    }

    // Parameterized constructor
    public Movie(String title, String director, String genre, int releaseYear) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // Method to print movie details
    public void MovieDetails() {
        System.out.println("Title : " + title);
        System.out.println("Director : " + director);
        System.out.println("Genre : " + genre);
        System.out.println("Release Year : " + releaseYear);
        System.out.println();
    }
}