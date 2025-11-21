package basic.loops;
import java.util.*;
class pallindrome
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,sum=0,temp;
        System.out.println("enter any number : ");
        n = input.nextInt();
        temp=n;
        while (n!=0) {
            r=n%10;
            sum = sum*10+r;
            n=n/10;
        }
        System.out.println("Reverse of the given number is : "+ sum);
        if(sum == temp)
        System.out.println("Given number is palindrome");
        else
        System.out.println("Given number is not palindrome");
        input.close();
    }
}