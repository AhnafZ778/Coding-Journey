package Input_output;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, " + name + " Welcome to Java Programming");
    }
}
