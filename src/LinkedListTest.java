//Sources:https://www.javatpoint.com/junit-test-case-example-in-java#:~:text=The%20JUnit%20test%20case%20is,executed%20without%20using%20any%20tool.
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
public class LinkedListTest {
    private LinkedLists<String> l;

    @Before
    public void setUp() {
        l = new LinkedLists<>();
    }


    @Test
    public void Element1() {
        l.add("a");
        Assert.assertEquals(1, l.x());
    }


    @Test
    public void Test() {
        Assert.assertEquals(0, l.x());
    }


    @Test
    public void testElement1() {
        OneElement("a");
        String result = l.get(0);
        Assert.assertEquals("a", result);
    }

    @Test
    public void TwoElements() {
        OneElement("a");
        l.add("b");
        Assert.assertEquals(2, l.x());
    }

    private void OneElement(String value) {
        l.add(value);
    }

    @Test
    public void FromTwoElementList() {
        GivenAList("a", "b");
        String result = l.get(1);
        Assert.assertEquals("b", result);
    }

    @Test
    public void OneFromTwoElementList() {
        GivenAList("a", "b");
        String result = l.get(0);
        Assert.assertEquals("a", result);
    }

    private void GivenAList(String... elements) {
        for (String s : elements) {
            l.add(s);

        }
    }

    @Test
    public void FromTwoElementList_2() {
        GivenAList("a", "b");
        theFirstElementIsRemoved();
        Assert.assertEquals("b", l.get(0));
    }

    @Test
    public void FromTwoElementList_1() {
        GivenAList("a", "b");
        theFirstElementIsRemoved();
        Assert.assertEquals(1, l.x());
    }

    private void theFirstElementIsRemoved() {
        l.remove(0);
    }

}
