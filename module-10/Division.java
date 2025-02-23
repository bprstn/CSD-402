// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Domestic Division Class

public class DomesticDivision extends Division {
    private String state;

    // Constructor for the DomesticDivision class
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Implement the abstract display method
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
    }
}
