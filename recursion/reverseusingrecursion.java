package recursion;

import java.util.Scanner;

public class reverseusingrecursion {
    public static int reverse(int n, int rev){
        if(n==0){
            return rev;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverse(n / 10, rev);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number : ");
        int n = input.nextInt();
        int reversed = reverse(n, 0);
        System.out.println("Reversed number is: " + reversed);
        input.close();
    }
}
