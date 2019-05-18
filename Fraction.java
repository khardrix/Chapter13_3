/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                        Chapter 13: Problem 2                                             *****
 *****__________________________________________________________________________________________________________*****
 *****                        3.  Create a Fraction class that implements Comparable.                           *****
 *****            The Fraction class will consist of two int instance data, numerator and denominator,          *****
 ***** accessor methods for both, a toString to return numerator + " / " +  denominator, and a compareTo method.*****
 *****                     The compareTo method will receive an Object, not a Fraction.                         *****
 *****            To obtain that Fraction's numerator and denominator, you will have to do a downcast,          *****
 *****              for instance if the parameter is f, then otherNum = ((Fraction)f).getNumerator();           *****
 *****               To compare two Fractions, multiply both numerators by the other's denominator and          *****
 *****                          then subtract the other's numerator from this numerator.                        *****
 *****                      For instance, 5/12 and 3/7 would be 5 * 7 - 3 * 12 = -1 (5/12 < 3/7)                *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

public class Fraction implements Comparable {

    private int numerator;
    private int denominator;

    public Fraction(){
        this.numerator = -1;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }

    @Override
    public boolean equals(Object obj) {
        return ((this.numerator == ((Fraction)obj).getNumerator()) &&
                (this.denominator == ((Fraction)obj).getDenominator()));
    }

    @Override
    public int compareTo(Object f) {
        if(((this.numerator * ((Fraction)f).getDenominator()) - (this.denominator * ((Fraction)f).getNumerator())) < 0){
            System.out.println(this.numerator + " / " + this.denominator + " < " +
                    ((Fraction)f).getNumerator() + " / " + ((Fraction)f).getDenominator());
            return -1;
        } else if(((this.numerator * ((Fraction)f).getDenominator()) - (this.denominator * ((Fraction)f).getNumerator())) > 0){
            System.out.println(this.numerator + " / " + this.denominator + " > " +
                    ((Fraction)f).getNumerator() + " / " + ((Fraction)f).getDenominator());
            return 1;
        } else {
            System.out.println(this.numerator + " / " + this.denominator + " = " +
                    ((Fraction)f).getNumerator() + " / " + ((Fraction)f).getDenominator());
            return 0;
        }
    }
}
