package String;
import java.util.Random;
public class Form_Word {
    public static void main(String[] args) {
        Random random = new Random();
        String[] word_set_01 = {"24,7", "multi-tier", "Juggernaut", "Phantom Lancer", "Monkey-King"};
        String[] word_set_02 = {"empowered", "skewer", "blade-fury", "juxtaposition", "jingu-mastery"};
        String[] word_set_03 = {"Reverse-polarity", "Omnislash", "Ring-of-Wukong", "Boundless-strike"};
        int word_1 = random.nextInt(word_set_01.length);
        int word_2 = random.nextInt(word_set_02.length);
        int word_3 = random.nextInt(word_set_03.length);
        String phrase = word_set_01[word_1] + " " + word_set_02[word_2] + " " + word_set_03[word_3];
        System.out.println(phrase);
    }
}
