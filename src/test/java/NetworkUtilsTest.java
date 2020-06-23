import alishev.junit.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond() throws InterruptedException {
        NetworkUtils.getConnection();
    }
}
