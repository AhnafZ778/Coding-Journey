package Input_output;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int mid = str.length() / 2;
        int length = str.length()-1;
        boolean flag = true;
        for (int i = 0; i < mid; i++) {
            char temp_char_1 = str.charAt(i);
            char char_1 = Character.toLowerCase(temp_char_1);
            char temp_char_2 = str.charAt(length-i);
            char char_2 = Character.toLowerCase(temp_char_2);
            if (char_1 != char_2){
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }
}
