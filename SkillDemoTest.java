import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void last3Test() {
        assertEquals("triton", SkillDemo.last3("triton")); //failing test
    }
}
