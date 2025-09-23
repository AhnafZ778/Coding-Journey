package Loops_Conditionals;

import java.util.Scanner;

public class Switch_Shenanigans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Anime = in.nextLine();
        switch (Anime) {
            case "Naruto" -> System.out.println("Dattebayo!!");
            case "Bleach" -> System.out.println("Bankai!!");
            case "DBZ" -> System.out.println("I will not let you destroy my WORLLLDDD!!");
            case "One Piece" -> System.out.println("Kaizokuoni orewa naru!!");
            default -> System.out.println("Please input on of the Big Four of Anime");
        }
    }
}
