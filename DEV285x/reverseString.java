package DEV285x;

public class reverseString {
    public static String reverseString(String someString) {
        char temp = 'c';
        char a = 'c';
        for (int i = 0; i < someString.length(); i++) {
            if (someString.length() -1 - i > -1) {
                temp = someString.charAt(someString.length() -1 - i);
                System.out.println(temp + " " + i);
                a = someString.charAt(i);
                someString = someString.replace(someString.charAt(i), someString.charAt(someString.length() -1 - i));
                someString = someString.replace(someString.charAt(someString.length() -1 - i), a);
                temp = someString.charAt(someString.length() -1 - i);
            }


        }

        return someString;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("able"));
        System.out.println("cat".replace('c', 'b'));
    }
}
