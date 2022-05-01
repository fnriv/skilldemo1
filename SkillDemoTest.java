import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void last3Test() {
        assertEquals("ton", SkillDemo.last3("triton")); 
    }
}
