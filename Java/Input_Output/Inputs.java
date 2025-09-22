package Input_Output;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your roll number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is: " + rollno);
        String name = input.nextLine();
        System.out.println("Your name is: " + name);
    }
}
