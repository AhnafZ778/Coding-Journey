package String;

public class Harry_Codes {
    public static void main(String[] args) {
        String name = "Ahnaf";
        String letter = "Dear <|name|>";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
        upper(letter);
    }
    static void upper(String a){
        String b = a.toUpperCase();
        System.out.println(b);
    }
}
