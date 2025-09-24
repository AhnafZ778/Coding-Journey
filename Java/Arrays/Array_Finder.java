package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Finder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(5);
        int[] array = new int[ran];
        for (int i = 0; i < ran; i++) {
            int a = random.nextInt(10);
            array[i] = a;
        }
        System.out.println("The randomly generated array is " + Arrays.toString(array));
        boolean flag = true;
        while (flag){
            System.out.println("Which number would you like to search for?");
            int user = in.nextInt();
            boolean found = false;
            for (int i = 0; i < ran; i++) {
                if (user == array[i]){
                    found = true;
                }
            }
            if (found){
                System.out.println("Found the number " + user);
            } else{
                System.out.println("Did not find the number " + user);
            }
            System.out.println("Want to search for another number?\n1.Yes 2.No");
            int loop = in.nextInt();
            if (loop == 2){
                flag = false;
            }
    }

    }
}
