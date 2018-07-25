package DEV285x;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int temp;
        int min;
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        //O(n^2), terrible for larger data sets
        int[] array = {5, 2, 6, 3, 10, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
