# Java Week 1 Assignment

## Project Overview

This repository contains my **Java Week 1 Assignment**, developed to strengthen my understanding of core Java programming concepts through practical console-based applications.

The assignment includes three projects:

1. **Library Management System**
2. **Banking Application**
3. **Java Collections Challenge**

These projects demonstrate concepts such as:

* Core Java
* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* Collections
* Exception Handling
* Input Validation
* Loops and Conditional Statements
* Menu-Driven Programming
* Searching and Updating Data

---

# 1. Library Management System

## Project Title

**Library Management System**

## Objective

The objective of this project is to develop a simple **console-based Library Management System** using Java.

The project demonstrates how to create and manage books using Object-Oriented Programming concepts, collections, menu-driven programming, and exception handling.

## Features

The system provides the following operations:

* Add Book
* View All Books
* Search Book by ID
* Search Book by Title
* Issue Book
* Return Book
* Remove Book
* Exit

## Technologies Used

* Java
* Eclipse IDE
* Java Collections
* ArrayList
* Scanner
* Exception Handling

## Project Structure

```text
library_management_system/
│
├── Book.java
├── Library.java
└── Main.java
```

## Class Explanation

### Book.java

The `Book` class represents a book in the library.

It stores:

* Book ID
* Book Title
* Author Name
* Availability Status

The class uses **private variables** and provides getters and setters to demonstrate **encapsulation**.

### Library.java

The `Library` class contains the main business logic of the application.

It manages books using an `ArrayList<Book>`.

It provides methods for:

* Adding books
* Viewing books
* Searching books
* Issuing books
* Returning books
* Removing books

### Main.java

The `Main` class contains the application entry point and menu-driven user interface.

It accepts user input using `Scanner` and calls the appropriate methods from the `Library` class.

## Exception Handling

The application uses:

```java
InputMismatchException
```

to handle invalid numeric input.

For example, if the user enters:

```text
Enter Book ID: java
```

instead of a number, the application displays:

```text
Please enter digits only as Book ID.
```

This prevents the application from terminating unexpectedly because of invalid input.

## Sample Menu

```text
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
=================================
Enter your choice:
```

## Sample Output

```text
Enter your choice: 1

Enter Book ID: 101
Enter Book Title: Java Programming
Enter Author Name: Herbert Schildt

Book added successfully.
```

### View Books

```text
========== All Books ==========

ID: 101 | Title: Java Programming | Author: Herbert Schildt | Status: Available
```

### Issue Book

```text
Enter Book ID to issue: 101

Book issued successfully.
```

### Return Book

```text
Enter Book ID to return: 101

Book returned successfully.
```

### Invalid Book ID

```text
Enter Book ID: java

Please enter digits only as Book ID.
```

## Concepts Demonstrated

* Class and Object
* Encapsulation
* Constructor
* Getter and Setter
* ArrayList
* Searching
* Conditional Statements
* Loops
* Exception Handling
* Input Validation
* Menu-Driven Programming

---

# 2. Banking Application

## Project Title

**Banking Application**

## Objective

The objective of this project is to create a simple **console-based Banking Application** that simulates basic banking operations.

The project demonstrates class design, methods, validation, and exception handling.

## Features

The application supports:

* Deposit Money
* Withdraw Money
* Balance Inquiry
* Exit

The application validates transaction amounts and prevents invalid operations.

## Technologies Used

* Java
* Eclipse IDE
* Scanner
* Exception Handling
* Object-Oriented Programming

## Project Structure

```text
banking_application/
│
├── BankAccount.java
└── Main.java
```

## Class Explanation

### BankAccount.java

The `BankAccount` class represents a bank account.

It maintains the account balance and provides methods to:

* Deposit money
* Withdraw money
* Check balance

The balance is kept private to demonstrate **encapsulation**.

### Main.java

The `Main` class provides the menu-driven interface and accepts input from the user.

## Sample Menu

```text
=================================
       Banking Application
=================================
1. Deposit
2. Withdraw
3. Balance Inquiry
4. Exit
=================================
Enter your choice:
```

## Sample Output

### Deposit

```text
Enter amount to deposit: 5000

Amount deposited successfully.
```

### Withdraw

```text
Enter amount to withdraw: 1000

Amount withdrawn successfully.
```

### Balance Inquiry

```text
Current Balance: 4000.0
```

## Validation

The application validates:

* Deposit amount must be greater than zero.
* Withdrawal amount must be greater than zero.
* Withdrawal amount cannot be greater than the available balance.
* Invalid input is handled using exception handling.

## Concepts Demonstrated

* Classes and Objects
* Encapsulation
* Methods
* Constructors
* Conditional Statements
* Scanner
* Exception Handling
* Input Validation
* Menu-Driven Programming

---

# 3. Java Collections Challenge

## Project Title

**Java Collections Challenge**

## Objective

The objective of this project is to demonstrate the practical use of commonly used Java Collections.

The project focuses on:

* ArrayList
* HashMap
* Queue

It demonstrates how to add, remove, update, search, retrieve, and iterate through collection elements.

## Features

### ArrayList

Demonstrates:

