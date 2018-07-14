package DEV277x;

public class Fraction {
    private int numerator;
    private  int denominator;

    public Fraction(Integer numerator) {
        this(numerator, 1);
    }

    public Fraction() {
        this(0, 1);
    }

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

    public String toString() {
       return "" + this.numerator + "/" +  this.denominator;
    }

    public double toDouble() {
        return (numerator / denominator);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
      return this.denominator;
    }

    public double add(double fraction) {
        return (this.numerator / this.denominator) + fraction;
    }

    public double subtract(double fraction) {
        return (this.numerator / this.denominator) + fraction;
    }




}
