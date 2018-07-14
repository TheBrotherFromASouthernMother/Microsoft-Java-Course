package DEV277x;

public class Fraction {
    private int numerator;
    private  int denominator;
    public Fraction(int numerator, int denominator) {
        if (denominator == 0 ) {
            throw new IllegalArgumentException();
        } else if (denominator < 0 ) {
            denominator = Math.abs(denominator);
            numerator = numerator * -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }
    public String getFraction() {
       return "" + this.numerator + "/" +  this.denominator;
    }
}
