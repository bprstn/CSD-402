// Name: Brian Preston
// Class: CSD 402 - Java Programming Module 12
// Assignment: M12 - Yearly Service Cost Calculation

public class YearlyService {
    
    // Default yearly service charge (Base price)
    private static final double STANDARD_SERVICE = 100.00;
    private static final double OIL_CHANGE_FEE = 30.00;
    private static final double TIRE_ROTATION_FEE = 20.00;

    // Method 1: No parameters - Returns the standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // Method 2: One parameter - Standard service + oil change fee
    public static double yearlyService(double oilChange) {
        return STANDARD_SERVICE + oilChange;
    }

    // Method 3: Two parameters - Standard service + oil change + tire rotation
    public static double yearlyService(double oilChange, double tireRotation) {
        return STANDARD_SERVICE + oilChange + tireRotation;
    }

    // Method 4: Three parameters - Standard service + oil change + tire rotation - coupon
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        return (STANDARD_SERVICE + oilChange + tireRotation) - coupon;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        // Test each method twice
        System.out.println("Test Case 1: Standard Service Cost: $" + yearlyService());
        System.out.println("Test Case 2: Standard Service with Oil Change: $" + yearlyService(OIL_CHANGE_FEE));
        System.out.println("Test Case 3: Standard Service with Oil Change & Tire Rotation: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_FEE));
        System.out.println("Test Case 4: Standard Service with Oil Change, Tire Rotation & $15 Coupon: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_FEE, 15.00));

        // Additional test cases with different values
        System.out.println("\nTest Case 5: Standard Service Cost: $" + yearlyService());
        System.out.println("Test Case 6: Standard Service with Oil Change: $" + yearlyService(35.00));
        System.out.println("Test Case 7: Standard Service with Oil Change & Tire Rotation: $" + yearlyService(35.00, 25.00));
        System.out.println("Test Case 8: Standard Service with Oil Change, Tire Rotation & $10 Coupon: $" + yearlyService(35.00, 25.00, 10.00));
    }
}
