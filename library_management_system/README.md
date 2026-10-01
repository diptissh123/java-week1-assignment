# Library Management System

## Objective

The Library Management System is a console-based Java application developed to manage books and perform basic library operations.

## Features

- Add a new book
- View all books
- Search book by ID
- Search book by title
- Issue a book
- Return a book
- Remove a book
- Exit the application

## Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- Collections
- Eclipse IDE

## Project Structure

```text
library_management_system/
├── src/
│   └── librarymanagement/
│       ├── Book.java
│       ├── Library.java
│       └── Main.java
└── README.md


## Classes

### Book
Stores book information such as:
- Book ID
- Title
- Author
- Availability

### Library
Manages library operations such as:
- Adding books
- Viewing books
- Searching books
- Issuing books
- Returning books
- Removing books

### Main
Runs the application and provides the menu-driven user interface.

## How to Run

1. Open the project in Eclipse.
2. Open `Main.java`.
3. Run `Main.java` as a Java Application.
4. Select an option from the menu.
5. Follow the instructions displayed in the console.

## Sample Output

```text
===== Library Management System =====
1. Add Book
2. View All Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit