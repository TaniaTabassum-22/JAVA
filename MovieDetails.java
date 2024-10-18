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
}