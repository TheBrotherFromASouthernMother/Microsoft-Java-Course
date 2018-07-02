
public class BinarySearch {
    static int[] arr = {1, 5, 7, 10, 12, 44, 54, 61, 65, 90, 99};

    public static String binarySearch(int[] sortedArray, int target ) {
        int max = sortedArray.length -1;
        int min = 0;
        int guess = 0;
        int numberOfGuesses = 1;
        while (sortedArray[guess] != target) {
            if (min >= max || numberOfGuesses > sortedArray.length) {
                return "target not found within dataset given";
            }
            guess = (int) Math.floor((max + min) / 2.00);
//            System.out.println(sortedArray[guess]);
            if (sortedArray[guess] == target) {
                break;
            } else if (sortedArray[guess] > target) {
                max = guess - 1;
            } else if (sortedArray[guess] < target) {
                min = guess + 1;
            }
            numberOfGuesses ++;
        }
        return target + " found at index " + guess + " after " + numberOfGuesses + " guesses";
    }


    public static void main(String []args) {
        isArraySorted isarrysorted = new isArraySorted();
        if (isarrysorted.isArraySorted(arr)) {
            System.out.println(binarySearch(arr, Integer.parseInt(args[0])));
        } else {
            System.out.println("The Array is not sorted");
        }


    }
}


class isArraySorted {
    public static Boolean isArraySorted (int[] unknownArray ) {
        int i = 1;
        int previousElement= unknownArray[0];
        while (i < unknownArray.length) {
            if (previousElement <= unknownArray[i]) {
                previousElement = unknownArray[i];
            } else if (previousElement > unknownArray[i]) {
                return false;
            }
            i ++;
            System.out.println(previousElement);
        }
        return true;
    }
}