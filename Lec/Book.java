package Lec;

public class Book {
    // Private Variables
    private String title;
    private String author;

    // Setter method

    // Setter for title
    public void setTitle(String title) {
        // validation
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Cannot be Null");
        }
    }

    // Setter for author
    public void setAuthor(String author) {
        if (!author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Cannot be Empty");
        }
    }

    // Getter method

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Main method
    public static void main(String[] args) {
        Book book1 = new Book();

        // assign the values
        book1.setTitle("Madolduwa");
        book1.setAuthor("Martin Wickramasinha");

        // call the methods
        System.out.println("Title is: " + book1.getTitle());

        System.out.println("Author is: " + book1.getAuthor());
    }
}
