package alishev.junit;

import java.util.Enumeration;

public class MyMath {
    public static double divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("cant divide by zero");
        return a / b;
    }
}
