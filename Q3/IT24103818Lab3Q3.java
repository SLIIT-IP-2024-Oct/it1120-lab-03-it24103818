import java.util.Scanner;

public class IT24103818Lab3Q3 {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the amount
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();
        
        // Define the denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] counts = new int[denominations.length]; // To store the count of each denomination
        
        // Calculate the number of notes/coins for each denomination
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = amount / denominations[i]; // Get count of current denomination
            amount %= denominations[i]; // Update the remaining amount
        }
        
        // Print the results
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes = " + counts[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
