package Loops_Conditionals;

import java.util.Scanner;

public class Harry_conditionals {
    public static void main(String[] args) {
//        int a = 10;
//        if (a == 11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        int find = c.indexOf(".");
        String code = c.substring(find+1);
        switch (code){
            case "com" -> System.out.println("Commercial Website");
            case "org" -> System.out.println("Organizational Website");
            case "bd" -> System.out.println("Bangladeshi Website");
        }


    }
}
