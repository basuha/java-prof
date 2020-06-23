import alishev.junit.Vector2D;
import org.junit.*;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        //assertion
        Assert.assertEquals(0,v1.length(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Assert.assertEquals(0,v1.getX(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Assert.assertEquals(0,v1.getY(),EPS);
    }

    @AfterClass
    public static void sayHello() {
        System.out.println("hello world");
    }

    @After
    public void helloForEveryTest() {
        System.out.println("hello method");
    }
}