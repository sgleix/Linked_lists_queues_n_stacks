//source:https://www.geeksforgeeks.org/array-implementation-of-queue-simple/#:~:text=To%20implement%20a%20queue%20using,stored%20in%20the%20array%20and

import java.util.NoSuchElementException;


public class ArrayQueue {

    private LLNode x, y;

    public ArrayQueue() {
        x = null;
        y = null;
    }

    public void enqueue(int v) {
        if (isEmpty()) {
            y = x = new LLNode(v);
        } else {
            y.next = new LLNode(v);
            y = y.next;
        }
    }
    public int dequeue() {
        if (isEmpty())
            throw new NoSuchElementException();
        int value = x.value;
        if (x ==y)
        {
            x = y = null;
        } else {
            x = x.next;
        }
        return value;
    }

    public boolean isEmpty() {
        return x == null;
    }


    private class LLNode {
        private LLNode next;
        private int value;

        public LLNode(int v) {
            value = v;
            next = null;
        }
    }
}
