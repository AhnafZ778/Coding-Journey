package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        int[] reverse = new int[5];
        int count = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reverse[count] = array[i];
            count++;
        }
        System.out.println(Arrays.toString(reverse));
    }
}
