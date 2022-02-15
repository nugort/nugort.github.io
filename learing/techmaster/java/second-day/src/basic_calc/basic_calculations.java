package basic_calc;

public class basic_calculations {
    public static double addition(double value_1, double value_2) {
        double result = value_1 + value_2;
        return result;
    }

    public static double subtraction(double minuend, double subtrahend) {
        double result = minuend - subtrahend;
        return result;
    }

    public static double multiplication(double multiplicand, double multiplier) {
        double result = multiplicand * multiplier;
        return result;
    }

    public static double division(double dividend, double divisor) {
        double result = dividend / divisor;
        return result;
    }

    public static double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        return result;
    }
}
