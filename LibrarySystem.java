public class LibrarySystem {

    public static void main(String[] args) {
        
        addBook("The Alchemist");
        addBook("The Great Gatsby", "F. Scott Fitzgerald");
        addBook("1984", "George Orwell", 1949);

        System.out.println("\n");
        
        issueBook(101, "Jon Snow");
        issueBook("The Alchemist", "Alice");
        issueBook("Harry Potter", 102);

        System.out.println("\n");
        
        returnBook("Jon Snow", 101);
        returnBook(102, "Alice");
        returnBook("George Orwell", "1984");

        System.out.println("\n");
        
        System.out.println("Total books available: " + calculateTotalBooks(100, 120, 90, 60, 150));

        
        System.out.println("\nInvoking all methods:");
        addBook("The Hobbit");
        addBook("Moby Dick", "Herman Melville");
        addBook("Pride and Prejudice", "Jane Austen", 1813);
        issueBook(103, "Bob");
        issueBook("The Hobbit", "Charlie");
        issueBook("Pride and Prejudice", 104);
        returnBook("Eve", 105);
        returnBook(106, "Tom");
        returnBook("J.K. Rowling", "Harry Potter");
    }

    // changing the number of parameters
    public static void addBook(String title) {
        System.out.println("Book added: " + title);
    }

    public static void addBook(String title, String author) {
        System.out.println("Book added: " + title + " by " + author);
    }

    public static void addBook(String title, String author, int year) {
        System.out.println("Book added: " + title + " by " + author + ", Published in " + year);
    }

    // changing the data type
    public static void issueBook(int bookId, String borrowerName) {
        System.out.println("Book ID: " + bookId + " issued to " + borrowerName);
    }

    public static void issueBook(String title, String borrowerName) {
        System.out.println("Book: " + title + " issued to " + borrowerName);
    }

    public static void issueBook(String title, int bookId) {
        System.out.println("Book ID: " + bookId + ", Title: " + title + " issued.");
    }


    // changing the order of parameters
    public static void returnBook(String borrowerName, int bookId) {
        System.out.println("Borrower: " + borrowerName + " returned Book ID: " + bookId);
    }

    public static void returnBook(int bookId, String borrowerName) {
        System.out.println("Book ID: " + bookId + " returned by " + borrowerName);
    }

    public static void returnBook(String author, String title) {
        System.out.println("Book: " + title + " by " + author + " returned.");
    }


    public static int calculateTotalBooks(int... books) {
        int total = 0;
        for (int book : books) {
            total += book;
        }
        return total;
    }
}
