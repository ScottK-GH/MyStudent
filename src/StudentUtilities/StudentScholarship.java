public class StudentScholarship {
    private int scholarshipId;
    private String scholarshipName;
    private String faculty;
    private double amount;
    private String[] scholarshipCriteria;

    // Constructor
    public StudentScholarship(int scholarshipId, String scholarshipName, String faculty, double amount, String[] scholarshipCriteria) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
        this.faculty = faculty;
        this.amount = amount;
        this.scholarshipCriteria = scholarshipCriteria;
    }

    // Getters and setters (optional, for accessing and modifying the fields)
    public int getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(int scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String[] getScholarshipCriteria() {
        return scholarshipCriteria != null ? scholarshipCriteria.clone() : null;
    }

    public void setScholarshipCriteria(String[] scholarshipCriteria) {
        this.scholarshipCriteria = scholarshipCriteria != null ? scholarshipCriteria.clone() : null;
    }
}