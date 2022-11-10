//Source://https://www.javatpoint.com/junit-test-case-example-in-java#:~:text=The%20JUnit%20test%20case%20is,executed%20without%20using%20any%20tool.

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


public class QueueTest {
    private ArrayQueue queue;

    @Before
    public void test(){
        queue = new ArrayQueue();
    }

    @Test
    public void Enqueue(){
        queue.enqueue(5);
    }

    @Test
    public void Dequeue() {
        queue.enqueue(5);
        Assert.assertTrue(5==queue.dequeue());
    }


    @Test
    public void Empty(){
        Assert.assertTrue(queue.isEmpty());
    }
    @Test
    public void NotEmpty(){
        queue.enqueue(5);
        Assert.assertTrue(!queue.isEmpty());
    }







 }




