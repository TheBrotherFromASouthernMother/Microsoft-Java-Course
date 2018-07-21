package DEV285x;

public class LinearSearch {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 && arr[i] != target) {
                return -1;
            } else if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 10, 22};
        System.out.println(search(array, 7));
    }
}
