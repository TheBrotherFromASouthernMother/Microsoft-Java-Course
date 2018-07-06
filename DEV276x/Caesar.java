package DEV276x;

public class Caesar {

    public static String cipher(int shift, String text) {
        String upper = text.toUpperCase();
        char[] textToShift = upper.toCharArray();
        int current;
        String shiftedText = "";
        for (int i = 0; i < textToShift.length; i++) {
            current = (int) textToShift[i] + shift;
            if ( current > 90) {
                current = ((current - 65) % 26) + 65;
            }
            shiftedText += (char) current;
        }
        return shiftedText;
    }

    public static String decipher(int deshift, String cipherText) {
        String checkedCasing = cipherText.toUpperCase();
        int current;
        String decipheredText = "";
        for (int i = 0; i <checkedCasing.length() ; i++) {
            current = (int) checkedCasing.charAt(i) - deshift;
            if (current < 65) {
                current = ((current + 65) % 26) + 65;
            }
            decipheredText += (char) current;
        }
        return decipheredText;
    }

    public static void main(String[] args) {
       System.out.println( cipher(3, "XYZ") );
    }
}
