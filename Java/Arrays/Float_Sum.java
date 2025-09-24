package Arrays;

import java.util.Scanner;

public class Float_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give size of desired Array: ");
        int n = in.nextInt();
        float sum = 0f;
        float[] array = new float[n];
        System.out.println("Please input " + n + " numbers");
        for (int i = 0; i < n; i++) {
            float number = in.nextFloat();
            sum += number;
        }
        System.out.println("Your total sum is: " + sum);
    }
}
