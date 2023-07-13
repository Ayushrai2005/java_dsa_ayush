import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create sample student and book objects
        Student student1 = new Student(1, "AYUSh   ", "ayushh@gmail.com");
        Student student2 = new Student(2, "Vineet ", "vineetfazal@gmail.com");

        Book book1 = new Book(101, "Java Programming", "Kamleeshhh");
        Book book2 = new Book(102, "Sex Education", "Vaibhav Khare");
         Book book3 = new Book(103, "How to do sex in different positions", "Shri Shubham Singh");

        // Add students and books to the library
        library.addStudent(student1);
        library.addStudent(student2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Test the functionality
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Library Management System");
            System.out.println("1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();

                    Book foundBook = library.findBookByTitle(title);
                    if (foundBook != null) {
                        library.borrowBook(student1, foundBook);
                    } else {
                        System.out.println("Book with title '" + title + "' not found or not available");
                    }
                    break;
                case 3:
                    System.out.print("Enter the book title: ");
                    title = scanner.nextLine();

                    foundBook = library.findBookByTitle(title);
                    if (foundBook != null) {
                        library.returnBook(student1, foundBook);
                    } else {
                        System.out.println("Book with title '" + title + "' not found");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            
            scanner.close()   ;
         }
        }}}

class Student {
    private int studentID;
    private String name;
    private String contactInfo;

    public Student(int studentID, String name, String contactInfo) {
        this.studentID = studentID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getter and setter methods

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.available = true; // Set book availability to true by default
    }

    // Getter and setter methods

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private List<Student> students;
    private List<Book> books;

    public Library() {
        this.students = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                return book;
            }
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author) && book.isAvailable()) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("ID: " + book.getBookID() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    public void borrowBook(Student student, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book with ID " + book.getBookID() + " has been borrowed by " + student.getName());
        } else {
            System.out.println("Book with ID " + book.getBookID() + " is not available for borrowing");
        }
    }

    public void returnBook(Student student, Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book with ID " + book.getBookID() + " has been returned by " + student.getName());
        } else {
            System.out.println("Book with ID " + book.getBookID() + " is already available");
        }
    }
}