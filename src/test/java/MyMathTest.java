import alishev.junit.MyMath;
import org.junit.Test;

public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowsException() {
        MyMath.divide(1,1);
        MyMath.divide(1,1);
        MyMath.divide(1,1);
        MyMath.divide(1,1);
        MyMath.divide(1,1);
        MyMath.divide(1,1);
        MyMath.divide(1,1);
    }
}
