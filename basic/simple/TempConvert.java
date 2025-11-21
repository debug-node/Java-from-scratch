package basic.simple;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit :");
        int Fahrenheit = sc.nextInt();

        double celsius = (Fahrenheit-32)/1.8;

        System.out.println("Celsius is " + celsius);

        sc.close();
        }
}
