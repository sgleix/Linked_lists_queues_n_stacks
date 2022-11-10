
import org.junit.Test;
//credit :https://www.softwaretestinghelp.com/linked-list-in-java/......also, https://www.youtube.com/watch?v=ZovnBKd6O7g
//https://www.geeksforgeeks.org/stack-toarrayt-method-in-java-with-example/

public class LinkedLists<L> {
    private int x = 0;
    private Node head;


    private class Node{
        private final L value;
        private Node next;
        public Node (L value){
            this.value = value;
        }
    }




    public void add (L value){
        if (head ==null){
            head = new Node (value);
        }
        else{
            Node t = head;
            while (t.next != null){
                t = t.next;
            }
            t.next = new Node(value);
        }

    }

    public int x(){
        int y = 0;
        Node n = head;
        while (n !=null){
            y++;
            n = n.next;
        }
        return y;
    }

    public L get (int i){
        Node n = head;
        while (i > 0){
            i--;
            n = n.next;
        }
        return n.value;
    }
    public L remove (int i){
        Node n = head;
        Node previous = null;
        while (i>0){
            i--;
            previous = n;
            n = n.next;
        }
        if (previous == null)
        {
            head = n.next;
        }
        else{
            previous.next = n.next;
        }
        return n.value;
    }




}
