// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: UseDivision Application

public class UseDivision {
    public static void main(String[] args) {
        // Creating instances of InternationalDivision and DomesticDivision
        InternationalDivision internationalDivision = new InternationalDivision("Global Division", "A123", "Germany", "German");
        DomesticDivision domesticDivision = new DomesticDivision("National Division", "B456", "California");

        // Displaying information using the display method
        internationalDivision.display();
        System.out.println();
        domesticDivision.display();
    }
}
