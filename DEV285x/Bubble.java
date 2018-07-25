package DEV285x;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public static String sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[arr.length -1]) {
                    break;
                }
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return Arrays.toString(arr);
    }


    public static void main(String[] args) {
        int[] array = {4,9, 7, 2, 1, 6, 10};
        System.out.println(sort(array));
    }
}
