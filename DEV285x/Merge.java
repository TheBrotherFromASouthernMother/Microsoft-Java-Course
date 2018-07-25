package DEV285x;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        int[] leftSide;
        int[] rightSide;


        leftSide = Arrays.copyOfRange(arr, 0, (int)Math.floor(arr.length / 2));
        rightSide = Arrays.copyOfRange(arr, (int)Math.ceil(arr.length / 2), arr.length);

        if (rightSide.length > 1) {

            rightSide = sort(rightSide);
        }
        if (leftSide.length > 1) {
            leftSide = sort(leftSide);
        }
        return merge(leftSide, rightSide);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[right.length + left.length];
        int i ;
        int j;
        int index = 0;

        for (i = 0, j = 0; i < left.length && j < right.length; i += 0, j += 0) {
            if (left[i] < right[j]) {
                result[index] = left[i];
                index ++;
                i ++;
            } else {
                result[index] = right[j];
                index ++;
                j++;
            }
        }
                // add every leftover elelment from the subarray
                while (i < left.length) {
                    result[index++] = left[i++];
                }

                // only one of these two while loops will be executed
                while (j < right.length) {
                    result[index++] = right[j++];
                }
                return result;
    }

    public static void  main(String[] args) {
        int[] array = {4, 9, 3, 7, 10};
        System.out.println( Arrays.toString(sort(array)));
    }
}
