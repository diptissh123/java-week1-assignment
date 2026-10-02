# Library Management System

## 1. Project Title

**Library Management System**

A console-based Java application for managing books in a library, including adding, viewing, searching, issuing, returning, and removing books.

---

## 2. Objective

The objective of this project is to create a simple **console-based Library Management System** using Java.

This project demonstrates:

* Object-Oriented Programming (OOP)
* Classes and objects
* Constructors
* Encapsulation
* Getters and setters
* ArrayList collection
* Menu-driven console interaction
* Input validation
* Basic exception handling

---

## 3. Features Implemented

The application provides the following features:

### 1. Add Book

* Adds a new book to the library.
* Accepts Book ID, title, and author.
* Prevents duplicate Book IDs.

### 2. View Books

* Displays all books available in the library.
* Shows the Book ID, title, author, and availability status.

### 3. Search Book

* Searches for a book using its Book ID.
* Displays the book details when found.
* Displays an appropriate message when the book is not found.

### 4. Issue Book

* Issues an available book.
* Changes the book status to unavailable.
* Prevents issuing a book that has already been issued.

### 5. Return Book

* Returns an issued book.
* Changes the book status back to available.
* Prevents returning a book that is already available.

### 6. Remove Book

* Removes a book from the library using its Book ID.
* Prevents removal when the book does not exist.

### 7. Exit

* Allows the user to safely exit the application.

---

## 4. Technologies Used

| Technology         | Purpose                        |
| ------------------ | ------------------------------ |
| Java               | Programming language           |
| JDK                | Java development and execution |
| Eclipse            | Development environment        |
| ArrayList          | Storing books dynamically      |
| Scanner            | Reading user input             |
| OOP                | Class and object design        |
| Exception Handling | Handling invalid input         |

---

## 5. File Structure

```text id="l3f6e8"
library_management_system/
│
├── src/
│   └── library_management_system/
│       ├── Book.java
│       ├── Library.java
│       └── Main.java
│
└── README.md
```

### Class Description

**Book.java**

Responsible for storing book information such as:

* Book ID
* Book title
* Author
* Availability status

The class uses private fields and methods to maintain encapsulation.

**Library.java**

Responsible for the main library operations:

* Add book
* View books
* Search book
* Issue book
* Return book
* Remove book

It uses an `ArrayList<Book>` to store the books.

**Main.java**

Responsible for:

* Starting the application
* Displaying the menu
* Accepting user choices
* Calling the appropriate library operations

---

## 6. Steps to Compile and Run

### Step 1: Open the Project

Open the `library_management_system` project in Eclipse.

### Step 2: Check the Package

Make sure all Java files are inside:

```text id="x9nq1d"
library_management_system
```

### Step 3: Compile the Program

If using the command line, navigate to the source directory and compile:

```bash id="q9a0v5"
javac library_management_system/*.java
```

### Step 4: Run the Program

Run the `Main.java` class.

Using the command line:

```bash id="w7l8x2"
java library_management_system.Main
```

### Step 5: Use the Menu

The application displays:

```text id="m4x5q8"
=================================
   Library Management System
=================================

1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Remove Book
7. Exit

Enter your choice:
```

Enter the required option and follow the instructions.

---

## 7. Sample Input and Output

### Add Book

```text id="a6j2p1"
Enter your choice: 1

Enter Book ID: 101
Enter Book Title: Java Programming
Enter Author Name: James

Book added successfully.
```

### View Books

```text id="v8c3k6"
Enter your choice: 2

===== Book List =====

Book ID: 101
Title: Java Programming
Author: James
Status: Available
```

### Search Book

```text id="s2m7n4"
Enter your choice: 3

Enter Book ID to search: 101

Book Found!

Book ID: 101
Title: Java Programming
Author: James
Status: Available
```

### Issue Book

```text id="r5d9p3"
Enter your choice: 4

Enter Book ID to issue: 101

Book issued successfully.
```

The status changes to:

```text id="h1k8q5"
Status: Issued
```

### Return Book

```text id="b4t6y2"
Enter your choice: 5

Enter Book ID to return: 101

Book returned successfully.
```

The status changes back to:

```text id="j7f3m9"
Status: Available
```

### Remove Book

```text id="c9p2w6"
Enter your choice: 6

Enter Book ID to remove: 101

Book removed successfully.
```

### Book Not Found

```text id="n3x8k1"
Enter Book ID to search: 999

Book not found.
```

### Exit

```text id="e6q4r7"
Enter your choice: 7

Thank you for using the Library Management System.
```

---

## 8. Author Details

**Name:** Dipti Shinde

**Project:** Library Management System

---


---

## Conclusion

The **Library Management System** demonstrates Java programming fundamentals, Object-Oriented Programming, encapsulation, ArrayList collections, menu-driven console interaction, and basic validation.

This project was developed as part of the **Java Week 1 Assignment**.
