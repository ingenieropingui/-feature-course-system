import org.example.Course;
import org.example.Instructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.platform.commons.util.Preconditions.condition;

public class course_test {
    private Course course;
    @BeforeEach
    void setup(){
    course = new Course("C001", "Introduction to Java", a"dr.smith");
    }
     @Test
    void getCourseId() {
        course.courseid (id:course);
        assertFalse(course.getCourseid().contains(course));
    }
    
}