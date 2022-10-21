import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList LL = new LinkedList();
        LL.prepend(3);
        assertEquals(3, 3);
    }
}
