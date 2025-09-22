import java.util.Scanner;

public class Function2 {
     public static int calculateMult(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mult = calculateMult(a, b);
        System.out.println("Multiply of Two number is :" + mult);

        sc.close();
    }
}
