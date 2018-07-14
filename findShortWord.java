import java.util.ArrayList;
import java.util.Arrays;

public class findShortWord {

    public static String findShortestWord(String[] arr) {
        String currentShortestWord = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currentShortestWord.length() > arr[i].length()) {
                currentShortestWord = arr[i];
            }
        }
        return currentShortestWord;
    }

    public static String findShortestWord(ArrayList<String> arr ) {
        String currentShortestWord = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (currentShortestWord.length() > arr.get(i).length()) {
                currentShortestWord = arr.get(i);
            }
        }
        return currentShortestWord;
    }

    public static void main(String[] args) {
        String[] dict = {"word", "ebony", "kingdom", "JavaScript is better"};
        ArrayList<String> array = new ArrayList<>(Arrays.asList("String", "void", "nada", "believe"));
        System.out.println(findShortestWord(dict));
        System.out.println(findShortestWord(array));
    }

}
