# Online Course Management System

## Overview

The Online Course Management System is a Java-based application designed to simplify the management of educational courses in an online setting. It allows instructors to create, update, and manage courses, while students can enroll and participate in these courses.

## Features

- **Course Creation and Management:** Instructors can create new courses, update existing course details, and manage course offerings.
- **Student Enrollment:** Students can enroll in courses and access course materials.
- **Dynamic Course Catalog:** A list of available courses that students can browse and join.

## Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven (for dependency management and running tests)

### Installing and Running

1. **Clone the repository:**
   ```
   git clone https://github.com/EduPlatform/OnlineCourseManagement.git
   ```
2. **Navigate to the project directory:**
   ```
   cd OnlineCourseManagement
   ```
3. **Compile the project:**
   ```
   mvn compile
   ```
4. **Run tests:**
   ```
   mvn test
   ```

## Usage

The system is primarily used through its main classes `CourseManager` and `Instructor`. Here's a simple example of how to use the system:

```java
public class Main {
    public static void main(String[] args) {
        CourseDatabase db = new CourseDatabaseImpl();
        CourseManager courseManager = new CourseManager(db);

        // Create and manage courses, register students, etc.
    }
}
```

## Contributing

Contributions to this project are welcome. If you find any bugs or have suggestions, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
