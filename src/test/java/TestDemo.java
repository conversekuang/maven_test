import junit.framework.Test;
import junit.framework.TestCase;
import demo.Parent;
public class TestDemo extends  TestCase {

    public void testDemo(){
        Parent p = new Parent();
        assertEquals("hello world", p.getName());

    }
}