* Adding elements
* Removing elements
* Updating elements
* Searching elements
* Iterating through elements

### HashMap

Demonstrates:

* Adding key-value pairs
* Searching using keys
* Updating values
* Removing entries
* Iterating through entries

### Queue

Demonstrates:

* Adding elements
* Removing elements
* Viewing the front element
* Processing elements using FIFO order

## Technologies Used

* Java
* Eclipse IDE
* Java Collections Framework

## Project Structure

```text
java_collections_challenge/
│
└── CollectionChallenge.java
```

## Collection Types Used

### ArrayList

`ArrayList` is used when elements need to be stored in an ordered collection and accessed using indexes.

Example:

```java
ArrayList<String> names = new ArrayList<>();
```

### HashMap

`HashMap` stores data in key-value pairs.

Example:

```java
HashMap<Integer, String> students = new HashMap<>();
```

### Queue

`Queue` follows the **FIFO (First In, First Out)** principle.

Example:

```java
Queue<String> queue = new LinkedList<>();
```

## Concepts Demonstrated

* ArrayList
* HashMap
* Queue
* Generics
* Iteration
* Searching
* Updating
* Removing
* Java Collections Framework

---

# 4. Repository Structure

The complete repository is organized as follows:

```text
java-week1-assignment/
│
├── library_management_system/
│   ├── Book.java
│   ├── Library.java
│   └── Main.java
│
├── banking_application/
│   ├── BankAccount.java
│   └── Main.java
│
├── java_collections_challenge/
│   └── CollectionChallenge.java
│
├── screenshots/
│   ├── library/
│   ├── banking/
│   └── collections/
│
└── main_README.md
```

---

# 5. How to Run the Projects

## Step 1: Clone or Download the Repository

Download the repository from GitHub or clone it using Git.

## Step 2: Open Eclipse

Open **Eclipse IDE**.

## Step 3: Create or Import Java Project

Import the project into Eclipse.

## Step 4: Check the Package

Make sure the package name matches the Java files.

For the Library Management System:

```java
package librarymanagement;
```

## Step 5: Run the Main Class

Right-click the required `Main.java` file.

Select:

```text
Run As → Java Application
```

## Step 6: Enter Input

Follow the menu displayed in the Eclipse Console.

---

# 6. Testing

The projects were tested with different types of inputs, including valid and invalid inputs.

## Library Management System Testing

Tested operations include:

* Adding a book
* Adding a duplicate Book ID
* Viewing books
* Searching by Book ID
* Searching by title
* Issuing an available book
* Issuing an already issued book
* Returning a book
* Removing an available book
* Attempting to remove an issued book
* Entering invalid numeric input

## Banking Application Testing

Tested operations include:

* Depositing valid amounts
* Depositing invalid amounts
* Withdrawing valid amounts
* Withdrawing more than the available balance
* Checking balance
* Invalid menu input

## Collections Testing

Tested operations include:

* Adding elements
* Removing elements
* Updating elements
* Searching elements
* Iterating through collections

---

# 7. Screenshots

Screenshots of the project execution can be found in the `screenshots` folder.

## Library Management System

Add screenshots here:

```text
screenshots/library/
```

Suggested screenshots:

* Main menu
* Add Book
* View Books
* Search Book
* Issue Book
* Return Book
* Invalid input handling

## Banking Application

Add screenshots here:

```text
screenshots/banking/
```

Suggested screenshots:

* Main menu
* Deposit
* Withdraw
* Balance Inquiry

## Java Collections Challenge

Add screenshots here:

```text
screenshots/collections/
```

Suggested screenshots:

* ArrayList output
* HashMap output
* Queue output

---

# 8. Learning Outcomes

Through these projects, I practiced and strengthened my understanding of:

* Core Java programming
* Object-Oriented Programming
* Encapsulation
* Constructors
* Methods
* Collections
* ArrayList
* HashMap
* Queue
* Exception Handling
* Input Validation
* Searching
* Menu-driven applications
* Java project structure
* Debugging and testing

---

# 9. Project Explanation

## Library Management System

This project manages books in a library using an `ArrayList`.

The `Book` class stores book information, while the `Library` class performs operations such as adding, searching, issuing, returning, and removing books.

The `Main` class provides the menu and handles user interaction.

Exception handling is used to prevent the application from crashing when invalid numeric input is entered.

## Banking Application

This project simulates basic banking operations.

The `BankAccount` class manages the account balance and provides methods for deposit, withdrawal, and balance inquiry.

The application validates transaction amounts and handles invalid input.

## Java Collections Challenge

This project demonstrates the practical use of Java Collections.

`ArrayList`, `HashMap`, and `Queue` are used to understand how different collection types store and manage data.

---

# 10. Author

**Dipti Shinde**

B.E. Computer Engineering

---

# 11. Conclusion

The Java Week 1 Assignment provided practical experience in developing console-based Java applications.

The projects helped strengthen my understanding of **Core Java, Object-Oriented Programming, Collections, Exception Handling, Input Validation, and menu-driven application development**.

These projects form part of my Java learning journey and demonstrate my practical understanding of fundamental Java programming concepts.
