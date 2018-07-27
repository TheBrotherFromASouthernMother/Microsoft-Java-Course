package DEV285x;


//Merge sort is a dvidie and conquer algorithim. This means it breaks down the primary task into smaller and smaller pieces
// creating smaller and smaller problems that can be solved more easily.

import java.util.Arrays;

public class reimplementMergeSort {
    public static int[] sort(int[] array) {
        int[] left;
        int[] right;

        // Spilts the initial array into two halves recursively
        left = Arrays.copyOfRange(array, 0, (int)Math.floor(array.length / 2));
        right = Arrays.copyOfRange(array, (int)Math.floor(array.length / 2), array.length);
        if (left.length > 1) {
            left = sort(left);
        }
        if (right.length > 1) {
            right = sort(right);
        }

        // sorts and merges the halves
        return merge(left, right);
    }


    private static int[] merge(int[] leftside, int[] rightside) {
        int[] mergedArray = new int[leftside.length + rightside.length];
        int index = 0;
        int i, j;

        //loos through both arrays finding the smallest elements and adding the to mergedArray in order

        for (i = 0, j = 0; i < leftside.length && j < rightside.length; i += 0, j += 0) {
            if (leftside[i] < rightside[j]) {
                mergedArray[index] = leftside[i];
                index ++;
                i ++;
            } else {
                mergedArray[index] = rightside[j];
                index ++;
                j ++;
            }
        }

        //only one of the following while loops will execute. This step adds the leftover elements into the merged array.

        while(i < leftside.length) {
            mergedArray[index] = leftside[i];
            index ++;
            i ++;
        }

        while (j < rightside.length) {
            mergedArray[index] = rightside[j];
            index ++;
            j ++;
        }

        return mergedArray;
    }


    public static void main(String[] args) {
        int[] someUnsortedArray = {7, 7, 5, 10, 1, 4};
        System.out.println(Arrays.toString(sort(someUnsortedArray)));
    }
}
