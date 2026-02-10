import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "Python Guide", "Guido"));
        library.addBook(new Book(3, "Data Structures", "Mark"));

        while (true) {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Sort by Title");
            System.out.println("5. Sort by Author");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        library.displayBooks();
                        break;

                    case 2:
                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();
                        library.issueBook(issueId);
                        break;

                    case 3:
                        System.out.print("Enter Book ID to return: ");
                        int returnId = sc.nextInt();
                        System.out.print("Enter late days: ");
                        int days = sc.nextInt();
                        library.returnBook(returnId, days);
                        break;

                    case 4:
                        library.sortByTitle();
                        break;

                    case 5:
                        library.sortByAuthor();
                        break;

                    case 6:
                        System.out.println("Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (BookNotAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
