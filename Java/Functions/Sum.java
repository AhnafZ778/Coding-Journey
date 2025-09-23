package Functions;

import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        sum();
        int product = multiply(5, 10);
        System.out.println("Product is: " + product);
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 01: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 02: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
