import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        SC sc = new SC();
        List<String> test = new ArrayList<>();
        test.add("");
        test.add(" ");
        test.add("t");
        test.add("the");
        ListExamples.filter(test, sc);
        List<String> check = new ArrayList<>();
        check.add(" ");
        check.add("t");
        check.add("the");
        assertEquals(check, ListExamples.filter(test, sc));
    }

    public void testMerge(){

    }
}
