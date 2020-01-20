package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest
{

    private Object NullPointerException;

    @Test
    public void enqueueTest()
    {
        Queue expected = new Queue();
        expected.enqueue(1);
        assertEquals(1, expected.peek());
    }

    @Test
    public void multipleEnqueueTest()
    {
        Queue expected = new Queue();
        expected.enqueue(1);
        expected.enqueue(2);
        expected.enqueue(3);
        expected.enqueue(4);
        expected.enqueue(5);
        assertEquals(1, expected.front.node_Data);
        assertEquals(5, expected.back.node_Data);
    }

    @Test
    public void dequeue()
    {
        Queue expected = new Queue();
        expected.enqueue(1);
        expected.enqueue(2);
        expected.enqueue(3);
        assertEquals(1, expected.dequeue());
    }

    @Test
    public void peek()
    {
        Queue expected = new Queue();
        expected.enqueue(10);
        expected.enqueue(20);
        expected.enqueue(30);
        assertEquals(10, expected.peek());
    }

    @Test
    public void emptyTheQueue()
    {
        Queue expected = new Queue();
        expected.enqueue(1);
        expected.enqueue(2);
        expected.enqueue(3);
        expected.enqueue(4);
        expected.enqueue(5);
        expected.dequeue();
        expected.dequeue();
        expected.dequeue();
        expected.dequeue();
        expected.dequeue();
        assertEquals(NullPointerException, expected.front);
    }

    @Test
    public void isEmpty()
    {
        Queue expected = new Queue();
        assertEquals(NullPointerException, expected.front);
    }
}