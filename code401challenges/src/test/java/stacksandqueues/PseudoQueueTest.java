package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueueTest()
    {
        PseudoQueue pqueue = new PseudoQueue<>();
        pqueue.enqueue(10);
        pqueue.enqueue(15);
        pqueue.enqueue(20);
        pqueue.enqueue(5);

        pqueue.dequeue();
        pqueue.dequeue();
        pqueue.dequeue();

        assertEquals(5, pqueue.dequeue());
    }

    @Test
    public void dequeueTest()
    {
        PseudoQueue pqueue = new PseudoQueue<>();
        pqueue.enqueue(20);
        pqueue.enqueue(15);
        pqueue.enqueue(10);
        pqueue.enqueue(5);

        assertEquals(20, pqueue.dequeue());
    }
}