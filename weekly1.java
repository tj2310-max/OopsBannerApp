import java.util.Scanner;

/**
 * Class: UtilityBillCalculator
 * Purpose: Demonstrates User Input, Arithmetic Operators, and Type Conversion.
 */
public class UtilityBillCalculator {
    public static void main(String[] args) {
        // 1. Initialize Scanner for User Input
        Scanner input = new Scanner(System.in);

        // 2. Declare Variables using Good Programming Practice (camelCase)
        String customerName;
        int unitsConsumed;
        double costPerUnit;
        double serviceTaxRate = 0.12; // 12% Tax
        double fixedDiscount = 5.50;

        // 3. Collect User Data
        System.out.print("Enter Customer Name: ");
        customerName = input.nextLine();

        System.out.print("Enter Units Consumed: ");
        unitsConsumed = input.nextInt();

        System.out.print("Enter Cost per Unit: ");
        costPerUnit = input.nextDouble();

        // 4. Perform Computations (Applying Operator Precedence)
        // Base Bill = units * cost
        double baseBill = unitsConsumed * costPerUnit;
        
        // Tax Amount = base bill * 12%
        double taxAmount = baseBill * serviceTaxRate;
        
        // Final Bill = (Base + Tax) - Discount
        double finalBill = (baseBill + taxAmount) - fixedDiscount;

        // 5. Display the Result using String Concatenation and Escape Characters
        System.out.println("\n--- Monthly Electricity Bill ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Units: " + unitsConsumed + " | Rate: $" + costPerUnit);
        System.out.println("Tax (12%): $" + taxAmount);
        System.out.println("Discount Applied: -$" + fixedDiscount);
        System.out.println("--------------------------------");
        System.out.println("TOTAL PAYABLE: $" + finalBill);

        // 6. Close the Scanner
        input.close();
    }
}
