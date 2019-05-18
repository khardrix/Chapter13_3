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

public class Chapter13_3 {

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(5, 12);
        Fraction fraction2 = new Fraction(3, 7);
        Fraction fraction3 = new Fraction(3, 4);
        Fraction fraction4 = new Fraction(9, 12);
        Fraction fraction5 = new Fraction(7, 8);
        Fraction fraction6 = new Fraction(1, 3);

        System.out.println(fraction1);
        System.out.println(fraction2);
        System.out.println(fraction3);
        System.out.println(fraction4);
        System.out.println(fraction5);
        System.out.println(fraction6);

        System.out.println(fraction1.equals(fraction2));
        System.out.println(fraction1.compareTo(fraction2));

        System.out.println(fraction3.equals(fraction4));
        System.out.println(fraction3.compareTo(fraction4));

        System.out.println(fraction5.equals(fraction6));
        System.out.println(fraction5.compareTo(fraction6));
    }
}
