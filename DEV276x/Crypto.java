package DEV276x;

public class Crypto {

    public static Boolean isAlphaNumeric(char element) {
        char[] punctuation = {',', '.', '\"', '!', '?', ' ', ':', ';', '(', ')', '\''};
        for (int i = 0; i < punctuation.length; i++) {
            if (punctuation[i] == (element)) {
                return false;
            }
        }
        return true;
    }

    public static String normalize(String sentence) {
        char[] stringToIterate = sentence.toCharArray();
        String normalizedString = "";
       for (int i = 0; i < stringToIterate.length; i ++) {
           if (isAlphaNumeric(stringToIterate[i])) {
               normalizedString += stringToIterate[i];
           }
       }
       return normalizedString.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(normalize("This is some \"really\" great. (Text)!?"));

    }
}
