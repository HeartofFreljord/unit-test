package calculator;

public class Calculator {
    public static void main(String[] args) {
        double a = 2.5;
        double b = 6.4;
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
        System.out.println(sum(a,b));
        System.out.println(subtract(a,b));
    }

    public static double multiply(double a, double b) {
        return a*b;
    }
    public static double divide(double a, double b) {
        if (b!=0) {
            return a/b;
        } else {
            throw new RuntimeException("Cannot divided by 0");
        }
    }
    public static double sum(double a, double b) {
        return a+b;
    }
    public static double subtract(double a, double b) {
        return a-b;
    }
}
