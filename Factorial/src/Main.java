import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        // Calculate 100! and find the sum of its digits
        int sumOfDigits = calculateFactorialDigitSum(100);
        System.out.println("The sum of the digits in 100! is: " + sumOfDigits);
    }

    // Method to calculate the factorial of a number and the sum of its digits
    public static int calculateFactorialDigitSum(int number) {
        // Initialize a BigInteger to store the factorial result
        BigInteger factorial = BigInteger.ONE;

        // Calculate factorial of the given number
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // Convert the factorial result to a string to access individual digits
        String factorialStr = factorial.toString();

        // Initialize a variable to store the sum of the digits
        int sum = 0;

        // Iterate through each character (digit) in the string representation
        for (int i = 0; i < factorialStr.length(); i++) {
            // Convert the character to its numeric value and add it to the sum
            sum += Character.getNumericValue(factorialStr.charAt(i));
        }

        // Return the sum of the digits
        return sum;
    }
}