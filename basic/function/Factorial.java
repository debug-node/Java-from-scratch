import java.util.Scanner;

public class Factorial {
    public static void PrintFact(int n) {

        if(n<0){
            System.out.println("Please enter positive integer");
            return;
        }
        int fact = 1;
        for (int i = n; i >=1; i--) {
            fact=fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintFact(n);
        sc.close();
    }
}
