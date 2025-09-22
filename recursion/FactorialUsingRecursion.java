package recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any value : ");
        int n = input.nextInt();
        int result = fact(n);
        System.out.println("Factorial of given number is : "+ result);
        input.close();
    }
}
