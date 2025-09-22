package recursion;

import java.util.Scanner;

public class SumOfNUsingRecursion {

    // Recursive method to calculate sum
    public static int sum(int n) {
        if (n == 0) {
            return 0; // base case
        }
        else {
            return n + sum(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Input validation
        if (n < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int result = sum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }

        scanner.close();
    }
}

