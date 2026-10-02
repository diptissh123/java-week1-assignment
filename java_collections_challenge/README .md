# Java Collections Challenge

## 1. Project Title

**Java Collections Challenge**

---

## 2. Objective

The objective of this project is to demonstrate the practical use of commonly used Java Collections.

This project focuses on understanding and implementing:

* ArrayList
* HashMap
* Queue

The project demonstrates how to add, remove, update, search, retrieve, and iterate through collection elements.

---

## 3. Features Implemented

### ArrayList

The ArrayList section demonstrates:

* Adding elements
* Removing elements
* Updating elements
* Searching for an element
* Iterating through elements
* Displaying collection contents

### HashMap

The HashMap section demonstrates:

* Inserting key-value pairs
* Retrieving values using keys
* Updating values
* Checking whether a key exists
* Iterating through entries
* Displaying collection contents

### Queue

The Queue section demonstrates:

* Adding items to the queue
* Removing items from the queue
* Viewing the first item using `peek()`
* Displaying remaining queue elements
* Demonstrating First-In-First-Out (FIFO) processing

---

## 4. Technologies Used

* **Programming Language:** Java
* **Java Collections Framework**
* **ArrayList**
* **HashMap**
* **Queue**
* **LinkedList**
* **Eclipse IDE**
* **GitHub**

---

## 5. File Structure

```text
java_collections_challenge/
│
├── src/
│   └── collections_challenge/
│       └── JavaCollectionsChallenge.java
│
└── README.md
```

### File Description

**JavaCollectionsChallenge.java**

Contains the implementation of:

* ArrayList operations
* HashMap operations
* Queue operations

**README.md**

Contains project documentation, features, technologies, file structure, execution instructions, and sample output.

---

## 6. Steps to Compile and Run

### Step 1: Open the Project

Open the project in **Eclipse IDE**.

### Step 2: Open the Java File

Navigate to:

```text
src
└── collections_challenge
    └── JavaCollectionsChallenge.java
```

### Step 3: Compile the Program

Save the Java file using:

```text
Ctrl + S
```

Eclipse will automatically compile the program if there are no errors.

### Step 4: Run the Program

Right-click on:

```text
JavaCollectionsChallenge.java
```

Select:

```text
Run As → Java Application
```

### Step 5: View the Output

The program will display the results of the ArrayList, HashMap, and Queue operations in the Eclipse Console.

---

## 7. Sample Input and Output

### Sample Input

The collection values are added directly in the Java program.

#### ArrayList

```text
Java Basics
OOP in Practice
Spring Boot
Hibernate
```

#### HashMap

```text
101 → Amit
102 → Neha
103 → Rahul
```

#### Queue

```text
Customer1
Customer2
Customer3
```

### Sample Output

```text
========ARRAYLIST============
Books
[Java Basics, OOp in Practice, Spring Boot, Hibernate]
After removal.
[Java Basics, OOp in Practice, Advaced spring boot]
Iterating:
Java Basics
OOp in Practice
Advaced spring boot

=====Hashmap============
{101=Amit, 102=Neha, 103=Rahul}
Neha
After update.
{101=Amit, 102=priya, 103=Rahul}
Student ID 103 exists.
Iterating.
101:Amit
102:priya
103:Rahul

==========Queue==========
Queue:
[Customer1, Customer2, Customer3]
First Customer:
Customer1
Serving:
Customer1
Remaining queue: 
[Customer2, Customer3]

```

---

## 8. Author Details

**Author:** Dipti Shinde

**Project:** Java Collections Challenge

---

## Conclusion

This project demonstrates the practical use of Java Collections and helps develop an understanding of when to use different collection types.

* **ArrayList** is used for ordered dynamic lists.
* **HashMap** is used for key-value data and key-based lookup.
* **Queue** is used for sequential processing using the First-In-First-Out (FIFO) approach.

The project follows basic Java coding standards and demonstrates collection operations through a simple Java application.
