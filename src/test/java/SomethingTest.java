import org.testng.Assert;
import org.testng.annotations.Test;

public class SomethingTest {

    @Test
    public void testSummation()
    {
        Assert.assertEquals(2, Something.summation());
    }
}
