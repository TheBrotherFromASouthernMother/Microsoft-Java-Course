//*Given an array* (e.g. `[1, 2, 5, 10, 20]`)
// *double the numbers and only return values equal to or greater than 10*

import java.util.ArrayList;
import java.util.Arrays;

public class challenge1 {
    private static ArrayList <Integer > doubleValGreaterThanTen(int[] someArray) {
        ArrayList <Integer> DoubledValues = new ArrayList<>();
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] *= 2;
            if (someArray[i] >= 10) {
                DoubledValues.add(someArray[i]);
            }
        }
        return DoubledValues;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(doubleValGreaterThanTen(arr));
    }
}
