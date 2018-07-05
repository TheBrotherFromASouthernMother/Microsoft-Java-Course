package DEV276x;

public class Caesar {
    public static String cipher(int shift, String text) {
        String upper = text.toUpperCase();
        char[] textToShift = upper.toCharArray();
        int curr;
        String shiftedText = "";
        for (int i = 0; i < textToShift.length; i++) {
            curr = (int) textToShift[i] + shift;
            System.out.println(curr);
            if ( curr > 90) {
                curr = ((curr - 65) % 26) + 65;
                System.out.println((char) curr);
            }
            shiftedText += (char) curr;
        }

        return shiftedText;

    }
    public static void main(String[] args) {
       System.out.println( cipher(3, "XYZ") );
    }
}
