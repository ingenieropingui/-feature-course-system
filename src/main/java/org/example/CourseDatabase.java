package org.example;

import java.util.List;

public interface CourseDatabase {
    void saveCourse(Course course);
    void deleteCourse(String courseId);
    Course getCourseById(String courseId);
    List<Course> getCoursesByInstructorId(String instructorId);
    // Additional methods to interact with the database
}
