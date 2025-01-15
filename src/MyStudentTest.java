import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;

public class MyStudentTest {

    private MyStudent MakeMyStudent(String firstName, String lastName, String studentId, LocalDate dateOfBirth, String faculty) {
        return new MyStudent(firstName, lastName, studentId, dateOfBirth, faculty);
    }

    @Test
    public void Constructor_NullFirstName_ThrowsException() {
        // Arrange & Act & Assert
        assertThrows(NullPointerException.class, () -> {
            MakeMyStudent(null, "Doe", "12345", LocalDate.of(2000, 1, 1), "Engineering");
        });
    }

    @Test
    public void SetFirstName_UpdatesFirstName() {
        MyStudent student = MakeMyStudent("John", "Doe", "12345", LocalDate.of(2000, 1, 1), "Engineering");
        
        // Act
        student.setFirstName("Jane");
        
        // Assert
        assertEquals("Jane", student.getFirstName());
    }

    @Test
    public void ToString_ReturnsCorrectRepresentation() {
        MyStudent student = MakeMyStudent("John", "Doe", "12345", LocalDate.of(2000, 1, 1), "Engineering");
        
        // Act
        String result = student.toString();
        
        // Assert
        assertEquals("Student{firstName='John', lastName='Doe', studentId='12345', dateOfBirth=2000-01-01, faculty='Engineering'}", result);
    }
}