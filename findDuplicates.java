import java.util.*;


public class findDuplicates {
    public static Map findDuplicatesInString(String sentence) {
        sentence = sentence.toLowerCase();
        Map duplicates = new HashMap();
        char current;
        for (int i = 0; i < sentence.length(); i++) {
            current = sentence.charAt(i);
            if (duplicates.containsKey(current)) {
                duplicates.put(current, (int) duplicates.get(current) + 1);

            } else {
                duplicates.put(current, 1);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicatesInString("I am I"));
    }
}
