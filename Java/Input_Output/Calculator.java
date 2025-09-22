package Input_output;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String operator = in.next();
        int c = 0;
        if (operator.equals("+")) {
            c = a + b;
        } else if (operator.equals("*")) {
            c = a * b;
        } else if (operator.equals("/")){
            c = (a / b);
        } else if (operator.equals("-")){
            c = a - b;
        } else {
            System.out.println("Invalid Operator");
        }
        System.out.println(c);
    }
}
