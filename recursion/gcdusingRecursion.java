package recursion;

import java.util.Scanner;

public class gcdusingRecursion {
    public static int gcd(int num1,int num2){
        if(num2!=0){
            return gcd(num2,num1%num2);
        }
        else{
            return num1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a = input.nextInt();
        System.out.println("enter second number : ");
        int b = input.nextInt();
        int result = gcd(a,b);
        System.out.println("Result is : "+ result);
        input.close();
    }
}
