import java.util.ArrayList;
import java.util.List;
import org.example.Course;
import org.example.CourseDatabase;
import org.example.CourseManager;
import org.example.Instructor;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CourseManagerTest {

    private CourseManager courseManager;
    private Instructor instructor;
    private Course course1, course2;
    @Mock
    private CourseDatabase CDB;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        courseManager = new CourseManager(CDB);
        instructor = new Instructor("I001", "Dr. Smith");
        course1 = new Course("C001", "Introduction to Java", instructor);
        course2 = new Course("C002", "Data Structures in Java", instructor);
    }
    @Test
    public void deleteCourse(){  
        //Arrange
        when(CDB.getCourseById("C001")).thenReturn(course1);
        //Assert
        assertTrue(courseManager.deleteCourse("C001"));
    }
    @Test
    public void tryDeleteNullCourse(){  
        //Arrange
        when(CDB.getCourseById("C001")).thenReturn(null);
        //Assert
        assertFalse(courseManager.deleteCourse("C001"));
    }
    @Test
    public void createCourse() {
        assertTrue(courseManager.createCourse(course1));
    }
    @Test
    public void tryCreateNullCourse(){
        assertFalse(courseManager.createCourse(null));
    }

    private Object when(Course courseById) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}