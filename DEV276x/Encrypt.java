package DEV276x;

public class Encrypt {
    private static Crypto crypto = new Crypto();
    private static Caesar caesar = new Caesar();
    private static Groupify groupify = new Groupify();

    public static String encryptString(String text, int shift, int codeGroupSize) {
        String normalizedText = crypto.normalize(text);
        String cipheredText = caesar.cipher(shift, normalizedText);
        String encryptedText = groupify.groupText(cipheredText, 2);
        return encryptedText;
    }

    public static String decryptString(String encryptedString) {
        String ungroupedText = groupify.ungroupText(encryptedString);
        String decipheredText = caesar.decipher(1, ungroupedText);
        return decipheredText;
    }

    public static void main(String[] args) {
        String enc = encryptString("No more war", 1, 2);
        System.out.println(enc);
        String decipheredText = decryptString(enc);
        System.out.println(decipheredText) ;
    }
}
