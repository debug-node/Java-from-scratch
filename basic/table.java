package basic;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Display multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();

    }
    
}
