# Library Management System

## Overview
The Library Management System is a Java-based application designed for university libraries to manage their book loan processes. It allows library staff to handle book inventories and provides functionalities for students to borrow and return books.

## Features
- Facilitate the borrowing and returning of books by students.
- Manage book availability.
- Register new students and track their borrowed books.

## Getting Started

### Prerequisites
- Java JDK 17 or higher.
- Maven (for dependency management and running tests).

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/YourUsername/LibraryManagementSystem.git
   ```
2. Navigate to the project directory:
   ```
   cd LibraryManagementSystem
   ```
3. Compile the project:
   ```
   mvn compile
   ```

### Running Tests
Run the following command to execute the unit tests:
```
mvn test
```

## Usage
The system is mainly interacted with through the `LoanManager` class, which interfaces with a `CourseDatabase` to perform operations. See the sample usage in the `Main.java` class.

## Contributing
Contributions to the project are welcome! Please feel free to fork the repository and submit pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
