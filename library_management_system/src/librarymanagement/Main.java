
package librarymanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice = 0;

        do {

            System.out.println("\n=================================");
            System.out.println("   Library Management System");
            System.out.println("=================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");
            System.out.println("=================================");

            // Validate menu choice
            if (!scanner.hasNextInt()) {

                System.out.println("Please enter a valid number.");

                scanner.next();

                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

            case 1:

                try {

                    System.out.print("Enter Book ID: ");

                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title: ");

                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");

                    String author = scanner.nextLine();

                    Book book = new Book(id, title, author);

                    if (library.addBook(book)) {

                        System.out.println("Book added successfully.");

                    } else {

                        System.out.println("Book ID already exists.");
                    }

                } catch (InputMismatchException e) {

                    System.out.println(
                        "Please enter digits only as Book ID."
                    );

                    scanner.nextLine();
                }

                break;

            case 2:

                library.viewBooks();

                break;

            case 3:

                System.out.println("\nSearch Book By:");
                System.out.println("1. Book ID");
                System.out.println("2. Title");

                // Validate search choice
                if (!scanner.hasNextInt()) {

                    System.out.println("Please enter a valid number.");

                    scanner.next();

                    break;
                }

                int searchChoice = scanner.nextInt();
                scanner.nextLine();

                if (searchChoice == 1) {

                    try {

                        System.out.print("Enter Book ID: ");

                        int searchId = scanner.nextInt();
                        scanner.nextLine();

                        Book foundBook = library.searchById(searchId);

                        if (foundBook != null) {

                            System.out.println(foundBook);

                        } else {

                            System.out.println("Book not found.");
                        }

                    } catch (InputMismatchException e) {

                        System.out.println(
                            "Please enter digits only as Book ID."
                        );

                        scanner.nextLine();
                    }

                } else if (searchChoice == 2) {

                    System.out.print("Enter Book Title: ");

                    String searchTitle = scanner.nextLine();

                    library.searchByTitle(searchTitle);

                } else {

                    System.out.println("Invalid search choice.");
                }

                break;

            case 4:

                try {

                    System.out.print("Enter Book ID to issue: ");

                    int issueId = scanner.nextInt();
                    scanner.nextLine();

                    library.issueBook(issueId);

                } catch (InputMismatchException e) {

                    System.out.println(
                        "Please enter digits only as Book ID."
                    );

                    scanner.nextLine();
                }

                break;

            case 5:

                try {

                    System.out.print("Enter Book ID to return: ");

                    int returnId = scanner.nextInt();
                    scanner.nextLine();

                    library.returnBook(returnId);

                } catch (InputMismatchException e) {

                    System.out.println(
                        "Please enter digits only as Book ID."
                    );

                    scanner.nextLine();
                }

                break;

            case 6:

                try {

                    System.out.print("Enter Book ID to remove: ");

                    int removeId = scanner.nextInt();
                    scanner.nextLine();

                    library.removeBook(removeId);

                } catch (InputMismatchException e) {

                    System.out.println(
                        "Please enter digits only as Book ID."
                    );

                    scanner.nextLine();
                }

                break;

            case 7:

                System.out.println(
                    "Thank you for using Library Management System."
                );

                break;

            default:

                System.out.println(
                    "Invalid choice. Please select 1-7."
                );
            }

        } while (choice != 7);

        scanner.close();
    }
}

