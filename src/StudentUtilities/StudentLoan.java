
import java.util.Date;

public class StudentLoan {
    private int loanID;
    private double loanAmount;
    private String bank;
    private Date loanStartDate;
    private int numberOfYears;

    public StudentLoan(String loanID, double loanAmount, String bank, Date loanStartDate, int numberOfYears) {
        this.studentId = studentId;
        this.loanAmount = loanAmount;
        this.bank = bank;
        this.loanStartDate = loanStartDate;
        this.numberOfYears = numberOfYears;
    }

    // Getters and setters can be added here if needed
    
    // Getter and Setter for loanID
    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    // Getter and Setter for loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Getter and Setter for bank
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    // Getter and Setter for loanStartDate
    public Date getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    // Getter and Setter for numberOfYears
    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
}
}
