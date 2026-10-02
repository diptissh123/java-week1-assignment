# Banking Application

## 1. Project Title

**Banking Application**

A console-based Java application that simulates basic banking operations such as deposit, withdrawal, and balance inquiry.

---

## 2. Objective

The objective of this project is to create a simple **console-based Banking Application** using Java.

This project demonstrates:

* Class and object creation
* Encapsulation
* Methods and constructors
* Input validation
* Exception handling
* Menu-driven console interaction
* Basic banking operations

---

## 3. Features Implemented

The application provides the following features:

### 1. Deposit

* Accepts a positive deposit amount.
* Adds the amount to the account balance.
* Rejects zero or negative amounts.

### 2. Withdraw

* Accepts a positive withdrawal amount.
* Checks whether sufficient balance is available.
* Rejects withdrawals greater than the available balance.
* Rejects zero or negative amounts.

### 3. Balance Inquiry

* Displays the current account balance.

### 4. Exit

* Allows the user to safely exit the application.

### 5. Exception Handling

The application handles invalid user input using exception handling.

For example:

* Entering text instead of a number
* Invalid menu choices
* Negative amounts
* Withdrawal greater than the available balance

---

## 4. Technologies Used

| Technology         | Purpose                        |
| ------------------ | ------------------------------ |
| Java               | Programming language           |
| JDK                | Java development and execution |
| Eclipse            | Development environment        |
| Scanner            | Reading user input             |
| Exception Handling | Handling invalid input         |
| OOP                | Class design and encapsulation |

---

## 5. File Structure

```text
banking_application/
│
├── src/
│   └── banking_application/
│       ├── BankAccount.java
│       ├── BankingApp.java
│       └── Main.java
│
└── README.md
```

### Class Description

**BankAccount.java**

Responsible for:

* Maintaining account balance
* Deposit operation
* Withdrawal operation
* Returning current balance

**BankingApp.java**

Responsible for:

* Displaying the banking menu
* Accepting user input
* Calling banking operations
* Handling invalid input using exception handling

**Main.java**

Responsible for starting the application.

---

## 6. Steps to Compile and Run

### Step 1: Open the Project

Open the `banking_application` project in Eclipse.

### Step 2: Check the Package

Make sure all Java files are inside:

```text
banking_application
```

### Step 3: Compile the Program

If using the command line, navigate to the source directory and compile:

```bash
javac banking_application/*.java
```

### Step 4: Run the Program

Run the `Main.java` class.

Using the command line:

```bash
java banking_application.Main
```

### Step 5: Use the Menu

The application displays:

```text
===== BANKING APPLICATION =====

1. Deposit
2. Withdraw
3. Balance Inquiry
4. Exit

Enter your choice:
```

Enter the required option and follow the instructions.

---

## 7. Sample Input and Output

### Successful Deposit

```text
===== BANKING APPLICATION =====

1. Deposit
2. Withdraw
3. Balance Inquiry
4. Exit

Enter your choice: 1

Enter deposit amount: 5000

Deposit successful.
```

### Balance Inquiry

```text
Enter your choice: 3

Current Balance: 5000.0
```

### Successful Withdrawal

```text
Enter your choice: 2

Enter withdrawal amount: 1500

Withdrawal successful.
```

### Balance After Withdrawal

```text
Enter your choice: 3

Current Balance: 3500.0
```

### Insufficient Balance

```text
Enter your choice: 2

Enter withdrawal amount: 5000

Insufficient balance.
```

### Invalid Amount

```text
Enter your choice: 1

Enter deposit amount: -500

Deposit amount must be positive.
```

### Invalid Input

```text
Enter your choice: abc

Invalid input. Please enter a number.
```

### Exit

```text
Enter your choice: 4

Thank you for using the Banking Application.
```

---

## 8. Author Details

**Name:** Dipti Shinde

**Project:** Banking Application

---



## Conclusion

The **Banking Application** demonstrates basic Java programming concepts, object-oriented programming, input validation, exception handling, and menu-driven console interaction.

This project was developed as part of the **Java Week 1 Assignment**.
