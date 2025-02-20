import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Week8 {
    public static void main(String[] args) {
        // Database connection parameters
        String jdbcUrl = "jdbc:mysql://localhost:3306/librarydb";
        String dbUsername = "your_username";
        String dbPassword = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Add a book");
                System.out.println("2. Check out a book");
                System.out.println("3. Exit");
                System.out.print("Select an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addBook(connection, scanner);
                        break;
                    case 2:
                        checkOutBook(connection, scanner);
                        break;
                    case 3:
                        System.out.println("Exiting the program.");
                        connection.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addBook(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO books (title, author, available) VALUES (?, ?, ?)");
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, author);
        preparedStatement.setBoolean(3, true);

        int rowsInserted = preparedStatement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Failed to add the book.");
        }

        preparedStatement.close();
    }

    private static void checkOutBook(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter book ID to check out: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        // Check if the book is available
        PreparedStatement checkAvailability = connection
                .prepareStatement("SELECT available FROM books WHERE book_id = ?");
        checkAvailability.setInt(1, bookId);
        boolean available = false;

        try {
            available = checkAvailability.executeQuery().next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (available) {
            // Update book availability
            PreparedStatement updateAvailability = connection
                    .prepareStatement("UPDATE books SET available = ? WHERE book_id = ?");
            updateAvailability.setBoolean(1, false);
            updateAvailability.setInt(2, bookId);
            updateAvailability.executeUpdate();

            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("The book is not available.");
        }

        checkAvailability.close();
    }
}
