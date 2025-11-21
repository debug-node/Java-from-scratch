package basic.loops;
import java.util.Scanner;

public class solution2 {
    public static void main(String args[]) {
       System.out.println("Enter x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();

    //    double s = Math.pow(x,n);
    //    System.out.println(s);

       int result = 1;
       //Please see that n is not too large or else result will exceed the size of int
       for(int i=0; i<n; i++) {
           result = result * x;
       }

       System.out.println("x to the power n is : "+ result);
       sc.close();
   }   
}
