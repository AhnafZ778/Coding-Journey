package Input_output;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number = 1;
        int previous = 0;
        if (n == 0) {
            System.out.println(0);
            return;
        } else {
            for (int i = 0; i < n - 1; i++) {
                System.out.print(previous + " ");
                int temp = number;
                number = number + previous;
                previous = temp;
            }
            System.out.print(previous);
        }
    }
}
