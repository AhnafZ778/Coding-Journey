package Input_output;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean check = number % 2 == 0;
        if (check) {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
