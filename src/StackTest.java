//sources: https://www.geeksforgeeks.org/stack-toarrayt-method-in-java-with-example/
//https://www.javatpoint.com/junit-test-case-example-in-java#:~:text=The%20JUnit%20test%20case%20is,executed%20without%20using%20any%20tool.
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


public class StackTest {

    Stack<String> stringStack = new Stack<>();
    Stack<Integer> intStack = new Stack<>();

    @Test
    public void testMethod() {
        Assert.assertTrue("", stringStack.isEmpty());
        Assert.assertTrue("", intStack.isEmpty());
    }

    @Test
    public void testNotEmpty() {
        stringStack.push("A");
        intStack.push(1);
        Assert.assertFalse("", stringStack.isEmpty());
        Assert.assertFalse("", intStack.isEmpty());
    }

    @Test
    public void testPush() {
        stringStack.push("A");
        intStack.push(1);
        Assert.assertEquals("", "A", stringStack.top());
        Assert.assertEquals("", Integer.valueOf(1), intStack.top());

    }

    @Test
    public void testPop() {
        stringStack.push("A");
        intStack.push(1);
        Assert.assertEquals("", "A", stringStack.pop());
        Assert.assertEquals("", Integer.valueOf(1), intStack.pop());

        Assert.assertTrue("", stringStack.isEmpty());
        Assert.assertTrue("", intStack.isEmpty());

    }
}
