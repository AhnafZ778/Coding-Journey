package Loops_Conditionals;

import java.util.*;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        String number = in.nextLine();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char character = number.charAt(i);
            int num = character - '0';
            sum += num;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}
