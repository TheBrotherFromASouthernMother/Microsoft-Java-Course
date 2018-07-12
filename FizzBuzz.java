public class FizzBuzz {
    public static void fizzbuzz() {
        for (int i = 0; i < 100; i++) {
            if (i % 15 == 0 && i != 0 ) {
                System.out.println(i + ". fizzbuzz");
            } else if (i % 5 == 0 && i != 0) {
                System.out.println(i + ". buzz");
            } else if (i % 3 == 0 && i != 0 ) {
                System.out.println(i + ". fizz");
            }
        }
    }


    public static void main(String[] args) {
        fizzbuzz();
    }
}
