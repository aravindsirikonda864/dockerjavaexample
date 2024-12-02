import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
