import java.util.Scanner;

public class Function1 {

    /* calculate sum
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
   */

    /* PrintGreater
      public static int PrintGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    */
     
    /* SumOddEven
    public static void SumOddEven(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if number is odd
                sumOdd += i;
            } else {
                sumEven += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + sumOdd);
        System.out.println("Sum of even numbers from 1 to " + n + " = " + sumEven);
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // System.out.println("Sum of Two number is :" + sum);

        // PrintGreater(a, b);

        // SumOddEven(a);


        sc.close();
    }
}
