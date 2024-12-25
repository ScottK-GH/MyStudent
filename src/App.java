import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        MyStudent student1 = new MyStudent("John", "Doe", "12345", LocalDate.of(1990, 1, 1), "Engineering");
        MyStudent student2 = new MyStudent("Jane", "Smith", "67890", LocalDate.of(1992, 2, 2), "Arts");

        System.out.println(student1);
        System.out.println(student2);
    }
}
