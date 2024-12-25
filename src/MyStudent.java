import java.time.LocalDate;
import java.util.Objects;
public class MyStudent {
    private String firstName;
    private String lastName;
    private String studentId;
    private LocalDate dateOfBirth;
    private String faculty;

    // Constructor
    public MyStudent(String firstName, String lastName, String studentId, LocalDate dateOfBirth, String faculty) {
        this.firstName = Objects.requireNonNull(firstName, "First name cannot be null");
        this.lastName = Objects.requireNonNull(lastName, "Last name cannot be null");
        this.studentId = Objects.requireNonNull(studentId, "Student ID cannot be null");
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    // Optionally, you can add setter methods if you need to modify the fields after object creation
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // Optionally, override the toString() method for a readable representation of the object
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
