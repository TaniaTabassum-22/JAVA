public class MovieDetails {

    static Movie[] movieData = new Movie[10];

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010);
        Movie movie2 = new Movie("Parasite", "Bong Joon Ho", "Thriller", 2019);
        Movie movie3 = new Movie("The Godfather", "Francis Ford Coppola", "Crime", 1972);
        Movie movie4 = new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008);
        Movie movie5 = new Movie("Pulp Fiction", "Quentin Tarantino", "Crime", 1994);
        Movie movie6 = new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", 2014);
        Movie movie7 = new Movie("Spirited Away", "Hayao Miyazaki", "Animation", 2001);
        Movie movie8 = new Movie("Fight Club", "David Fincher", "Drama", 1999);
        Movie movie9 = new Movie("Whiplash", "Damien Chazelle", "Drama", 2014);

        saveMovie(movie1);
        saveMovie(movie2);
        saveMovie(movie3);
        saveMovie(movie4);
        saveMovie(movie5);
        saveMovie(movie6);
        saveMovie(movie7);
        saveMovie(movie8);
        saveMovie(movie9);

        // Displaying movie details
        System.out.println("\nMovie details:");
        for (int i = 0; i < movieData.length; i++) {
            if (movieData[i] != null) {
                movieData[i].MovieDetails();
            }
        }

        // Find movies by title and director
        System.out.println("\nFind Movies:");
        Movie foundTitle = findByMovieTitle("Inception");
        Movie foundDirector = findByDirector("Christopher Nolan");
        if (foundTitle != null) foundTitle.MovieDetails();
        if (foundDirector != null) foundDirector.MovieDetails();

        // Update movie genre and year
        System.out.println("\nUpdate Movies:");
        updateMovieGenre("Inception", "Thriller");
        updateMovieYear("Parasite", 2020);
        System.out.println("Updated Movie Details:");
        for (int i = 0; i < movieData.length; i++) {
            if (movieData[i] != null) {
                movieData[i].MovieDetails();
            }
        }
    }

    // Method to save movie in the array
    public static boolean saveMovie(Movie movie) {
        for (int i = 0; i < movieData.length; i++) {
            if (movieData[i] == null) {
                movieData[i] = movie;
                System.out.println("Movie is saved");
                return true;
            }
        }
        System.out.println("The movie list is full, no more movies can be added.");
        return false;
    }

    // Find movie by title
    public static Movie findByMovieTitle(String title) {
        for (int i = 0; i < movieData.length; i++) {
            if (movieData[i] != null && movieData[i].title.equals(title)) {
                System.out.println("Movie found by title: " + title);
                return movieData[i];
            }
        }
        System.out.println("Movie not found with title: " + title);
        return null;
    }

    // Find movie by director
    public static Movie findByDirector(String director) {
        for (int i = 0; i < movieData.length; i++) {
            if (movieData[i] != null && movieData[i].director.equals(director)) {
                System.out.println("Movie found by director: " + director);
                return movieData[i];
            }
        }
        System.out.println("Movie not found with director: " + director);
        return null;
    }

    // Update movie genre
    public static boolean updateMovieGenre(String title, String newGenre) {
        for (int i = 0; i < movieData.length; i++) {
            if (movieData[i] != null && movieData[i].title.equals(title)) {
                movieData[i].genre = newGenre;
                System.out.println("Updated genre for movie: " + title);
                return true;
            }
        }
        System.out.println("Genre not updated. Movie not found with title: " + title);
        return false;
    }

    // Update movie year
    public static boolean updateMovieYear(String title, int newYear) {
        for (int i = 0; i < movieData.length; i++) {
            if (movieData[i] != null && movieData[i].title.equals(title)) {
                movieData[i].year = newYear;
                System.out.println("Updated year for movie: " + title);
                return true;
            }
        }
        System.out.println("Year not updated. Movie not found with title: " + title);
        return false;
    }
}